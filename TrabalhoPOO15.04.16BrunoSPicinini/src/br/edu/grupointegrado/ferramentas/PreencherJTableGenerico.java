/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.ferramentas;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BSP
 */
public class PreencherJTableGenerico {

    public void PreencherJtableGenerico(JTable tabela, ResultSet resultado) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        try {
            int colunas = resultado.getMetaData().getColumnCount();

            while (resultado.next()) {
                Object[] row = new Object[colunas];
                for (int i = 0; i != colunas; i++) {
                    row[i] = resultado.getString(i + 1);
                }
                modelo.addRow(row);
            }

            if (!resultado.first()) {
                JOptionPane.showMessageDialog(null, "Registros não localizados!");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable" + erro);
        }

    }

    public void FormatarJTable(JTable tabela, int valores[]) {

        for (int x = 0; x < valores.length; x++) {
            tabela.getColumnModel().getColumn(x).setPreferredWidth(valores[x]);
        }

    }

    public void PreencherCombo(JComboBox combo, ResultSet resultset, String valor) {
        combo.removeAllItems();
        try {

            while (resultset.next()) {
                combo.addItem(resultset.getString(valor));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não existe valor em " + valor);
        }
    }

    public int[] preencherCoboRetorno(JComboBox combo, ResultSet resultado, String primaria, String visao) {
       
        combo.removeAllItems();
        int[] chave = null;
        try {
            resultado.last();
            
            int linhas =resultado.getRow();
            chave = new int[linhas];
            int conta = 0;
            resultado.first();
            do {
                chave[conta] = resultado.getInt(primaria);
                combo.addItem(resultado.getString(visao));
                conta++;

             }while(resultado.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Não há registros"); 
                }
        

        return chave;
    }

}
