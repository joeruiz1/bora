/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import dato.Libro;
import dato.Serializacion;
import java.io.IOException;

/**
 *
 * @author Juan Manuel
 */
public class Servicios {
     
    public boolean escribir(Libro libro) throws IOException, ClassNotFoundException{
        Serializacion serializacion = new Serializacion();
        Inventario inven = serializacion.leer();
        if(inven == null)
             inven = new Inventario();
               
         inven.addActivo(libro);
         boolean resultado = serializacion.escribir(inven);
         return resultado;
    }
    
    public Inventario  leer() throws IOException, ClassNotFoundException{
      Serializacion serializacion = new Serializacion();
        Inventario bd = serializacion.leer();
        return bd;
    }
}
