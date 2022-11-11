package Cadastros;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.jdbc.CallableStatement;

public class Dao {

	Connection conn; // conexao com o banco
	PreparedStatement stmt; // acessa as tabelas (insert, update, delete, select)
	ResultSet rs; // consulta a tabela (select) / guarda o resultado de uma consulta
	CallableStatement call; // chama as procedures e function
	
	public void open() throws Exception {
		String url = "jdbc:mysql://localhost:3307/cadastros";
		String user = "root";
		String password = "password";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao conectar com o banco: " + e);
		}
	}
	
	public void close() throws Exception {
		conn.close();
	}

}
