/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author BSP
 */
public class ClassModelo extends ConexaoOracle {
    
    private int codModelo;
    private int marcaFk;
    private String descModelo;
    private char ativoModelo;
    private String dataModelo;

    StringBuffer sql = new StringBuffer();
    
      public void incluirModelo(){
        //StringBuffer melhora performance 
       sql.delete(0,sql.length());
       sql.append("INSERT INTO CAD_MODELO (CD_MODELO,CD_MARCA,DS_MODELO,IN_ATIVO,DT_CADASTRO) VALUES (");
       sql.append(ultimasequencia("CAD_MODELO", "CD_MODELO")).append(",");
       sql.append(getMarcaFk()).append(",'");
       sql.append(getDescModelo()).append("','");
       sql.append(getAtivoModelo()).append("','");
       sql.append(getDataModelo()).append("')");
        incluirSQL(sql.toString());
        System.out.println(sql.toString());
        sql.delete(0,sql.length());
       
    }
    
    public void alterarModelo(){     
        sql.delete(0,sql.length());
        sql.append("UPDATE CAD_MODELO SET DS_MODELO ='");
        sql.append(getDescModelo()).append("', DT_CADASTRO = '");
        sql.append(getDataModelo()).append("',IN_ATIVO = '");
        sql.append(getAtivoModelo()).append("'");
        sql.append(" WHERE CD_MODELO =").append(getCodModelo());
        atualizarSQL(sql.toString());
        System.out.println(sql.toString());
        sql.delete(0,sql.length());
    }
    
    public void excluirModelo(){
        sql.delete(0,sql.length());
        sql.append("DELETE FROM CAD_MODELO WHERE CD_MODELO =");
        sql.append(getCodModelo()).append("");
        deleteSQL(sql.toString());
        System.out.println(sql.toString());
    sql.delete(0,sql.length());
    }
    
    public ResultSet consultageral(){
        sql.delete(0,sql.length());
        sql.append("SELECT * FROM CAD_MODELO ");
        executeSQL(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaCod(){
        //faz um 7
        sql.delete(0,sql.length());
        sql.append("SELECT * FROM CAD_MODELO WHERE CD_MODELO = ");
        sql.append(getCodModelo());
        executeSQL(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaDescricao(){
        //faz um 7
        sql.delete(0,sql.length());
        sql.append("SELECT * FROM CAD_MODELO WHERE DS_MODELO LIKE '%");
        sql.append(getDescModelo()).append("%'");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaDSMarca(String marca){
        sql.delete(0,sql.length());
        sql.append("SELECT MO.CD_MODELO,MO.DS_MODELO, MA.DS_MARCA,MO.IN_ATIVO,MO.DT_CADASTRO FROM CAD_MODELO MO\n" +
                   "INNER JOIN CAD_MARCA MA ON (MA.CD_MARCA = MO.CD_MARCA)\n" +
                   "WHERE MA.DS_MARCA LIKE '");
        sql.append(marca).append("%'");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;
    }
    
    
    public void retornaModelo(){
    sql.delete(0, sql.length());
    sql.append("SELECT * FROM CAD_MODELO WHERE CD_MODELO =");
    sql.append(getCodModelo());
        executeSQL(sql.toString());
        System.out.println(sql.toString());
    try {
        resultset.first();
        setCodModelo(resultset.getInt("CD_MODELO"));
        setDescModelo(resultset.getString("DS_MODELO"));
        setMarcaFk(resultset.getInt("CD_MARCA"));
        setDataModelo(resultset.getString("DT_CADASTRO"));
        setAtivoModelo((resultset.getString("IN_ATIVO")).charAt(0));
        }catch (SQLException ex){
        }    
    }
    
    
    
    
    
    public int getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(int codModelo) {
        this.codModelo = codModelo;
    }

    public int getMarcaFk() {
        return marcaFk;
    }

    public void setMarcaFk(int marcaFk) {
        this.marcaFk = marcaFk;
    }

    public String getDescModelo() {
        return descModelo;
    }

    public void setDescModelo(String descricaoModelo) {
        this.descModelo = descricaoModelo;
    }

    public char getAtivoModelo() {
        return ativoModelo;
    }

    public void setAtivoModelo(char ativoModelo) {
        this.ativoModelo = ativoModelo;
    }

    public String getDataModelo() {
        return dataModelo;
    }

    public void setDataModelo(String dataModelo) {
        this.dataModelo = dataModelo;
    }

  
    
    


    
    
}
