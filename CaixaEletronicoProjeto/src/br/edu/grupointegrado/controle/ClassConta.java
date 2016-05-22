/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BSP
 */
public class ClassConta extends ConexaoOracle {

    private int cdConta;
    private int banco;
    private int agencia;
    private int saldo;
    private int senha;
    private int acesso = 0;
    private StringBuffer sql = new StringBuffer();

    public boolean acessoConta() {
        sql.delete(0, sql.length());
        sql.append("SELECT COUNT(CD_CONTA) FROM CONTA WHERE CD_CONTA =");
        sql.append(getCdConta()).append(" AND CD_BANCO =");
        sql.append(getBanco()).append(" AND CD_AGENCIA =");
        sql.append(getAgencia()).append(" AND CD_SENHA =");
        sql.append(getSenha());
        System.out.println(sql.toString());
        executeSQL(sql.toString());
        try {
            int colunas = resultset.getMetaData().getColumnCount();

            resultset.next();
            acesso = resultset.getInt(1);
            

            
            System.out.println(acesso);
            if (acesso == 1) {
                return true;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
            return false;
        }

        return false;
    }

    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public StringBuffer getSql() {
        return sql;
    }

    public void setSql(StringBuffer sql) {
        this.sql = sql;
    }

    public ResultSet consultaCodigo(int parseInt) {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CONTA WHERE CD_CONTA = ");
        sql.append(getCdConta());
        executeSQL(sql.toString());
        return resultset;
    }

}
