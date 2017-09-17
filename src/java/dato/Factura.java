/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

/**
 *
 * @author Juan Manuel
 */
public class Factura {
   private int id;
   private String nombreLibro;
   private int precio;
   private int cantidad;
   private String nombreCliente;

    public Factura(String nombreLibro, int precio, int cantidad, String nombreCliente,int id) {
        this.nombreLibro = nombreLibro;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombreCliente = nombreCliente;
        this.id=id;
    }
   
   

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
   
  
    
}
