/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Servicios.Inventario;
import Servicios.Servicios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Manuel
 */
public class ControlBorrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /* TODO output your page here. You may use following sample code. */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String id = request.getParameter("id");
        int ids = Integer.parseInt(id);


        
        if (id.trim().length() > 0) {
            //Abrir conexion
            Servicios servicios = new Servicios();
            //Cargar lo que hay actualmente en el archivo
            Modelo.Libro libro = new Modelo.Libro(ids);
            
            
            Inventario in = new Inventario();
             
            try {
                Inventario resultado = servicios.leer();        
                in = servicios.leer();
                for (int i = 0; i < libro.getId(); i++) {
                if(libro.getId()== ids){
                 in.deletePrestamo(i);
                    System.out.println("BORRADO");
                }else {
                    System.out.println("No BORRADO POR QUE NO SE ENCONTRO ");
                }
                    
                }
                
            } catch (ClassNotFoundException ex) {
              }
            
        }
            
//        
//      if(id!=null){
//          System.out.println("NO EXISTEN LIBROS EN LA PLATAFORMA");
//          
//      }else{
//      if(id==request.getParameter("id")){
//          Inventario i=new Inventario();
//          i.deletePrestamo(ids);
//          System.out.println("libro borrado");
//          
//      }    
//      
//
//        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
