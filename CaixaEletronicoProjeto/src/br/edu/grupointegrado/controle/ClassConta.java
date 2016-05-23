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

    private static int cdConta;
    private static int banco;
    private static int agencia;
    private static int saldo;
    private static int senha;
    private static int acesso = 0;
    private StringBuffer sql = new StringBuffer();

    public boolean acessoConta() {
        sql.delete(0, sql.length());
        sql.append("SELECT COUNT(CD_CONTA) FROM CONTA WHERE CD_CONTA =");
        sql.append(getCdConta()).append(" AND CD_BANCO =");
        sql.append(getBanco()).append(" AND CD_AGENCIA =");
        sql.append(getAgencia()).append(" AND CD_SENHA =");
        sql.append(getSenha());
        System.out.println("BUSCA DE REGISTRO:");
        System.out.println(sql.toString());
        executeSQL(sql.toString());
        try {
            int colunas = resultset.getMetaData().getColumnCount();

            resultset.next();
            acesso = resultset.getInt(1);
            

            System.out.print("Resultado:");
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

    public static int getCdConta() {
        return cdConta;
    }

    public static void setCdConta(int cdConta) {
        ClassConta.cdConta = cdConta;
    }

    public static int getBanco() {
        return banco;
    }

    public static void setBanco(int banco) {
        ClassConta.banco = banco;
    }

    public static int getAgencia() {
        return agencia;
    }

    public static void setAgencia(int agencia) {
        ClassConta.agencia = agencia;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClassConta.saldo = saldo;
    }

    public static int getSenha() {
        return senha;
    }

    public static void setSenha(int senha) {
        ClassConta.senha = senha;
    }

    public static int getAcesso() {
        return acesso;
    }

    public static void setAcesso(int acesso) {
        ClassConta.acesso = acesso;
    }

    
    public ResultSet consultaCodigo(int parseInt) {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CONTA WHERE CD_CONTA = ");
        sql.append(getCdConta());
        executeSQL(sql.toString());
        return resultset;
    }

}
