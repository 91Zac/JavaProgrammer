package br.com.impacta.java.dao;

import java.sql.*;

import br.com.impacta.java.model.Funcionario;

public class FuncionarioDAO {

	private final static String url = "jdbc:mysql://localhost:3306/impacta";

	private final static String username = "root";
	private final static String password = "123456";
	private String DRIVER = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://localhost:3306/impacta";
	private String USER = "aluno";
	private String PASSWORD = "java";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private Connection getConnection() throws DAOException {
		try {
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso!\n");
		} catch (SQLException e) {
			System.out.println("\nNão foi possível estabelecer conexão " + e + "\n");
			System.exit(1);
		}
		return con;

	}

	private void closeResources(Connection cn, Statement st, ResultSet rs) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("\nNão foi possível fechar conexão " + e + "\n");
			System.exit(1);
		}

	}

	public static void persist(Funcionario func) throws DAOException {
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con
					.prepareStatement("insert into funcionarios (nome, salario, cargoId) " + " values (?,?,?)");
			ps.setString(1, func.getNome());
			ps.setDouble(2, func.getSalario());
			ps.setInt(3, func.getCargoId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
