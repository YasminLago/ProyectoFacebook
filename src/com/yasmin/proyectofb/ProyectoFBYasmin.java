package com.yasmin.proyectofb;

import com.yasmin.clases.MetodosFacebook;
import facebook4j.FacebookException;
import java.net.MalformedURLException;

/**
 * Proyecto hecho con la librería Facebook4j
 * @author Yasmín
 */
public class ProyectoFBYasmin {
    public static void main(String[] args) throws FacebookException, MalformedURLException{
       MetodosFacebook fb = new MetodosFacebook();
       
       //fb.publicarPost();
       //fb.buscarTema();
      /* fb.miInfo();
       fb.publicarPost();
       fb.publicarLink();
       fb.buscarNombre();*/
       
    fb.publicarLink();
       //fb.getPosts();
       //fb.borrarFoto();
       //fb.unLikePublicaciones();
       //fb.publicarPost();
       //fb.comentarPublicacion();
       //fb.getPostComments();
    }
    
}
