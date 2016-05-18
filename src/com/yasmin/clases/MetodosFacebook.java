package com.yasmin.clases;


import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.User;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Yasmín
 */
public class MetodosFacebook{
  
    Facebook miFacebook = new FacebookFactory().getInstance(); 
    
    /**
     * Acceso a mi información
     * @throws FacebookException 
     */
    public void miInfo() throws FacebookException{
        User user = miFacebook.getMe();
        System.out.println("Mi nombre: "+user.getName());
    }
    
    /**
     * Publicación de un post
     * @throws FacebookException 
     */
    public void publicarPost() throws FacebookException{ 
       miFacebook.postStatusMessage("Hola"); 
    }
    
    /**
     * Publicación de links
     * @throws MalformedURLException
     * @throws FacebookException 
     */
    public void publicarLink() throws MalformedURLException, FacebookException{     
        PostUpdate post = new PostUpdate(new URL("http://www.danielcastelao.org/"))
        .picture(new URL("http://www.danielcastelao.org/images/skins/castelao/images/200.jpg"))
        .name("Centro de Formación Profesional Daniel Castelao")
        .caption("danielcastelao.org")
        .description("O centro de formación profesional DANIEL CASTELAO, ubicado en Vigo dende 1976, dispón dunha ampla oferta para alumnos de Formación profesional.");
         miFacebook.postFeed(post);   
    }
    
    /**
     * Búsqueda de usuarios
     * @throws FacebookException 
     */
    public void buscarNombre() throws FacebookException{
        User u = null;
        ResponseList <User> results = miFacebook.searchUsers("Yasmin");
        System.out.println("Personas con mi nombre");
        
            for(int i=0;i<results.size();i++){
                u = results.get(i);
                System.out.println(u.getName());
            }
    } 
    
    /**
     * Sirve para darle a me gusta en publicaciones propias
     * @throws FacebookException 
     */
    public void likePublicaciones() throws FacebookException{
        miFacebook.likePhoto("121005474975884");
        miFacebook.likePost("119363355140096_130811347328630");
    }
    
    /**
     * Quita el me gusta de publicaciones
     * @throws FacebookException 
     */
    public void unLikePublicaciones() throws FacebookException{
        miFacebook.unlikePhoto("121005474975884");
        miFacebook.unlikePost("119363355140096_130811347328630");
    }
    
    /**
     * Publicación de comentario en post
     * @throws FacebookException 
     */
    public void comentarPublicacion() throws FacebookException{
        miFacebook.commentPost("119363355140096_130811347328630", "Hola");
        
    }
    
    /**
     * Obtención de comentarios de una publicación 
     * @return Muestra los comentarios hechos a esa publicación
     * @throws FacebookException 
     */
    public ResponseList <Comment> getPostComments() throws FacebookException{
        ResponseList <Comment> c = null;
        c = miFacebook.getPostComments("119363355140096_130811347328630");
        return c;
    }
}
    

