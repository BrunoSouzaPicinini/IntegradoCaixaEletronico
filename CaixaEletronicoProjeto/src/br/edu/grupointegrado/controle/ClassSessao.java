/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author BSP
 */
public class ClassSessao extends ConexaoOracle{

    private static int cdSessao;
    private static int cdConta;
    private static String date;
    private static int cdAgencia;
    private static int cdBanco;
    StringBuffer sql = new StringBuffer();
    
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
}
    
    public static void carregarContaSessao(ClassConta conta){
        setCdConta(conta.getCdConta());
        setCdAgencia(conta.getAgencia()); 
        setCdBanco(conta.getBanco());
    }
   
    public void incluirSessao() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO SESSAO (CD_SESSAO,CD_CONTA,CD_BANCO,CD_AGENCIA,DT_SESSAO) VALUES (");
        sql.append(ultimasequencia("SESSAO", "CD_SESSAO")).append(",");
        sql.append(getCdConta()).append(",");
        sql.append(getCdBanco()).append(",");
        sql.append(getCdAgencia()).append(",To_Date('");
        sql.append(getDateTime()).append("', 'dd/mm/yyyy hh24:mi:ss'))");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();
    }
    
    public void incluirSessaoNaoIdentificada() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO SESSAO (CD_SESSAO,DT_SESSAO) VALUES (");
        sql.append(ultimasequencia("SESSAO", "CD_SESSAO")).append(",To_Date('");
        sql.append(getDateTime()).append("', 'dd/mm/yyyy hh24:mi:ss'))");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();
    }

    public static int getCdSessao() {
        return cdSessao;
    }

    public static void setCdSessao(int cdSessao) {
        ClassSessao.cdSessao = cdSessao;
    }

    public static int getCdConta() {
        return cdConta;
    }

    public static void setCdConta(int cdConta) {
        ClassSessao.cdConta = cdConta;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        ClassSessao.date = date;
    }

    public static int getCdAgencia() {
        return cdAgencia;
    }

    public static void setCdAgencia(int cdAgencia) {
        ClassSessao.cdAgencia = cdAgencia;
    }

    public static int getCdBanco() {
        return cdBanco;
    }

    public static void setCdBanco(int cdBanco) {
        ClassSessao.cdBanco = cdBanco;
    }

    
    
    
    
}
