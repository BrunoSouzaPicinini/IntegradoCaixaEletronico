package br.edu.grupointegrado.conexao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Jamerson 01/03/2016 Conexao com banco de dados Oracle 11g
 */
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
                ConexaoOracle = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "caixaeletronico", "caixaeletronico");
                System.out.println("Conectado!");
                ConexaoOracle.setAutoCommit(false);
                return ConexaoOracle;
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
        
    }
    
    public void commit() {
        try {
            conecta().commit();
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "Problemas ao realizar o commit");
        }
    }

    public void rollback() {
        try {
            conecta().rollback();
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "Problemas ao realizar o rollback");
        }
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

    public void incluirsql(String sql) {
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
    
    public String ultimoInserido(String tabela, String atributo) {
        String sql = "SELECT COALESCE(MAX(+" + atributo + "),0) AS ULTIMO FROM " + tabela;
        executeSQL(sql);
        try {
            resultset.first();
            return resultset.getString("ULTIMO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontroar numero de sequencia! \n" + ex);
            return "";
        }
    }
    
    
}
//    public static void main(String[] args) {
//
//        ConexaoOracle conexao = new ConexaoOracle();
//
//        while (true) {
//
//            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo" + "\n"
//                    + "1 - Para Cadastar cidade" + "\n" + "2 - Para Consutar todos Cadastros" + "\n"
//                    + "3 - Para Consultar 1 Cadastro" + "\n" + "4 - Para Deletar" + "\n" + "5 - Para Sair"));
//
//            switch (opcao) {
//
//                case 1:
//
//                    String y = JOptionPane.showInputDialog("Informe a cidade para cadastar");
//                    String z = JOptionPane.showInputDialog("Informe UF da cidade para cadastar");
//                    conexao.atualizarSQL("INSERT INTO CIDADE (CD_CIDADE,DS_CIDADE,DS_UF) VALUES("
//                            + conexao.ultimasequencia("CIDADE", "CD_CIDADE") 
//                            +"'"+ y +"','"+ z +"')");
//                    JOptionPane.showMessageDialog(null, "Valor salvo");
//                    break;
//
//                case 2:
//
//                    try { // busca todos os registos na tabela
//                        String sql = "SELECT * FROM CIDADE";
//                        conexao.executeSQL(sql);
//                        String resultado = "";
//                        while (conexao.resultSet.next()) {
//                            resultado += conexao.resultSet.getString("CD_CIDADE") + " - "
//                                    + conexao.resultSet.getString("DS_CIDADE") + " - "
//                                    + conexao.resultSet.getString("DS_UF") + " \n ";
//
//                        }
//                        JOptionPane.showMessageDialog(null, resultado);
//                    } catch (SQLException ex) {
//                    }
//                    break;
//                case 3:
//                    String x = JOptionPane.showInputDialog("Informe o Codigo");
//                    String sql = "SELECT * FROM CIDADE WHERE CD_CIDADE = " + x;
//                    conexao.executeSQL(sql);
//                    try {
//                        conexao.resultSet.first();
//                        JOptionPane.showMessageDialog(null,
//                                conexao.resultSet.getString("CD_CIDADE") + " - "
//                                + conexao.resultSet.getString("DS_CIDADE"));
//                    } catch (SQLException ex) {
//                        JOptionPane.showMessageDialog(null, "Codigo invalido");
//                    }
//
//                    break;
//                case 4:
//                    x = JOptionPane.showInputDialog("Informe codigo da cidade para deletar");
//                    sql = ("DELETE FROM CIDADE WHERE CD_CIDADE = " + x);
//                    conexao.incluirSQL(sql);
//                    JOptionPane.showMessageDialog(null, "Registro deletado");
//                    break;
//                case 5:
//                    conexao.desconecta();
//                    System.exit(opcao);
//                    break;
//
//                default:
//                    JOptionPane.showMessageDialog(null, "Valor não Existe");
//                    break;
//            }
//        }
//    }
//}
