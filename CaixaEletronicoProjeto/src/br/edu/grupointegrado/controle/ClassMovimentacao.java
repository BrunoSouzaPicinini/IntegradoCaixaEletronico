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
public class ClassMovimentacao extends ConexaoOracle {
    private int cdMovimentacao;
    private int cdOperacao;
    private int dsMovimentacao;
    private double vlMovimentacao;
    private StringBuffer sql = new StringBuffer();

    public int getCdMovimentacao() {
        return cdMovimentacao;
    }

    public void setCdMovimentacao(int cdMovimentacao) {
        this.cdMovimentacao = cdMovimentacao;
    }

    public int getCdOperacao() {
        return cdOperacao;
    }

    public void setCdOperacao(int cdOperacao) {
        this.cdOperacao = cdOperacao;
    }

    public int getDsMovimentacao() {
        return dsMovimentacao;
    }

    public void setDsMovimentacao(int dsMovimentacao) {
        this.dsMovimentacao = dsMovimentacao;
    }

    public double getVlMovimentacao() {
        return vlMovimentacao;
    }

    public void setVlMovimentacao(double vlMovimentacao) {
        this.vlMovimentacao = vlMovimentacao;
    }
    
    
}
