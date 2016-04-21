package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassModelo;
import br.edu.grupointegrado.ferramentas.PreencherjTableGenerico;
import br.edu.grupointegrado.controle.ClassMarca;

public class CadastroCarro extends javax.swing.JFrame {

    ClassMarca marca = new ClassMarca();
    ClassModelo modelo = new ClassModelo();
    PreencherjTableGenerico preenche = new PreencherjTableGenerico();

    public CadastroCarro() {
        initComponents();
        preenche.FormatarJtable(jTConsulta, new int[]{160, 350, 300, 180, 200});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTbPainel = new javax.swing.JTabbedPane();
        jPCadastro = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jTFCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFCodigoMarca = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFModelo = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jCbSituacao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBPesquisaMarca = new javax.swing.JButton();
        jPConsulta = new javax.swing.JPanel();
        jCBConsulta = new javax.swing.JComboBox();
        jTFConsulta = new javax.swing.JTextField();
        jBConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");

        jLabel1.setText("Código");

        jTFCodigoMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoMarcaFocusLost(evt);
            }
        });

        jTFData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataActionPerformed(evt);
            }
        });

        jCbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        jCbSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbSituacaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Código Marca");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        jLabel5.setText("Data");

        jLabel6.setText("Situação");

        jBPesquisaMarca.setText("Pesquisa Marca");
        jBPesquisaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jBNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBGravar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFCodigoMarca))
                                .addGap(18, 18, 18)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPCadastroLayout.createSequentialGroup()
                                        .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBPesquisaMarca))))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisaMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGravar)
                        .addComponent(jBCancelar)
                        .addComponent(jBExcluir)
                        .addComponent(jBAlterar)))
                .addContainerGap())
        );

        jTFCodigo.getAccessibleContext().setAccessibleName("");
        jTFCodigo.getAccessibleContext().setAccessibleDescription("");

        jTbPainel.addTab("Cadastro", jPCadastro);

        jCBConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Marca", "Modelo" }));

        jBConsulta.setText("Consulta");
        jBConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultaActionPerformed(evt);
            }
        });

        jTConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Modelo", "Situação", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTConsulta);

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jCBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBConsulta))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsulta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTbPainel.addTab("Consulta", jPConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTbPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTbPainel)
        );

        getAccessibleContext().setAccessibleName("Cadastro Carro");

        setSize(new java.awt.Dimension(430, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDataActionPerformed

    private void jBConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultaActionPerformed

        switch (jCBConsulta.getSelectedIndex()) {
            case 0: {
                jTFConsulta.setText("");
                preenche.PreencherjTableGenerico(jTConsulta, modelo.consultageral());
                break;
            }
            case 1: {
                marca.setDesmarca(jTFConsulta.getText());
                preenche.PreencherjTableGenerico(jTConsulta, marca.consutamarcadescricao());
                jTFConsulta.setText("");
                break;
            }
            case 2: {
                modelo.setDesmodelo(jTFConsulta.getText());
                preenche.PreencherjTableGenerico(jTConsulta, modelo.consutamodelo());
                jTFConsulta.setText("");
                break;
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBConsultaActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        modelo.setCodmodelo(Integer.parseInt(jTFCodigo.getText()));
        modelo.excluirmodelo();
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        limparcampos();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jTConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultaMouseClicked

        if (evt.getClickCount() == 2) {
            String x = (String) jTConsulta.getValueAt(jTConsulta.getSelectedRow(), 0);
            modelo.setCodmodelo(Integer.parseInt(x));
            modelo.retornamodelo();
            retornadados();
            marca.setCodmarca(Integer.parseInt(jTFCodigoMarca.getText()));
            marca.retornamarca();
            jTFMarca.setText(marca.getDesmarca());
            jTbPainel.setSelectedIndex(0);

        }

    }//GEN-LAST:event_jTConsultaMouseClicked

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        modelo.setCodmodelo(Integer.parseInt(jTFCodigo.getText()));
        modelo.setDesmodelo(jTFModelo.getText().toString());
        modelo.setDatacastro(jTFData.getText().toString());
        modelo.setInativo(jCbSituacao.getSelectedItem().toString());

        modelo.alterarmodelo();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jTFCodigoMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoMarcaFocusLost
        marca.setCodmarca(Integer.parseInt(jTFCodigoMarca.getText()));
        marca.retornamarca();
        jTFMarca.setText((marca.getDesmarca()).toString());
    }//GEN-LAST:event_jTFCodigoMarcaFocusLost

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        modelo.setCodmarca(Integer.parseInt(jTFCodigoMarca.getText()));
        modelo.setDesmodelo(jTFModelo.getText().toString());
        modelo.setDatacastro(jTFData.getText().toString());
        modelo.setInativo(jCbSituacao.getSelectedItem().toString());

        modelo.incluirmodelo();
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jCbSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbSituacaoActionPerformed

    private void jBPesquisaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaMarcaActionPerformed
        final ConsultaMarca consultamarca = new ConsultaMarca(this, true, marca);
        consultamarca.setVisible(true);

        consultamarca.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jTFCodigoMarca.setText(""+marca.getCodmarca()+"");
                jTFMarca.setText(marca.getDesmarca());
            }
        });


    }//GEN-LAST:event_jBPesquisaMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCarro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConsulta;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPesquisaMarca;
    private javax.swing.JComboBox jCBConsulta;
    private javax.swing.JComboBox jCbSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsulta;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCodigoMarca;
    private javax.swing.JTextField jTFConsulta;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTabbedPane jTbPainel;
    // End of variables declaration//GEN-END:variables

    public void limparcampos() {

        jTFCodigo.setText("");
        jTFCodigoMarca.setText("");
        jTFMarca.setText("");
        jTFModelo.setText("");
        jTFData.setText("");
    }

    public void retornadados() {
        jTFCodigo.setText(Integer.toString(modelo.getCodmodelo()));
        jTFCodigoMarca.setText(Integer.toString(modelo.getCodmarca()));

    }

}
