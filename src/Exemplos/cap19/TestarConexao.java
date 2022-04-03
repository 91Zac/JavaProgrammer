package Exemplos.cap19;

import java.sql.*;

import br.com.impacta.java.dao.DAOException;
import br.com.impacta.java.dao.FuncionarioDAO;
import br.com.impacta.java.model.Funcionario;

public class TestarConexao {
	
private final static String url = "jdbc:mysql://localhost:3306/impacta";
	
	private final static String username = "root";
	private final static String password = "123456";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private String nome = null;
	private String telefone = null;
	
	public static void main(String args[]) throws DAOException{
	//	TestarConexao b = new TestarConexao();
		//b.openDB();
		//b.mostra();
		//b.closeDB();
		
		
		Funcionario f5 = new Funcionario("Mario", 5400.56,54);
		
		FuncionarioDAO.persist(f5);
	}
	
	public void openDB(){
		try{
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso!\n");
		}catch(SQLException e){
			System.out.println("\nNão foi possível estabelecer conexão " + e + "\n");
			System.exit(1);
		}
	}
	
	public void closeDB(){
		try{
			con.close();
		}catch(SQLException e){
			System.out.println("\nNão foi possível fechar conexão " + e + "\n");
			System.exit(1);
		}
	}
	
	public void setNome(String nome){
		if(nome.trim().length() == 0)
			this.nome = null;
		else
			this.nome = nome;
	}
	
	public void setTelefone(String telefone){
		if(telefone.trim().length() == 0)
			this.telefone = null;
		else
			this.telefone = telefone;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void mostra(){
		String query;
		
		try{
			query = "SELECT * FROM alunos";
			System.out.println("\nMostrando dados.\n");
			
			rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("telefone"));
			}
		}catch(SQLException e){
			setNome(null);
			setTelefone(null);
		}
	}
}