package dao;
//Classes necessarias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Inicio da classe de conexao
public class ConexaoMySQL {
	private static String status = "Nao conectou...";
	private static Connection connection=null;

	// Metodo Construtor da Classe
	public ConexaoMySQL()
	{}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		ConexaoMySQL.connection = connection;
	}

	// Metodo de Conexao//
	public static Connection abrirConexaoMySQL(){
		connection = null; //atributo do tipo Connection
			String serverName = "localhost"; //caminho do servidor do BD
			String mydatabase ="meu_banco_de_dados"; //nome do seu banco de dados
			String url = "jdbc:mysql://"+serverName+":3306/"+mydatabase;
			String username = "root"; //nome de um usuario de seu BD 
			String password = "menegol"; //sua senha de acesso
			try {
				connection = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Testa sua conexao
			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			}
			else {
				status = ("STATUS--->Nao foi possivel realizar conexao");
			}
			
			return connection;
			


	}

	// Metodo que retorna o status da sua conexao
	public static void obterStatusConexao() {
		System.out.println(status);
	}

	// Metodo que fecha sua conexao
	public static boolean fecharConexao() {

		try {

			connection.close();

			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	// Metodo que reinicia sua conexao
	public static Connection ReiniciarConexao() {
		fecharConexao();
		return ConexaoMySQL.abrirConexaoMySQL();
	}
	
		

}