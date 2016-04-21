package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassMarca;
import br.edu.grupointegrado.ferramentas.PreencherjTableGenerico;
import javax.swing.JOptionPane;

public class ConsultaMarca extends javax.swing.JDialog {

    ClassMarca marca = new ClassMarca();
    PreencherjTableGenerico preenche = new PreencherjTableGenerico();

    public ConsultaMarca(java.awt.Frame parent, boolean modal, ClassMarca marca) {
        super(parent, modal);
        initComponents();
        this.marca = marca;
        preenche.FormatarJtable(jTbConsulta, new int[]{180, 200});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBTipoConsulta = new javax.swing.JComboBox();
        jTFConsulta = new javax.swing.JTextField();
        jBPesquisa = new javax.swing.JButton();
        jSPConsulta = new javax.swing.JScrollPane();
        jTbConsulta = new javax.swing.JTable();
        jBSelecionar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Marca");

        jCBTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Código", "Marca" }));

        jBPesquisa.setText("Pesquisa");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        jSPConsulta.setAutoscrolls(true);
        jSPConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbConsulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbConsultaMouseClicked(evt);
            }
        });
        jSPConsulta.setViewportView(jTbConsulta);

        jBSelecionar.setText("Selecionar");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jCBTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPesquisa)
                .addGap(8, 8, 8))
            .addComponent(jSPConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSelecionar)
                .addGap(29, 29, 29)
                .addComponent(jBCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSelecionar)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed

        if (jTbConsulta.getSelectedRow() >= 0) {
            dispose();
        } else {
            JOptionPane.showConfirmDialog(null, "A Pesquisa não retornou valores");
        }
    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jTbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbConsultaMouseClicked
       // marca.setCodmarca(jTbConsulta.getValueAt(Integer.parseInt(jTbConsulta.getSelected(),0)));
        marca.setDesmarca(jTbConsulta.getValueAt(jTbConsulta.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTbConsultaMouseClicked

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed

        switch (jCBTipoConsulta.getSelectedIndex()) {
            case 0: {
                jTFConsulta.setText("");
                preenche.PreencherjTableGenerico(jTbConsulta, marca.consultageral());
                break;
            }
            case 1: {
                marca.setDesmarca(jTFConsulta.getText());
                preenche.PreencherjTableGenerico(jTbConsulta, marca.consultamarca());
                jTFConsulta.setText("");
                break;
            }
    }//GEN-LAST:event_jBPesquisaActionPerformed
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JComboBox jCBTipoConsulta;
    private javax.swing.JScrollPane jSPConsulta;
    private javax.swing.JTextField jTFConsulta;
    private javax.swing.JTable jTbConsulta;
    // End of variables declaration//GEN-END:variables
}
