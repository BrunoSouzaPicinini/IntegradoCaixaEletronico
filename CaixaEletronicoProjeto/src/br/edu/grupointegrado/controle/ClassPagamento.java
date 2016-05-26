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
public class ClassPagamento extends ConexaoOracle {
   
    private  int cdPagamento;
    private  int cdAgencia;
    private  int cdBanco;
    private  int cdConta;
    private String codBarra;

    public int getCdPagamento() {
        return cdPagamento;
    }

    public void setCdPagamento(int cdPagamento) {
        this.cdPagamento = cdPagamento;
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

    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    private StringBuffer sql = new StringBuffer();
    
    public void incluirPagamento() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO PAGAMENTO (CD_PAGAMENTO,CD_CONTA,CD_BANCO,CD_AGENCIA,COD_BARRA) VALUES (");
        sql.append(ultimasequencia("PAGAMENTO", "CD_PAGAMENTO")).append(",");
        sql.append(getCdConta()).append(",");
        sql.append(getCdBanco()).append(",");
        sql.append(getCdAgencia()).append(",'");
        sql.append(getCodBarra()).append("')");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();
        setCdPagamento(Integer.parseInt(ultimoInserido("PAGAMENTO"," CD_PAGAMENTO")));
    }
    
    

}