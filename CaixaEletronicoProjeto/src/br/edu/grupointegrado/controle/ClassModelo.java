package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ClassModelo extends ConexaoOracle {

    private static void JTabbedPane(ResultSet consultageral) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int codmodelo; 
    private int codmarca;
    private String desmodelo;
    private String inativo;
    private String datacastro;

    StringBuffer sql = new StringBuffer();
   
    public ClassModelo() {

    }

    public void incluirmodelo() {

        sql.delete(0, sql.length());
        sql.append("INSERT INTO CAD_MODELO (CD_MODELO,CD_MARCA,DS_MODELO,IN_ATIVO,DT_CADASTRO) VALUES (");
        sql.append(ultimasequencia("CAD_MODELO", "CD_MODELO")).append(",'");
        sql.append(getCodmarca()).append("','");
        sql.append(getDesmodelo().toUpperCase()).append("','");
        sql.append(getInativo().toUpperCase()).append("','");
        sql.append(getDatacastro().toUpperCase()).append("')");
        System.out.println(sql.toString());

        incluirsql(sql.toString());
    }

    public void alterarmodelo() {

        sql.delete(0, sql.length());
        sql.append("UPDATE CAD_MODELO SET CD_MARCA = '").append(getCodmarca());
        sql.append("',DS_MODELO = '").append(getDesmodelo().toUpperCase());
        sql.append("',IN_ATIVO = '").append(getInativo().toUpperCase());
        sql.append("',DT_CADASTRO = '").append(getDatacastro());
        sql.append("' WHERE CD_MODELO = ").append(getCodmodelo());
        System.out.println(sql.toString());

        atualizarSQL(sql.toString());

    }

    public void excluirmodelo() {

        sql.delete(0, sql.length());
        sql.append("DELETE FROM CAD_MODELO WHERE CD_MODElO = ").append(getCodmodelo());
        System.out.println(sql.toString());
        deleteSQL(sql.toString());
    }
    
        public void retornamodelo() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CAD_MODELO WHERE CD_MODELO =");
        sql.append(getCodmodelo());
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        try {
            resultset.first();
            setCodmarca(resultset.getInt("CD_MARCA"));
            
        } catch (SQLException ex) {
        }
    }

    public ResultSet consultageral() {

        sql.delete(0, sql.length());
        sql.append("SELECT CAD_MODELO.CD_MODELO, CAD_MARCA.DS_MARCA, CAD_MODELO.DS_MODELO, CAD_MODELO.IN_ATIVO, CAD_MODELO.DT_CADASTRO FROM CAD_MODELO ");
        sql.append("INNER JOIN CAD_MARCA ON (CAD_MODELO.CD_MARCA = CAD_MARCA.CD_MARCA)");
        executeSQL(sql.toString());

        return resultset;

    }

    public ResultSet consutamodelo() {

        sql.delete(0, sql.length());
        sql.append("SELECT CAD_MODELO.CD_MODELO, CAD_MARCA.DS_MARCA, CAD_MODELO.DS_MODELO, CAD_MODELO.IN_ATIVO, CAD_MODELO.DT_CADASTRO FROM CAD_MODELO ");
        sql.append("INNER JOIN CAD_MARCA ON (CAD_MODELO.CD_MARCA = CAD_MARCA.CD_MARCA)");
        sql.append("WHERE CAD_MODELO.DS_MODELO LIKE '%").append(getDesmodelo().toUpperCase()).append("%'");
        executeSQL(sql.toString());
       
        return resultset;

    }

//public static void main(String[] args) {
//        ClassModelo modelo = new ClassModelo();
//        modelo.setCodmodelo(1);
//        modelo.setCodmarca(1);
//        modelo.setDesmodelo("uno");
//        modelo.setDatacastro("18/04/2016");
//        modelo.setInativo("ativo");
//        modelo.incluirmodelo();
//        modelo.alterarmodelo();
//        modelo.excluirmodelo();
//    }
    public int getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(int codmodelo) {
        this.codmodelo = codmodelo;
    }

    public int getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(int codmarca) {
        this.codmarca = codmarca;
    }

    public String getDesmodelo() {
        return desmodelo;
    }

    public void setDesmodelo(String desmodelo) {
        this.desmodelo = desmodelo;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getDatacastro() {
        return datacastro;
    }

    public void setDatacastro(String datacastro) {
        this.datacastro = datacastro;
    }

}
