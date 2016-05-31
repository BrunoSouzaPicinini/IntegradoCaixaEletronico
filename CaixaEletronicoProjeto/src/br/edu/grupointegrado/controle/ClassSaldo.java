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
public class ClassSaldo {
    String curDir = System.getProperty("user.dir");
    
    
    public ClassSaldo(ResultSet resultset){
        try{
            System.out.println(curDir+"//Relatorio//Saldo.jasper");
            JRResultSetDataSource jrRs = new JRResultSetDataSource(resultset);
            JasperPrint jasperPrint =
            JasperFillManager.fillReport(
                    //ALTERAR PARA FUNCIONAR EM OUTROS PCs
                   curDir+"//Relatorio//Saldo.jasper",
                    new HashMap(), jrRs);
            JasperViewer viewer = new JasperViewer(jasperPrint,false);
            viewer.setVisible(true);
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null,"erro de relatório" + erro);
            
        }
    }
}
