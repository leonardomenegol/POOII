package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;

public class UsuarioDAO {
	private Connection con;
	public UsuarioDAO()
	{
	}

	public boolean autenticaUsuario(Usuario l)
	{
		PreparedStatement prep;
		ResultSet res;
		String sql;
		
		con=ConexaoMySQL.abrirConexaoMySQL();
		
		sql="Select * from usuarios where usuario like ? and senha like ?";
		
		try {
			prep=con.prepareStatement(sql);
			prep.setString(1, l.getUsuario());
			prep.setString(2, String.valueOf(l.getSenha()));
			
			res=prep.executeQuery();
			
			if(res.next())
			{
				ConexaoMySQL.fecharConexao();
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConexaoMySQL.fecharConexao();
		return false;	
	}
}
