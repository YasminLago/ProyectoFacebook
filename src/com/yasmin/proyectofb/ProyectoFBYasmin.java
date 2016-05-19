package com.yasmin.proyectofb;

import com.yasmin.ventana.InterfazG;
import facebook4j.FacebookException;
import java.net.MalformedURLException;

/**
 * Proyecto hecho con la librería Facebook4j
 * @author Yasmín
 */
public class ProyectoFBYasmin {
    public static void main(String[] args) throws FacebookException, MalformedURLException{
       InterfazG i = new InterfazG();
       i.setVisible(true);
    }
    
}
