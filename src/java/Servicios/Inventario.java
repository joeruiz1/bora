/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelo.Factura;
import Modelo.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class Inventario implements Serializable{
     private ArrayList<Libro> inventario;
    private ArrayList<Factura> facturas;

    public Inventario() {
        this.inventario = new ArrayList<Libro>();
        this.facturas = new ArrayList<Factura>();
    }
    
    public boolean updateInventario(int id, int cantidad){
        boolean resultado = false;
        int posicion =0;
        for (Factura factura : this.facturas) {
            if(factura.getId() == id){
               this.facturas.get(posicion).setCantidad(cantidad);
               return true;
            }
            posicion++;
        }
        return resultado;
    }
    
    public boolean deletePrestamo(int id){
        boolean resultado = false;
        for (int i = 0; i < this.facturas.size(); i++) {
           if (this.facturas.get(i).getId() == id){
             this.facturas.remove(i);
             resultado = true;
           }
        }
        return resultado;
    }
    public Factura readPrestamo(int id ){
        Factura resultado = null;
        for (Factura facturas : this.facturas) {
            if(facturas.getId() == id)
                resultado = facturas;
        }
        return resultado;
    }
    
    public void addActivo(Libro li){
       this.inventario.add(li);
    }
    
    public void addPrestamo(Factura fac){
      this.facturas.add(fac);
    }

    public ArrayList<Libro> getActivos() {
        return inventario;
    }

    public ArrayList<Factura> getPrestamos() {
        return facturas;
    }
    
}
