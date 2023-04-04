/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

/**
 *
 * @author AD MIN
 */
public class Turnover_Form extends javax.swing.JPanel {

    private boolean show = true;

    public Turnover_Form() {
        initComponents();
        doanhThuForm1.setVisible(true);
    }

    public void hideAll() {
        doanhThu2_Form1.setVisible(false);
        doanhThuForm1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new button.Button();
        jPanel1 = new javax.swing.JPanel();
        doanhThuForm1 = new com.raven.form.TurnoverProduct_Form();
        doanhThu2_Form1 = new com.raven.form.TurnoverChart_Form();

        setBackground(new java.awt.Color(255, 255, 255));

        button1.setText("Revenue");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(doanhThuForm1, "card2");
        jPanel1.add(doanhThu2_Form1, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1035, 1035, 1035)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        hideAll();
        if (show) {
            doanhThu2_Form1.setVisible(true);
            show = false;
        } else {
            doanhThuForm1.setVisible(true);
            show = true;
        }
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button button1;
    private com.raven.form.TurnoverChart_Form doanhThu2_Form1;
    private com.raven.form.TurnoverProduct_Form doanhThuForm1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
