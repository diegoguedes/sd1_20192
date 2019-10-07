package br.com.diego.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaDAOImplementacao implements ContaDAO {

	public String consultar(String nome) {
		PreparedStatement ps = null;
		ResultSet rs;
        String url;
        Connection conexaoBanco = null;
        try {
        	url = "jdbc:postgresql://localhost/teste?user=postgres&password=diego";
        	conexaoBanco = DriverManager.getConnection(url);
            ps = conexaoBanco.prepareStatement("select nome from conta where nome = ?");
            ps.setString(1, nome);
            rs = ps.executeQuery();
            
            if (rs.next()) {            	
                return rs.getString("nome");
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (conexaoBanco != null) {
                try {
                	conexaoBanco.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}
}
