package cajero;

import java.awt.Color;
import javax.swing.border.EmptyBorder;

/* @author Grupo Media libra de agua */

public class InterfazDocumento extends javax.swing.JFrame {

    public InterfazDocumento() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(254,244,232));
        TextPrompt id = new TextPrompt("Escriba su numero de identificacion sin puntos ni comas", txtId);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        botonUno = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonNueve = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonCorregir = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setText("Bienvenido al Banco Media Libra de Agua");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Primero digite su umero de identificacion");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero/twitter_header_photo_1.png"))); // NOI18N

        txtId.setBackground(new java.awt.Color(254, 244, 232));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        botonUno.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonUno.setText("1");
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });

        botonDos.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonDos.setText("2");
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });

        botonTres.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonTres.setText("3");
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });

        botonCuatro.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });

        botonCinco.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCinco.setText("5");
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });

        botonSeis.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonSeis.setText("6");
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });

        botonSiete.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonSiete.setText("7");
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });

        botonOcho.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonOcho.setText("8");
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });

        botonNueve.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonNueve.setText("9");
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });

        botonCero.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCero.setText("0");
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        botonCancelar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setPreferredSize(new java.awt.Dimension(189, 51));

        botonCorregir.setBackground(new java.awt.Color(255, 255, 51));
        botonCorregir.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCorregir.setText("Corregir");
        botonCorregir.setPreferredSize(new java.awt.Dimension(189, 51));
        botonCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCorregirActionPerformed(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(51, 255, 51));
        botonContinuar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonContinuar.setText("Continuar");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Al finalizar presione continuar");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("■");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTres)
                        .addGap(10, 10, 10)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCuatro)
                        .addGap(6, 6, 6)
                        .addComponent(botonCinco)
                        .addGap(6, 6, 6)
                        .addComponent(botonSeis)
                        .addGap(10, 10, 10)
                        .addComponent(botonCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSiete)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonOcho)
                                .addGap(6, 6, 6)
                                .addComponent(botonNueve)
                                .addGap(10, 10, 10)
                                .addComponent(botonContinuar)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonUno)
                    .addComponent(botonDos)
                    .addComponent(botonTres)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCuatro)
                    .addComponent(botonCinco)
                    .addComponent(botonSeis)
                    .addComponent(botonCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSiete)
                    .addComponent(botonOcho)
                    .addComponent(botonNueve)
                    .addComponent(botonContinuar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        // TODO add your handling code here:
       String texto = txtId.getText();
       txtId.setText(texto+"1");
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        // TODO add your handling code here:
       String texto = txtId.getText();
       txtId.setText(texto+"2");
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"3");
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"4");
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"5");
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"6");
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"7");
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"8");
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        // TODO add your handling code here:
        String texto = txtId.getText();
       txtId.setText(texto+"9");
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        // TODO add your handling code here:
       String texto = txtId.getText();
       txtId.setText(texto+"0");
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonCorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCorregirActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
    }//GEN-LAST:event_botonCorregirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonCorregir;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
