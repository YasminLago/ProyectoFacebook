package com.yasmin.ventana;

import com.yasmin.clases.MetodosFacebook;
import facebook4j.FacebookException;
import java.net.MalformedURLException;

/**
 *
 * @author ylagorebollar
 */
public class InterfazG extends javax.swing.JFrame {

    public InterfazG() {
        initComponents();
    }
    
    MetodosFacebook mf = new MetodosFacebook();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bInfo = new javax.swing.JButton();
        bPost = new javax.swing.JButton();
        bLink = new javax.swing.JButton();
        bBuscarNombre = new javax.swing.JButton();
        bLike = new javax.swing.JButton();
        bComentar = new javax.swing.JButton();
        bVerComent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facebook Yasmin");

        bInfo.setText("Informacion");
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });

        bPost.setText("Publicar Post");
        bPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPostActionPerformed(evt);
            }
        });

        bLink.setText("Publicar Link");
        bLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLinkActionPerformed(evt);
            }
        });

        bBuscarNombre.setText("Buscar Nombre");
        bBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarNombreActionPerformed(evt);
            }
        });

        bLike.setText("Me gusta");
        bLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLikeActionPerformed(evt);
            }
        });

        bComentar.setText("Comentar Publicacion");
        bComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComentarActionPerformed(evt);
            }
        });

        bVerComent.setText("Ver comentarios de publicacion");
        bVerComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerComentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bLike)
                    .addComponent(bVerComent)
                    .addComponent(bComentar)
                    .addComponent(bBuscarNombre)
                    .addComponent(bInfo)
                    .addComponent(bPost)
                    .addComponent(bLink))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bInfo)
                .addGap(18, 18, 18)
                .addComponent(bPost)
                .addGap(18, 18, 18)
                .addComponent(bLink)
                .addGap(18, 18, 18)
                .addComponent(bBuscarNombre)
                .addGap(18, 18, 18)
                .addComponent(bLike)
                .addGap(18, 18, 18)
                .addComponent(bComentar)
                .addGap(18, 18, 18)
                .addComponent(bVerComent))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        MetodosFacebook mf = new MetodosFacebook();
        
        try {
            mf.miInfo();           
        } catch (FacebookException ex) {          
        }
    }//GEN-LAST:event_bInfoActionPerformed

    private void bPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPostActionPerformed
        try {
            mf.publicarPost();
        } catch (FacebookException ex) {
        }
    }//GEN-LAST:event_bPostActionPerformed

    private void bLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLinkActionPerformed
        try {
            mf.publicarLink();
        } catch (MalformedURLException ex) {            
        } catch (FacebookException ex) {          
        }
    }//GEN-LAST:event_bLinkActionPerformed

    private void bBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarNombreActionPerformed
        try {
            mf.buscarNombre();
        } catch (FacebookException ex) {
            
        }
    }//GEN-LAST:event_bBuscarNombreActionPerformed

    private void bLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLikeActionPerformed
        try {           
            mf.likePublicaciones();  
        } catch (FacebookException ex) {
            
        }
    }//GEN-LAST:event_bLikeActionPerformed

    private void bComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComentarActionPerformed
        try {
            mf.comentarPublicacion();
        } catch (FacebookException ex) {
        }
    }//GEN-LAST:event_bComentarActionPerformed

    private void bVerComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerComentActionPerformed
        try {
            mf.getPostComments();
        } catch (FacebookException ex) {
        }
    }//GEN-LAST:event_bVerComentActionPerformed
           
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarNombre;
    private javax.swing.JButton bComentar;
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bLike;
    private javax.swing.JButton bLink;
    private javax.swing.JButton bPost;
    private javax.swing.JButton bVerComent;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
