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
public class ClassTransferencia extends ConexaoOracle {

    private int cdtransferencia;
    private int contaOrigem;
    private int contaDestino;
    private Double valorTransferencia;
    private int agenciaOrigem;
    private int agenciaDestino;
    private int bancoOrigem;
    private int bancoDestino;
    private StringBuffer sql = new StringBuffer();

    public int getCdtransferencia() {
        return cdtransferencia;
    }

    public void setCdtransferencia(int cdtransferencia) {
        this.cdtransferencia = cdtransferencia;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }
   
    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public Double getValorTransferencia() {
        return valorTransferencia;
    }

    public void setValorTransferencia(Double valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    }

    public int getAgenciaOrigem() {
        return agenciaOrigem;
    }

    public void setAgenciaOrigem(int agenciaOrigem) {
        this.agenciaOrigem = agenciaOrigem;
    }

    public int getAgenciaDestino() {
        return agenciaDestino;
    }

    public void setAgenciaDestino(int agenciaDestino) {
        this.agenciaDestino = agenciaDestino;
    }

    public int getBancoOrigem() {
        return bancoOrigem;
    }

    public void setBancoOrigem(int bancoOrigem) {
        this.bancoOrigem = bancoOrigem;
    }

    public int getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(int bancoDestino) {
        this.bancoDestino = bancoDestino;
    }
    
    public void incluirOperacaoTransDep() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO TRANSFERENCIA (CD_TRANS,CONTA_ORIGEM,CONTA_DESTINO,"
                + "VALOR_TRANS,AGENCIA_ORIG,AGENCIA_DEST,BANCO_DEST,BANCO_ORIG) VALUES (");
        sql.append(ultimasequencia("TRANSFERENCIA", "CD_TRANS")).append(",");
        sql.append(getContaOrigem()).append(",");
        sql.append(getContaDestino()).append(",");
        sql.append(getValorTransferencia()).append(",");
        sql.append(getAgenciaOrigem()).append(",");
        sql.append(getAgenciaDestino()).append(",");
        sql.append(getBancoDestino()).append(",");
        sql.append(getBancoOrigem()).append(")");
        System.out.println(sql.toString());
        incluirsql(sql.toString());
        commit();
        setCdtransferencia(Integer.parseInt(ultimoInserido("TRANSFERENCIA", "CD_TRANS")));
    }
    
}
