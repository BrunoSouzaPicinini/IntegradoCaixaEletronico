/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author BSP
 */

public class ClassExtrato {
    String curDir = System.getProperty("user.dir");
    
    
    public ClassExtrato(ResultSet resultset){
        try{
            System.out.println(curDir+"//Relatorio//Extrato.jasper");
            JRResultSetDataSource jrRs = new JRResultSetDataSource(resultset);
            JasperPrint jasperPrint =
            JasperFillManager.fillReport(
                    //ALTERAR PARA FUNCIONAR EM OUTROS PCs
                   curDir+"//Relatorio//Extrato.jasper",
                    new HashMap(), jrRs);
            JasperViewer viewer = new JasperViewer(jasperPrint,false);
            viewer.setVisible(true);
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null,"erro de relatório" + erro);
            
        }
    }
}
