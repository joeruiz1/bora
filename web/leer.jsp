<%-- 
    Document   : index
    Created on : 4/09/2017, 10:28:11 AM
    Author     : Labing I5
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

    <head>
        <title>simplestyle_7</title>
        <meta name="description" content="website description" />
        <meta name="keywords" content="website keywords, website keywords" />
        <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
        <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine&amp;v1" />
        <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" />
        <link rel="stylesheet" type="text/css" href="style/style.css" />
        <link rel="stylesheet" type="text/css" href="formato.css" />
    </head>

    <body>
        <div id="main">
            <div id="header">
                <div id="logo">
                    <h1> Ar&eacute;tes Graficas Ruiz</h1>
                    <div class="slogan">Pr&eacute;stamos al Instante!</div>
                </div>
                <div id="menubar">
                    <ul id="menu">
                        <!-- put class="current" in the li tag for the selected page - to highlight which page you're on -->
                        <li ><a href="index.jsp">Crear</a></li>
                        <li><a href="Actualizar.jsp">Actualizar</a></li>
                        <li><a href="leer.jsp">Leer</a></li>
                        <li><a href="borrar.jsp">Borrar</a></li>
                        <li><a href="contact.html">Listar Todo</a></li>
                        <li><a href="activo.jsp">Crear Activo</a></li>
                    </ul>
                </div>
            </div>
            <div id="site_content">
                <div id="sidebar_container">
                    <!-- Inicio presentacion Noticias-->
                    <img class="paperclip" src="style/paperclip.png" alt="paperclip" />
                    <div class="sidebar">
                        <!-- insert your sidebar items here -->
                        <h3>&Uacute;ltimas Noticias</h3>
                                            </div>
                    <!-- Final presentacion Noticias-->



                </div>
                <div id="content">
                    <!-- insert the page content here -->
                    <h1>Registro de libros</h1>
                    <table>
                        <tr>
                            <td>Libro</td>
                            <td>autor</td>
                            <td>editorial</td>
                            <td>precio</td>                
                        </tr>
                        <%
                            if (request.getAttribute("activos") != null) {
                                ArrayList<Modelo.Libro> libros = (ArrayList<Modelo.Libro>) request.getAttribute("libros");

                                if (libros != null) {
                                    for (Modelo.Libro libro : libros) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=libro.getNombre()%></td>
                            <td><%=libro.getAutor()%></td>
                            <td><%=libro.getEditorial()%></td>
                            <td><%=libro.getPrecio()%></td>
                            <td><%=libro.getId()%></td>
                        </tr>

                        <%

                                    }
                                }
                            }
                        %>

                    </table>


                </div>
            </div>
            <div id="footer">
                <p>Copyright &copy; simplestyle_7 | <a href="http://validator.w3.org/check?uri=referer">HTML5</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> | <a href="http://www.html5webtemplates.co.uk">design from HTML5webtemplates.co.uk</a></p>
            </div>
        </div>
    </body>
</html>
