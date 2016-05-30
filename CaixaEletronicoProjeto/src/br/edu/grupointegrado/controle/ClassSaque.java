/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;

/**
 *
 * @author BSP
 */
public class ClassSaque extends ConexaoOracle {
    private int cdSaque;
    private double vlSaque;
    private int cdConta;
    private int cdAgencia;
    private int cdBanco;
    private StringBuffer sql = new StringBuffer();
    
    public int getCdSaque() {
        return cdSaque;
    }

    public void setCdSaque(int cdSaque) {
        this.cdSaque = cdSaque;
    }

    public double getVlSaque() {
        return vlSaque;
    }

    public void setVlSaque(double vlSaque) {
        this.vlSaque = vlSaque;
    }

    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public int getCdAgencia() {
        return cdAgencia;
    }

    public void setCdAgencia(int cdAgencia) {
        this.cdAgencia = cdAgencia;
    }

    public int getCdBanco() {
        return cdBanco;
    }

    public void setCdBanco(int cdBanco) {
        this.cdBanco = cdBanco;
    }
    
   public void incluirSaque(){
   sql.delete(0, sql.length());
        sql.append("INSERT INTO SAQUE (CD_SAQUE,VL_SAQUE,CD_CONTA,CD_AGENCIA,CD_BANCO) VALUES (");
        sql.append(ultimasequencia("SAQUE", "CD_SAQUE")).append(",");
        sql.append(getVlSaque()).append(",");
        sql.append(getCdConta()).append(",");
        sql.append(getCdAgencia()).append(",");
        sql.append(getCdBanco()).append(")");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();
        setCdSaque(Integer.parseInt(ultimoInserido("SAQUE", " CD_SAQUE")));
   
   }
}
