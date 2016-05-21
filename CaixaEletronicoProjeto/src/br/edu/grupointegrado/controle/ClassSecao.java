/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

/**
 *
 * @author BSP
 */
public class ClassSecao {
    private static int cdSessao;
    private static int cdConta;
    private static String date;

    public static int getCdSessao() {
        return cdSessao;
    }

    public static void setCdSessao(int cdSessao) {
        ClassSecao.cdSessao = cdSessao;
    }

    public static int getCdConta() {
        return cdConta;
    }

    public static void setCdConta(int cdConta) {
        ClassSecao.cdConta = cdConta;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        ClassSecao.date = date;
    }
    
}
