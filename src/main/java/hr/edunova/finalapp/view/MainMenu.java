/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.view;

import hr.edunova.finalapp.util.ApplicationInfo;

/**
 *
 * @author Dalibor
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        settings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemAnimals = new javax.swing.JMenuItem();
        jMenuItemVet = new javax.swing.JMenuItem();
        jMenuItemActivity = new javax.swing.JMenuItem();
        jMenuItemEvent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemERA = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to animall assistant app");

        jMenu.setText("Start");

        jMenuItemAnimals.setText("Animals");
        jMenuItemAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnimalsActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemAnimals);

        jMenuItemVet.setText("Vet");
        jMenuItemVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVetActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemVet);

        jMenuItemActivity.setText("Activity");
        jMenuItemActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActivityActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemActivity);

        jMenuItemEvent.setText("Event");
        jMenuItemEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEventActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemEvent);
        jMenu.add(jSeparator1);

        jMenuItemERA.setText("ERA diagram");
        jMenu.add(jMenuItemERA);
        jMenu.add(jSeparator2);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemExit);

        jMenuBar1.add(jMenu);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnimalsActionPerformed
       new WindowAnimals().setVisible(true);
    }//GEN-LAST:event_jMenuItemAnimalsActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVetActionPerformed
        new WindowVet().setVisible(true);
    }//GEN-LAST:event_jMenuItemVetActionPerformed

    private void jMenuItemActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActivityActionPerformed
       new WindowActivity().setVisible(true);
    }//GEN-LAST:event_jMenuItemActivityActionPerformed

    private void jMenuItemEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEventActionPerformed
        new WindowEvent().setVisible(true);
    }//GEN-LAST:event_jMenuItemEventActionPerformed

    private void settings() {
        setTitle(ApplicationInfo.getTitle("Main menu"));
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemActivity;
    private javax.swing.JMenuItem jMenuItemAnimals;
    private javax.swing.JMenuItem jMenuItemERA;
    private javax.swing.JMenuItem jMenuItemEvent;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemVet;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
