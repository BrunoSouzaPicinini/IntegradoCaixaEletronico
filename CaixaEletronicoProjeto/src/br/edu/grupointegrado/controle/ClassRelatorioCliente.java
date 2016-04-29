
package br.edu.grupointegrado.controle;


/**
 *
 * @author BSP
 */

import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author BrunoSouzaPicinini
 */
public class ClassRelatorioCliente {
    
    String curDir = System.getProperty("user.dir");
    
    
    public ClassRelatorioCliente(ResultSet resultset){
        try{
            JRResultSetDataSource jrRs = new JRResultSetDataSource(resultset);
            JasperPrint jasperPrint =
            JasperFillManager.fillReport(
                    //ALTERAR PARA FUNCIONAR EM OUTROS PCs
                    curDir+"//Relatorio//Relatorio_Cliente.jasper",
                    new HashMap(), jrRs);
            JasperViewer viewer = new JasperViewer(jasperPrint);
            viewer.setVisible(true);
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null,"erro de relatório" + erro);
        }
    }
    
}
