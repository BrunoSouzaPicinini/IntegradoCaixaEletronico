/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassConta;
import br.edu.grupointegrado.controle.ClassExtrato;
import br.edu.grupointegrado.controle.ClassMovConta;
import br.edu.grupointegrado.controle.ClassSessao;

/**
 *
 * @author Luan
 */
public class TipoExtrato extends javax.swing.JFrame {
    
    
    TelaOperacao operacao;
    TelaInicialCaixa inicial;
    ClassConta conta;
    ClassMovConta movConta;
    
    /**
     * Creates new form TelaOperacao
     */
    public TipoExtrato() {
        initComponents();
        conta = ClassSessao.getConta();
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
        jBUltimos30Dias = new javax.swing.JButton();
        jBFinalizarTipoExtrato = new javax.swing.JButton();
        jBMenuAnterior = new javax.swing.JButton();
        jBUltimosLancamentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMA DE EXTRATO");
        setAlwaysOnTop(true);
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Selecione a forma de extrato");

        jBUltimos30Dias.setBackground(new java.awt.Color(92, 102, 122));
        jBUltimos30Dias.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBUltimos30Dias.setForeground(new java.awt.Color(255, 255, 255));
        jBUltimos30Dias.setText("Últimos 30 dias");
        jBUltimos30Dias.setBorder(null);
        jBUltimos30Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUltimos30DiasActionPerformed(evt);
            }
        });

        jBFinalizarTipoExtrato.setBackground(new java.awt.Color(92, 102, 122));
        jBFinalizarTipoExtrato.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBFinalizarTipoExtrato.setForeground(new java.awt.Color(255, 255, 255));
        jBFinalizarTipoExtrato.setText("Finalizar");
        jBFinalizarTipoExtrato.setBorder(null);
        jBFinalizarTipoExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarTipoExtratoActionPerformed(evt);
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

        jBUltimosLancamentos.setBackground(new java.awt.Color(92, 102, 122));
        jBUltimosLancamentos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBUltimosLancamentos.setForeground(new java.awt.Color(255, 255, 255));
        jBUltimosLancamentos.setText("Últimos Lançamentos");
        jBUltimosLancamentos.setBorder(null);
        jBUltimosLancamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUltimosLancamentosActionPerformed(evt);
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
                            .addComponent(jBUltimosLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUltimos30Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBFinalizarTipoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBUltimosLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBUltimos30Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFinalizarTipoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        setSize(new java.awt.Dimension(896, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBUltimos30DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimos30DiasActionPerformed
        movConta = new ClassMovConta();
        ClassExtrato relatorio = new ClassExtrato(movConta.consultaMov(conta, 30));
    }//GEN-LAST:event_jBUltimos30DiasActionPerformed

    private void jBFinalizarTipoExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarTipoExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFinalizarTipoExtratoActionPerformed

    private void jBUltimosLancamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimosLancamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUltimosLancamentosActionPerformed

    private void jBMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMenuAnteriorActionPerformed

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
            java.util.logging.Logger.getLogger(TipoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoExtrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFinalizarTipoExtrato;
    private javax.swing.JButton jBMenuAnterior;
    private javax.swing.JButton jBUltimos30Dias;
    private javax.swing.JButton jBUltimosLancamentos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void setOperacao(TelaOperacao operacao) {
        this.operacao = operacao;
    }

    public void setInicial(TelaInicialCaixa inicial) {
        this.inicial = inicial;
    }

    public void setConta(ClassConta conta) {
        this.conta = conta;
    }

}
