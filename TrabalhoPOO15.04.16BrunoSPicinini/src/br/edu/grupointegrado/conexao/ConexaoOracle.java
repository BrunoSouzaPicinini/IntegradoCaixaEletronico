package br.edu.grupointegrado.conexao;

/**
 * @author Cardeal
 */
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoOracle {

    public static Connection ConexaoOracle;
    public static Statement statement;
    public static ResultSet resultset;
    public ResultSetMetaData metaData;
    public int retorno = 0;

    public ConexaoOracle() {
        conecta();
    }

    public static Connection conecta() {
        if (ConexaoOracle != null) {
            return ConexaoOracle;
        } else {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                ConexaoOracle = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "trabalhopoo", "trabalhopoo");
                System.out.println("Conectado!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão: \n" + ex);
                ex.printStackTrace();
                return null;
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro na biblioteca de conexão: \n" + ex);
                ex.printStackTrace();
                return null;
            }
        }
        return ConexaoOracle;
    }

    public void desconecta() {
        try {
            ConexaoOracle.close();
            System.out.println("Desconectado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel fechar o banco de dados: \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o registro \n" + ex);
        }
        try {
            metaData = resultset.getMetaData();
        } catch (SQLException ex) {
        }
    }

    public void deleteSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel deletar o registro: \n" + ex);
        }
    }

    public void atualizarSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar o registro: \n" + ex);
        }
    }

    public void updateSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException atualex) {
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSIVEL ALTERAR O REGISTRO \n" + atualex);
        }

    }

    public void incluirSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 00001) {
                JOptionPane.showMessageDialog(null, "Registro já cadastrado!", "Registro não atualizado", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao executar SQL \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            }
            retorno = 0;
        }

    }

    public String ultimasequencia(String tabela, String atributo) {
        String sql = "SELECT COALESCE(MAX(+" + atributo + "),0)+1 AS ULTIMO FROM " + tabela;
        executeSQL(sql);
        try {
            resultset.first();
            return resultset.getString("ULTIMO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontroar numero de sequencia! \n" + ex);
            return "";
        }
    }
    

    public String menu() {
        String op = JOptionPane.showInputDialog(null, "PROGRAMA QUE VALE 1 MILHÃO \n"
                + "1 - INCLUIR \n" + "2 - ALTERAR \n"
                + "3 - EXCLUIR \n" + "4 - LISTAR \n "
                + "0 - SAIR \n");

        return (op);
    }

    public static void main(String[] args) {
        ConexaoOracle conexao = new ConexaoOracle();
        while (true) {

            switch (conexao.menu()) {
                case "1":
                    // cadastra um item em cidade
                    String nomeCidade = JOptionPane.showInputDialog("Informe NOME da cidade para cadastar");
                    String estado = JOptionPane.showInputDialog("Informe o ESTADO da cidade para cadastar");
                    String sql3 = ("INSERT INTO CIDADE (CD_CIDADE,DS_CIDADE,DS_UF) VALUES(" + conexao.ultimasequencia("CIDADE", "CD_CIDADE") + ",'" + nomeCidade + "','" + estado + "')");
                    conexao.incluirSQL(sql3);
                    JOptionPane.showMessageDialog(null, "Valor salvo");
                    break;
                case "2":
                    /*
                     int cdCidade = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o código da cidade \n "));

                     String campoInt = JOptionPane.showInputDialog(null, "1 - alterar Nome \n2 - alterar Estado ");
                     String campo = "";
                     switch (campoInt) {
                     case "1":
                     campo = "DS_CIDADE";
                     break;
                     case "2":
                     campo = "UF";
                     break;
                     }

                     String valor = JOptionPane.showInputDialog(null, "Insira o novo nome");

                     String sql = ("UPDATE CIDADE SET " + campo + " = '" + valor + "' \nWHERE CD_CIDADE = (" + cdCidade + ")");
                     System.out.println(sql);
                     conexao.updateSQL(sql);
                     */
                    String cod = JOptionPane.showInputDialog("INFORME O CODIGO DA CIDADE PARA ALTERAR");
                    String nome = JOptionPane.showInputDialog("INFORME O NOME DA CIDADE");
                    String uf = JOptionPane.showInputDialog("INFORME A UF DA CIDADE");
                    conexao.updateSQL("UPDATE CIDADE SET DS_CIDADE = UPPER ('" + nome + "'), DS_UF = UPPER('" + uf + "') WHERE CD_CIDADE = " + cod);
                    break;
                case "3":
                    // deleta uma linha de cidade
                    String nomeCidade2 = JOptionPane.showInputDialog("Informe código da cidade a ser deletada");
                    String sql4 = ("DELETE FROM CIDADE WHERE CD_CIDADE IN (" + nomeCidade2 + ")");
                    conexao.deleteSQL(sql4);
                    break;

                case "4":
                    try {// busca todos os registos na tabela
                        String sql2 = "SELECT * FROM CIDADE";
                        conexao.executeSQL(sql2);
                        String resultado = "";
                        while (conexao.resultset.next()) {
                            resultado += conexao.resultset.getString("CD_CIDADE") + " - "
                                    + conexao.resultset.getString("DS_CIDADE") + " - "
                                    + conexao.resultset.getString("DS_UF") + " \n ";

                        }
                        if (resultado == "") {
                            JOptionPane.showMessageDialog(null, "não existe registro");
                        } else {
                            JOptionPane.showMessageDialog(null, resultado);
                        }
                    } catch (SQLException ex) {
                    }
                    break;

                case "0":
                    System.exit(0);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROOOU! ESTA OPICION NO ECZISTE!");
                    break;

            }

        }
    }
}
