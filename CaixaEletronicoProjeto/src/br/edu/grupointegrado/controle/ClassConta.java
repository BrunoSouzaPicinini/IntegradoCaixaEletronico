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

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getAcesso() {
        return acesso;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }
    private int banco;
    private int agencia;
    private Double saldo;
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
    public boolean verificaContaExite() {
        sql.delete(0, sql.length());
        sql.append("SELECT COUNT(CD_CONTA) FROM CONTA WHERE CD_CONTA =");
        sql.append(getCdConta()).append(" AND CD_BANCO =");
        sql.append(getBanco()).append(" AND CD_AGENCIA =");
        sql.append(getAgencia());
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
    
    
    public ResultSet consultaConta() {
        sql.delete(0, sql.length());
        sql.append("SELECT CD_CONTA, CD_AGENCIA, CD_BANCO,VL_SD_CORRENTE FROM CONTA WHERE CD_CONTA = ");
        sql.append(getCdConta()).append(" AND CD_AGENCIA = ");
        sql.append(getAgencia()).append(" AND CD_BANCO = ");
        sql.append(getBanco());
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;
    }
    
    /*
    public ResultSet consultaConta() {
        sql.delete(0, sql.length());
        sql.append("SELECT CD_CONTA, CD_AGENCIA, CD_BANCO,VL_SD_CORRENTE FROM CONTA ");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;
    }
    */
    
    public void atualizarSaldo() {
    sql.delete(0, sql.length());
    sql.append("SELECT VL_SD_CORRENTE FROM CONTA WHERE CD_CONTA =");
        sql.append(getCdConta()).append(" AND CD_BANCO =");
        sql.append(getBanco()).append(" AND CD_AGENCIA =");
        sql.append(getAgencia());
        System.out.println(sql.toString());
        executeSQL(sql.toString());
        try {
            int colunas = resultset.getMetaData().getColumnCount();

            resultset.next();
          saldo = resultset.getDouble(1);
            System.out.println(saldo);
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar Saldo " + erro);
           
        }

       
    
    }

    public void alterarSaldoConta(Double valorMovimentado) {
        /* MODELO SQL
        UPDATE CONTA SET VL_SD_CORRENTE = ((SELECT VL_SD_CORRENTE FROM CONTA 
        WHERE CD_CONTA = 1 AND CD_BANCO = 1 AND CD_AGENCIA = 1)+-10.59)
        WHERE CD_CONTA = 1 AND CD_BANCO = 1 AND CD_AGENCIA = 1;
         */

        sql.delete(0, sql.length());
        sql.append("UPDATE CONTA SET VL_SD_CORRENTE = ((SELECT VL_SD_CORRENTE FROM CONTA \n"
                + "        WHERE CD_CONTA = ");
        sql.append(getCdConta()).append(" AND CD_BANCO = ");
        sql.append(getBanco()).append(" AND CD_AGENCIA = ");
        sql.append(getAgencia());
        sql.append(")+").append(valorMovimentado).append(")");
        sql.append(" WHERE CD_CONTA = ").append(getCdConta());
        sql.append(" AND CD_BANCO = ").append(getBanco());
        sql.append(" AND CD_AGENCIA = ").append(getAgencia());
        System.out.println(sql.toString());
        atualizarSQL(sql.toString());
    }

}
