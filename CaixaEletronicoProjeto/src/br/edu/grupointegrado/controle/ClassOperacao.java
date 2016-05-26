/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BSP
 */
public class ClassOperacao extends ConexaoOracle {

    private static int cdOperacao;
    private static int cdSaque;
    private static int cdTrans;
    private static int cdSessao;
    private static int cdPagamento;
    private static String dtOperacao;
    private StringBuffer sql = new StringBuffer();

    public static int getCdOperacao() {
        return cdOperacao;
    }

    public static void setCdOperacao(int cdOperacao) {
        ClassOperacao.cdOperacao = cdOperacao;
    }

    public static int getCdSaque() {
        return cdSaque;
    }

    public static void setCdSaque(int cdSaque) {
        ClassOperacao.cdSaque = cdSaque;
    }

    public static int getCdTrans() {
        return cdTrans;
    }

    public static void setCdTrans(int cdTrans) {
        ClassOperacao.cdTrans = cdTrans;
    }

    public static int getCdSessao() {
        return cdSessao;
    }

    public static void setCdSessao(int cdSessao) {
        ClassOperacao.cdSessao = cdSessao;
    }

    public static int getCdPagamento() {
        return cdPagamento;
    }

    public static void setCdPagamento(int cdPagamento) {
        ClassOperacao.cdPagamento = cdPagamento;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dtOperacao = new Date();
        return dateFormat.format(dtOperacao);
    }

    public void incluirOperacaoPagamento() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO OPERACAO (CD_OPERACAO,CD_PAGAMENTO,CD_SESSAO,DT_OPERACAO) VALUES (");
        sql.append(ultimasequencia("OPERACAO", "CD_OPERACAO")).append(",");
        sql.append(getCdPagamento()).append(",");
        sql.append(getCdSessao()).append(",To_Date('");
        sql.append(getDateTime()).append("', 'dd/mm/yyyy hh24:mi:ss'))");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();

    }
    
    public void incluirOperacaoSaque() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO OPERACAO (CD_OPERACAO,CD_SAQUE,CD_SESSAO,DT_OPERACAO) VALUES (");
        sql.append(ultimasequencia("OPERACAO", "CD_OPERACAO")).append(",");
        sql.append(getCdSaque()).append(",");
        sql.append(getCdSessao()).append(",To_Date('");
        sql.append(getDateTime()).append("', 'dd/mm/yyyy hh24:mi:ss'))");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();

    }
    
    public void incluirOperacaoTransDep() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO OPERACAO (CD_OPERACAO,CD_TRANS,CD_SESSAO,DT_OPERACAO) VALUES (");
        sql.append(ultimasequencia("OPERACAO", "CD_OPERACAO")).append(",");
        sql.append(getCdPagamento()).append(",");
        sql.append(getCdSessao()).append(",To_Date('");
        sql.append(getDateTime()).append("', 'dd/mm/yyyy hh24:mi:ss'))");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();

    }

}
