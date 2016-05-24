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
public class ClassOperacao extends ConexaoOracle {
    
    private static int cdOperacao;
    private static int cdSaque;
    private static int cdTrans;
    private static int cdSessao;
    private static int cdPagamento;

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
  
    
}
