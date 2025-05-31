package controller;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexao {
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://127.0.0.1:3306/atv3_treino";
    private final String usuario = "root";
    private final String senha = "";

    private Connection conexao;

    public boolean conecta() {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return true;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte de dados: " + e.getMessage());
            return false;
        }
    }

    public void desconecta() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco de dados: " + e.getMessage());
        }
    }

    public void executeSQL(String sql) {
        if (conecta()) {
            try (Statement stmt = conexao.createStatement()) {
                stmt.execute(sql);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao executar SQL: " + e.getMessage());
            } finally {
                desconecta();
            }
        }
    }

    public ResultSet RetornarResultSet(String sql) {
        try {
            if (conecta()) {
                Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                return stmt.executeQuery(sql);
                // Obs: Conexão será fechada pelo código que consumir esse ResultSet
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar ResultSet: " + e.getMessage());
        }
        return null;
    }

    public Connection getConnection() {
        conecta(); // Garante que está conectado
        return conexao;
    }
}
