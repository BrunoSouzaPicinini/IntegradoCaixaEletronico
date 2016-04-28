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
public class ClassCliente extends ConexaoOracle {
    
    private int codCliente;
    private int endereco;
    private int rg;
    private int cpf;
    private String nome;
    private int telefone;
    private StringBuffer sql = new StringBuffer();
    
    public void incluirCliente(){
        sql.delete(0, sql.length());
        sql.append("INSERT INTO CLIENTE (CD_CLIENTE,CD_ENDERECO,RG,CPF,NM_CLIENTE,TEL_CLIENTE) VALUES(");
        sql.append(ultimasequencia("CLIENTE", "CD_CLIENTE")).append(",");
        sql.append(getEndereco()).append(",");
        sql.append(getRg()).append(",");
        sql.append(getCpf()).append(",'");
        sql.append(getNome()).append("',");
        sql.append(getTelefone()).append(")");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
    }
    
    public void alterarCliente (){
        sql.delete(0, sql.length());
        sql.append("UPDATE CLIENTE SET CD_ENDERECO =");
        sql.append(getEndereco()).append(", RG = ");
        sql.append(getRg()).append(", CPF = ");
        sql.append(getCpf()).append(", NM_CLIENTE = '");
        sql.append(getNome()).append("', TEL_CLIENTE = ");
        sql.append(getTelefone()).append(" ");
        sql.append(" WHERE CD_CLIENTE = ").append(getCodCliente());
        System.out.println(sql.toString());
        atualizarSQL(sql.toString());
    }
    
    public void excluirCliente (){
        sql.delete(0, sql.length());
        sql.append("DELETE FROM CIDADE WHERE CD_CLIENTE = ");
        sql.append(getCodCliente());
        deleteSQL(sql.toString());
    }
    
    public ResultSet consultaGeral (){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CLIENTE");
        executeSQL(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaCodigo (){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE CD_CLIENTE = ");
        sql.append(getCodCliente());
        executeSQL(sql.toString());
        return resultset;
    }
    
    public ResultSet consultaNome () {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CLIENTE WHERE NM_CLIENTE LIKE '%");
        sql.append(getNome().toUpperCase()).append("%'");
        executeSQL(sql.toString());
        return resultset;
    }
    public ResultSet consultaCPF() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CLIENTE WHERE CPF LIKE '%");
        sql.append(getCpf()).append("%'");
        executeSQL(sql.toString());
        return resultset;
    }
    
    public void retornaCliente () {
    sql.delete(0, sql.length());
        sql.append("SELECT * FROM CLIENTE WHERE CD_CLIENTE = ");
        sql.append(getCodCliente());
        executeSQL(sql.toString());
        try {
            resultset.first();
            setCodCliente(resultset.getInt("CD_CLIENTE"));
            setNome(resultset.getString("NM_CLIENTE"));
            setRg(resultset.getInt("RG"));
            setCpf(resultset.getInt("CPF"));
            setEndereco(resultset.getInt("CD_ENDERECO"));
            setTelefone(resultset.getInt("TEL_CLIENTE"));
        } catch (SQLException ex) {
        }
    }
    
    

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    
    
}
