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
    
    
}
