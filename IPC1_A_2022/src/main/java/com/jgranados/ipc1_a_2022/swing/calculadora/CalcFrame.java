/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.swing.calculadora;

/**
 *
 * @author jose
 */
public class CalcFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalcFrame
     */
    public CalcFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero1Txt = new javax.swing.JTextField();
        numero2Txt = new javax.swing.JTextField();
        sumaBtn = new javax.swing.JButton();
        restaBtn = new javax.swing.JButton();
        multiBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        resultadoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sumaBtn.setText("sumar");
        sumaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaBtnActionPerformed(evt);
            }
        });

        restaBtn.setText("restar");
        restaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaBtnActionPerformed(evt);
            }
        });

        multiBtn.setText("multiplicar");
        multiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiBtnActionPerformed(evt);
            }
        });

        divBtn.setText("dividir");
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(divBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(multiBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 222, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(numero1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numero2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(restaBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(resultadoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(multiBtn)
                .addGap(18, 18, 18)
                .addComponent(divBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaBtnActionPerformed
        generarResultado(new Suma(obtenerNumero1(), obtenerNumero2()));
    }//GEN-LAST:event_sumaBtnActionPerformed

    private void restaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaBtnActionPerformed
        Operacion resta = new Resta(obtenerNumero1(), obtenerNumero2());
        generarResultado(resta);
    }//GEN-LAST:event_restaBtnActionPerformed

    private void multiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiBtnActionPerformed
        Operacion multi = new Multiplicacion(obtenerNumero1(), obtenerNumero2());
        generarResultado(multi);
    }//GEN-LAST:event_multiBtnActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        generarResultado(new Division(obtenerNumero1(), obtenerNumero2()));
    }//GEN-LAST:event_divBtnActionPerformed

    private int obtenerNumero1() {
        return Integer.valueOf(numero1Txt.getText());
    }
    
    private int obtenerNumero2() {
        return Integer.valueOf(numero2Txt.getText());
    }
    
    private void generarResultado(Operacion operacion) {
        int resultado = operacion.operar();
        resultadoLbl.setText("El total es: " + resultado);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divBtn;
    private javax.swing.JButton multiBtn;
    private javax.swing.JTextField numero1Txt;
    private javax.swing.JTextField numero2Txt;
    private javax.swing.JButton restaBtn;
    private javax.swing.JLabel resultadoLbl;
    private javax.swing.JButton sumaBtn;
    // End of variables declaration//GEN-END:variables
}
