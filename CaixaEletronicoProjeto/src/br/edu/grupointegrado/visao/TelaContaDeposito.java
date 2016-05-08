/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

/**
 *
 * @author Luan
 */
public class TelaContaDeposito extends javax.swing.JFrame {

    /**
     * Creates new form TelaOperacao
     */
    public TelaContaDeposito() {
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

        jLabel1 = new javax.swing.JLabel();
        jBOutraConta = new javax.swing.JButton();
        jBFinalizarContaDeposito = new javax.swing.JButton();
        jBMenuAnterior = new javax.swing.JButton();
        jBPropriaConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTA PARA DEPÓSITO");
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Selecione a opção desejada");

        jBOutraConta.setBackground(new java.awt.Color(92, 102, 122));
        jBOutraConta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBOutraConta.setForeground(new java.awt.Color(255, 255, 255));
        jBOutraConta.setText("Outra Conta");
        jBOutraConta.setBorder(null);
        jBOutraConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOutraContaActionPerformed(evt);
            }
        });

        jBFinalizarContaDeposito.setBackground(new java.awt.Color(92, 102, 122));
        jBFinalizarContaDeposito.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBFinalizarContaDeposito.setForeground(new java.awt.Color(255, 255, 255));
        jBFinalizarContaDeposito.setText("Finalizar");
        jBFinalizarContaDeposito.setBorder(null);
        jBFinalizarContaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarContaDepositoActionPerformed(evt);
            }
        });

        jBMenuAnterior.setBackground(new java.awt.Color(92, 102, 122));
        jBMenuAnterior.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBMenuAnterior.setForeground(new java.awt.Color(255, 255, 255));
        jBMenuAnterior.setText("Menu Anterior");
        jBMenuAnterior.setBorder(null);
        jBMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuAnteriorActionPerformed(evt);
            }
        });

        jBPropriaConta.setBackground(new java.awt.Color(92, 102, 122));
        jBPropriaConta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBPropriaConta.setForeground(new java.awt.Color(255, 255, 255));
        jBPropriaConta.setText("Própria Conta");
        jBPropriaConta.setBorder(null);
        jBPropriaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPropriaContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jBMenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPropriaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBOutraConta, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBFinalizarContaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBPropriaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBOutraConta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFinalizarContaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBOutraContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOutraContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOutraContaActionPerformed

    private void jBFinalizarContaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarContaDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFinalizarContaDepositoActionPerformed

    private void jBMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMenuAnteriorActionPerformed

    private void jBPropriaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPropriaContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPropriaContaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaContaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContaDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFinalizarContaDeposito;
    private javax.swing.JButton jBMenuAnterior;
    private javax.swing.JButton jBOutraConta;
    private javax.swing.JButton jBPropriaConta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
