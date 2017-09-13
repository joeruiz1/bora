/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Servicios.Inventario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Juan Manuel
 */
public class Serializacion {

    public boolean escribir(Inventario libro) throws FileNotFoundException, IOException {
        File file = new File("inventario.txt");
        System.out.println(file.getAbsolutePath());
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(libro);
        out.flush();
        out.close();
        return true;
    }

    public Inventario leer() throws IOException, ClassNotFoundException {
        File file = new File("bd.txt");
        System.out.println(file.getAbsolutePath());
        Inventario bd = null;
        if (file.exists()) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("bd.txt")));
            bd = (Inventario) in.readObject();
            in.close();
            return bd;
        }
        return bd;
    }

}
