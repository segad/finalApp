/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.view;

import hr.edunova.finalapp.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Dalibor
 */
public class LoadingScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public LoadingScreen() {
        initComponents();
        
      Loading loading = new Loading();
      loading.start();
    }
    
     private class Loading extends Thread{

        @Override
        public void run() {
             Session s = HibernateUtil.getSession();
            if(s.getMetamodel().getEntities().size()>0){
                new Authorization().setVisible(true);
                System.out.println("Odradio sam ucitavanje baze");
                dispose();
            }else{
                JOptionPane.showMessageDialog(getRootPane(), "Problem s bazom podataka");
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FarmAnimals.jpg"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
