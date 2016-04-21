package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import static br.edu.grupointegrado.conexao.ConexaoOracle.resultset;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassMarca extends ConexaoOracle {

    private int codmarca;
    private String desmarca;
    private String dtcadastro;
    private String situacao;

    StringBuffer sql = new StringBuffer();

    public ClassMarca() {

    }

    public void retornamarca() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CAD_MARCA ");
        sql.append("WHERE CD_MARCA = ").append(getCodmarca());
        executeSQL(sql.toString());

        try {
            resultset.first();
            setDesmarca(resultset.getString("DS_MARCA"));
        } catch (SQLException ex) {
        }
    }

    public void incluirmarca() {

        sql.delete(0, sql.length());
        sql.append("INSERT INTO CAD_MARCA (CD_MARCA,DS_MARCA,DT_CADASTRO,IN_ATIVO) VALUES (");
        sql.append(ultimasequencia("CAD_MARCA", "CD_MARCA")).append(",'");
        sql.append(getDesmarca().toUpperCase()).append("','");
        sql.append(getDtcadastro()).append("','");
        sql.append(getSituacao().toUpperCase()).append("')");

        incluirsql(sql.toString());
    }

    public void alterarmarca() {

        sql.delete(0, sql.length());
        sql.append("UPDATE CAD_MARCA SET DS_MARCA = '").append(getDesmarca().toUpperCase());
        sql.append("',DT_CADASTRO = '").append(getDtcadastro());
        sql.append("',IN_ATIVO = '").append(getSituacao().toUpperCase());
        sql.append("' WHERE CD_MARCA = ").append(getCodmarca());

        System.out.println(sql.toString());

        atualizarSQL(sql.toString());
    }

    public void excluirmarca() {

        sql.delete(0, sql.length());
        sql.append("DELETE FROM CAD_MARCA WHERE CD_MARCA = ").append(getCodmarca());

        executeSQL(sql.toString());

    }

    public ResultSet consutamarcadescricao() {

        sql.delete(0, sql.length());
        sql.append("SELECT CAD_MODELO.CD_MODELO, CAD_MARCA.DS_MARCA, CAD_MODELO.DS_MODELO, CAD_MODELO.IN_ATIVO, CAD_MODELO.DT_CADASTRO FROM CAD_MODELO ");
        sql.append("INNER JOIN CAD_MARCA ON (CAD_MODELO.CD_MARCA = CAD_MARCA.CD_MARCA)");
        sql.append("WHERE CAD_MARCA.DS_MARCA LIKE '%").append(getDesmarca().toUpperCase()).append("%'");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;

    }

    public ResultSet consultageral() {

        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CAD_MARCA ");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;

    }

    public ResultSet consultamarca() {

        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CAD_MARCA WHERE DS_MARCA LIKE '%").append(getDesmarca().toUpperCase()).append("%'");
        executeSQL(sql.toString());
        System.out.println(sql.toString());
        return resultset;

    }

//    public static void main(String[] args) {
//        
//        ClassMarca marca = new ClassMarca();
//        marca.setCodmarca(2);
//        marca.setDesmarca("wm");
//        marca.setDtcadastro("16/04/2016");
//        marca.setSituacao("ativo");
//        marca.incluirmarca();
//        marca.alterarmarca();
//        marca.excluirmarca();
//    }
    public int getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(int codmarca) {
        this.codmarca = codmarca;
    }

    public String getDesmarca() {
        return desmarca;
    }

    public void setDesmarca(String desmarca) {
        this.desmarca = desmarca;
    }

    public String getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(String dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
