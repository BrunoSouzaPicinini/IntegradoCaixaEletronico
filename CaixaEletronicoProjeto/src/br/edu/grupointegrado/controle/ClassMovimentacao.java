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
    private String dsMovimentacao;
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

    public String getDsMovimentacao() {
        return dsMovimentacao;
    }

    public void setDsMovimentacao(String dsMovimentacao) {
        this.dsMovimentacao = dsMovimentacao;
    }

    public double getVlMovimentacao() {
        return vlMovimentacao;
    }

    public void setVlMovimentacao(double vlMovimentacao) {
        this.vlMovimentacao = vlMovimentacao;
    }

    public void inserirMovimentacao() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO MOVIMENTACAO(CD_MOV,CD_OPERACAO,DS_MOV,VL_MOV) VALUES (");
        sql.append(ultimasequencia("MOVIMENTACAO", "CD_MOV")).append(",");
        sql.append(getCdOperacao()).append(",'");
        sql.append(getDsMovimentacao()).append("',");
        sql.append(getVlMovimentacao()).append(")");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();
        setCdMovimentacao(Integer.parseInt(ultimoInserido("OPERACAO"," CD_OPERACAO")));
    }
}
