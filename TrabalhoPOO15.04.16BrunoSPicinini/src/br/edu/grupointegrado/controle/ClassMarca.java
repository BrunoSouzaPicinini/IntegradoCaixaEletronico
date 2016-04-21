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
public class ClassMarca extends ConexaoOracle {
    
    private int codMarca;
    private String descMarca;
    private String dataMarca;
    private char ativoModelo;

    StringBuffer sql = new StringBuffer();

    public void incluirMarca(){
        //StringBuffer melhora performance 
       
       sql.append("INSERT INTO CAD_MARCA (CD_MARCA,DS_MARCA,DT_CADASTRO,IN_ATIVO) VALUES (");
       sql.append(ultimasequencia("CAD_MARCA", "CD_MARCA")).append(",'");
       sql.append(getDescMarca()).append("','");
       sql.append(getDataMarca()).append("')'");
       sql.append(getAtivoModelo()).append("')");
        incluirSQL(sql.toString());
        System.out.println(sql.toString());
        sql.delete(0,sql.length());
       
    }
    
    public void alterarMarca(){     
        sql.append("UPDATE CAD_MARCA SET DS_MARCA ='");
        sql.append(getDescMarca()).append("', DT_CADASTRO = '");
        sql.append(getDataMarca()).append("','");
        sql.append(getAtivoModelo()).append("'");
        sql.append(" WHERE CD_MARCA =").append(getCodMarca());
        updateSQL(sql.toString());
        System.out.println(sql.toString());
        sql.delete(0,sql.length());
    }
    
    public void excluirMarca(){
        sql.append("DELETE FROM CAD_MARCA WHERE CD_MARCA =");
        sql.append(getCodMarca()).append("");
        deleteSQL(sql.toString());
        System.out.println(sql.toString());
    sql.delete(0,sql.length());
    }
    
    public ResultSet consultageral(){
        sql.delete(0,sql.length());
        sql.append("SELECT * FROM CAD_MARCA ");
        executeSQL(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaCod(){
        //faz um 7
        sql.delete(0,sql.length());
        sql.append("SELECT * FROM CAD_MARCA WHERE CD_MARCA = ");
        sql.append(getCodMarca());
        executeSQL(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaDescricao(){
        //faz um 7
        sql.delete(0,sql.length());
        sql.append("SELECT * FROM CAD_MARCA WHERE DS_MARCA LIKE '%");
        sql.append(getDescMarca()).append("%'");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;
    }
    
    
    public void retornaMarca(){
    sql.delete(0, sql.length());
    sql.append("SELECT * FROM CAD_MARCA WHERE CD_MARCA =");
    sql.append(getCodMarca()).append(" ");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
    try {
        resultset.first();
        setCodMarca(resultset.getInt("CD_MARCA"));
        setDescMarca(resultset.getString("DS_MARCA"));
        
        }catch (SQLException ex){
        }    
    }
    
    public void retornaMarcaDesc(){
    sql.delete(0, sql.length());
    sql.append("SELECT * FROM CAD_MARCA WHERE DS_MARCA LIKE '");
    sql.append(getDescMarca()).append("'");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
    try {
        resultset.first();
        setCodMarca(resultset.getInt("CD_MARCA"));
        setDescMarca(resultset.getString("DS_MARCA"));
        
        }catch (SQLException ex){
        }    
    }
    
    
    
    
    
    
    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public String getDescMarca() {
        return descMarca;
    }

    public void setDescMarca(String descMarca) {
        this.descMarca = descMarca;
    }

    public String getDataMarca() {
        return dataMarca;
    }

    public void setDataMarca(String dataMarca) {
        this.dataMarca = dataMarca;
    }

    public char getAtivoModelo() {
        return ativoModelo;
    }

    public void setAtivoModelo(char ativoModelo) {
        this.ativoModelo = ativoModelo;
    }
    
    
}
