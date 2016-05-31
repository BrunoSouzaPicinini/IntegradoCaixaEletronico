/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassConta;
import br.edu.grupointegrado.controle.ClassSessao;
import br.edu.grupointegrado.ferramentas.DocumentoLimitado;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author BSP
 */
public class TelaIdentificacao extends javax.swing.JFrame {
    TelaInicialCaixa inicial;
    TelaOperacao operacao;
    ClassConta conta = new ClassConta();
    ClassSessao sessao;
    javax.swing.JTextField jTFComFoco;

    
   
    private StringBuffer conteudoJTFComFoco = new StringBuffer();

    public TelaIdentificacao() {
        initComponents();
        //jPFSenha.setEnabled(false);
        conteudoJTFComFoco.delete(0, conteudoJTFComFoco.length());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB3I = new javax.swing.JButton();
        jBCancelarI = new javax.swing.JButton();
        jB1I = new javax.swing.JButton();
        jBConfirmarI = new javax.swing.JButton();
        jB2I = new javax.swing.JButton();
        jBCorrigirI = new javax.swing.JButton();
        jB7I = new javax.swing.JButton();
        jB0I = new javax.swing.JButton();
        jB8I = new javax.swing.JButton();
        jB9I = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jB4I = new javax.swing.JButton();
        jB5I = new javax.swing.JButton();
        jB6I = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPFSenhaI = new javax.swing.JPasswordField();
        jTFBancoI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFContaI = new javax.swing.JTextField();
        jTFAgenciaI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jB3I.setBackground(new java.awt.Color(0, 0, 0));
        jB3I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB3I.setForeground(new java.awt.Color(255, 255, 255));
        jB3I.setText("3");
        jB3I.setBorder(null);
        jB3I.setFocusable(false);
        jB3I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3IActionPerformed(evt);
            }
        });
        getContentPane().add(jB3I);
        jB3I.setBounds(500, 240, 69, 54);

        jBCancelarI.setBackground(new java.awt.Color(255, 0, 0));
        jBCancelarI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBCancelarI.setText("Cancelar");
        jBCancelarI.setBorder(null);
        jBCancelarI.setFocusable(false);
        jBCancelarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarIActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancelarI);
        jBCancelarI.setBounds(600, 230, 120, 51);

        jB1I.setBackground(new java.awt.Color(0, 0, 0));
        jB1I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB1I.setForeground(new java.awt.Color(255, 255, 255));
        jB1I.setText("1");
        jB1I.setBorder(null);
        jB1I.setFocusable(false);
        jB1I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1IActionPerformed(evt);
            }
        });
        getContentPane().add(jB1I);
        jB1I.setBounds(340, 240, 70, 51);

        jBConfirmarI.setBackground(new java.awt.Color(51, 153, 0));
        jBConfirmarI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBConfirmarI.setText("Confirmar");
        jBConfirmarI.setBorder(null);
        jBConfirmarI.setFocusable(false);
        jBConfirmarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBConfirmarIMouseClicked(evt);
            }
        });
        jBConfirmarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarIActionPerformed(evt);
            }
        });
        getContentPane().add(jBConfirmarI);
        jBConfirmarI.setBounds(600, 360, 120, 51);

        jB2I.setBackground(new java.awt.Color(0, 0, 0));
        jB2I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB2I.setForeground(new java.awt.Color(255, 255, 255));
        jB2I.setText("2");
        jB2I.setBorder(null);
        jB2I.setFocusable(false);
        jB2I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2IActionPerformed(evt);
            }
        });
        getContentPane().add(jB2I);
        jB2I.setBounds(420, 240, 70, 51);

        jBCorrigirI.setBackground(new java.awt.Color(255, 255, 0));
        jBCorrigirI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBCorrigirI.setText("Corrigir");
        jBCorrigirI.setBorder(null);
        jBCorrigirI.setFocusable(false);
        jBCorrigirI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCorrigirIActionPerformed(evt);
            }
        });
        getContentPane().add(jBCorrigirI);
        jBCorrigirI.setBounds(600, 290, 120, 51);

        jB7I.setBackground(new java.awt.Color(0, 0, 0));
        jB7I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB7I.setForeground(new java.awt.Color(255, 255, 255));
        jB7I.setText("7");
        jB7I.setBorder(null);
        jB7I.setFocusable(false);
        jB7I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7IActionPerformed(evt);
            }
        });
        getContentPane().add(jB7I);
        jB7I.setBounds(340, 360, 70, 51);

        jB0I.setBackground(new java.awt.Color(0, 0, 0));
        jB0I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB0I.setForeground(new java.awt.Color(255, 255, 255));
        jB0I.setText("0");
        jB0I.setBorder(null);
        jB0I.setFocusable(false);
        jB0I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0IActionPerformed(evt);
            }
        });
        getContentPane().add(jB0I);
        jB0I.setBounds(420, 420, 70, 51);

        jB8I.setBackground(new java.awt.Color(0, 0, 0));
        jB8I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB8I.setForeground(new java.awt.Color(255, 255, 255));
        jB8I.setText("8");
        jB8I.setBorder(null);
        jB8I.setFocusable(false);
        jB8I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8IActionPerformed(evt);
            }
        });
        getContentPane().add(jB8I);
        jB8I.setBounds(420, 360, 70, 51);

        jB9I.setBackground(new java.awt.Color(0, 0, 0));
        jB9I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB9I.setForeground(new java.awt.Color(255, 255, 255));
        jB9I.setText("9");
        jB9I.setBorder(null);
        jB9I.setFocusable(false);
        jB9I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9IActionPerformed(evt);
            }
        });
        getContentPane().add(jB9I);
        jB9I.setBounds(500, 360, 69, 51);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Conta");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 120, 70, 30);

        jB4I.setBackground(new java.awt.Color(0, 0, 0));
        jB4I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB4I.setForeground(new java.awt.Color(255, 255, 255));
        jB4I.setText("4");
        jB4I.setBorder(null);
        jB4I.setFocusable(false);
        jB4I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4IActionPerformed(evt);
            }
        });
        getContentPane().add(jB4I);
        jB4I.setBounds(340, 300, 70, 51);

        jB5I.setBackground(new java.awt.Color(0, 0, 0));
        jB5I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB5I.setForeground(new java.awt.Color(255, 255, 255));
        jB5I.setText("5");
        jB5I.setBorder(null);
        jB5I.setFocusable(false);
        jB5I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5IActionPerformed(evt);
            }
        });
        getContentPane().add(jB5I);
        jB5I.setBounds(420, 300, 70, 51);

        jB6I.setBackground(new java.awt.Color(0, 0, 0));
        jB6I.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jB6I.setForeground(new java.awt.Color(255, 255, 255));
        jB6I.setText("6");
        jB6I.setBorder(null);
        jB6I.setFocusable(false);
        jB6I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6IActionPerformed(evt);
            }
        });
        getContentPane().add(jB6I);
        jB6I.setBounds(500, 300, 69, 51);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Identificação");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(351, 11, 219, 43);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 170, 80, 30);

        jPFSenhaI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPFSenhaI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPFSenhaI.setDoubleBuffered(true);
        jPFSenhaI.setDragEnabled(true);
        jPFSenhaI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPFSenhaIFocusGained(evt);
            }
        });
        jPFSenhaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFSenhaIActionPerformed(evt);
            }
        });
        getContentPane().add(jPFSenhaI);
        jPFSenhaI.setBounds(340, 170, 230, 40);
        jPFSenhaI.setDocument(new DocumentoLimitado(6));

        jTFBancoI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFBancoI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFBancoI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFBancoIFocusGained(evt);
            }
        });
        getContentPane().add(jTFBancoI);
        jTFBancoI.setBounds(560, 70, 230, 40);
        jTFBancoI.setDocument(new DocumentoLimitado(6));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Agencia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 70, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Banco");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 70, 100, 30);

        jTFContaI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFContaI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFContaI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFContaIFocusGained(evt);
            }
        });
        getContentPane().add(jTFContaI);
        jTFContaI.setBounds(340, 120, 230, 40);
        jTFContaI.setDocument(new DocumentoLimitado(6));

        jTFAgenciaI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFAgenciaI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFAgenciaI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFAgenciaIFocusGained(evt);
            }
        });
        jTFAgenciaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAgenciaIActionPerformed(evt);
            }
        });
        getContentPane().add(jTFAgenciaI);
        jTFAgenciaI.setBounds(200, 70, 230, 40);
        jTFAgenciaI.setDocument(new DocumentoLimitado(6));

        setSize(new java.awt.Dimension(896, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB3IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("3");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB3IActionPerformed

    private void jBCancelarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarIActionPerformed
        setVisible(false);
        inicial.setVisible(true);
    }//GEN-LAST:event_jBCancelarIActionPerformed

    private void jB1IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("1");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB1IActionPerformed

    private void jBConfirmarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarIActionPerformed

        conta.setAgencia(Integer.parseInt(jTFAgenciaI.getText()));
        conta.setBanco(Integer.parseInt(jTFBancoI.getText()));
        conta.setCdConta(Integer.parseInt(jTFContaI.getText()));
        conta.setSenha(Integer.parseInt(jPFSenhaI.getText()));

        if (conta.acessoConta() == true) {
            conta.retornaSaldo();
            ClassSessao.carregarContaSessao(conta);
            sessao.setIdentificado(1);
            System.out.println("Sessao - Com Identificação");
            sessao.incluirSessao();

            operacao = new TelaOperacao();
            operacao.setSessao(sessao);
            operacao.setInicial(inicial);
            operacao.operacao.setCdSessao(sessao.getCdSessao());
            sessao.setConta(conta);
            setVisible(false);
            operacao.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Dados Incorretos");
        }

    }//GEN-LAST:event_jBConfirmarIActionPerformed

    

    private void jB2IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("2");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB2IActionPerformed

    private void jBCorrigirIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCorrigirIActionPerformed
        if (conteudoJTFComFoco.length() > 0) {
            conteudoJTFComFoco.delete(conteudoJTFComFoco.length() - 1, conteudoJTFComFoco.length());
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jBCorrigirIActionPerformed

    private void jB7IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("7");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB7IActionPerformed

    private void jB0IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("0");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB0IActionPerformed

    private void jB8IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("8");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB8IActionPerformed

    private void jB9IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("9");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB9IActionPerformed

    private void jB4IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("4");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB4IActionPerformed

    private void jB5IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("5");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB5IActionPerformed

    private void jB6IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6IActionPerformed
        if (conteudoJTFComFoco.length() < 6) {
            conteudoJTFComFoco.append("6");
            jTFComFoco.setText(conteudoJTFComFoco.toString());
            System.out.println(conteudoJTFComFoco.toString());
        }
    }//GEN-LAST:event_jB6IActionPerformed

    private void jBConfirmarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConfirmarIMouseClicked

    }//GEN-LAST:event_jBConfirmarIMouseClicked

    private void jPFSenhaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFSenhaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFSenhaIActionPerformed

    private void jTFAgenciaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAgenciaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAgenciaIActionPerformed

    private void jTFAgenciaIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFAgenciaIFocusGained
        jTFComFoco = jTFAgenciaI;
        
        conteudoJTFComFoco.delete(0, conteudoJTFComFoco.length());
        conteudoJTFComFoco.append(jTFComFoco.getText());

    }//GEN-LAST:event_jTFAgenciaIFocusGained

    private void jTFBancoIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBancoIFocusGained
        jTFComFoco = jTFBancoI;
     
        conteudoJTFComFoco.delete(0, conteudoJTFComFoco.length());
        conteudoJTFComFoco.append(jTFComFoco.getText());
    }//GEN-LAST:event_jTFBancoIFocusGained

    private void jTFContaIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFContaIFocusGained
        jTFComFoco = jTFContaI;
       
        conteudoJTFComFoco.delete(0, conteudoJTFComFoco.length());
        conteudoJTFComFoco.append(jTFComFoco.getText());
    }//GEN-LAST:event_jTFContaIFocusGained

    private void jPFSenhaIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPFSenhaIFocusGained
        jTFComFoco = jPFSenhaI;
   
        conteudoJTFComFoco.delete(0, conteudoJTFComFoco.length());
        conteudoJTFComFoco.append(jTFComFoco.getText());
    }//GEN-LAST:event_jPFSenhaIFocusGained

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
            java.util.logging.Logger.getLogger(TelaIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIdentificacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0I;
    private javax.swing.JButton jB1I;
    private javax.swing.JButton jB2I;
    private javax.swing.JButton jB3I;
    private javax.swing.JButton jB4I;
    private javax.swing.JButton jB5I;
    private javax.swing.JButton jB6I;
    private javax.swing.JButton jB7I;
    private javax.swing.JButton jB8I;
    private javax.swing.JButton jB9I;
    private javax.swing.JButton jBCancelarI;
    private javax.swing.JButton jBConfirmarI;
    private javax.swing.JButton jBCorrigirI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPFSenhaI;
    private javax.swing.JTextField jTFAgenciaI;
    private javax.swing.JTextField jTFBancoI;
    private javax.swing.JTextField jTFContaI;
    // End of variables declaration//GEN-END:variables
public void setInicial(TelaInicialCaixa inicial) {
        this.inicial = inicial;
    }

public ClassSessao getSessao() {
        return sessao;
    }

    public void setSessao(ClassSessao sessao) {
        this.sessao = sessao;
    }

}
