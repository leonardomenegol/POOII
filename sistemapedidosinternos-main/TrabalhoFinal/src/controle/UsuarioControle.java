package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.UsuarioDAO;
import modelo.Usuario;
import visao.Autenticar;
import visao.SistPedidosInt;

public class UsuarioControle implements ActionListener  {

	private Usuario usuario;
	private UsuarioDAO usuarioDAO;
	private Autenticar auth;
	private SistPedidosInt sistPI;

	public UsuarioControle(SistPedidosInt sistPI) {
		usuario = new Usuario();
		usuarioDAO = new UsuarioDAO();
		this.sistPI = sistPI;
		auth = sistPI.auth;

		//Colocar os ActionListener aqui
		auth.getButtonAutenticar().addActionListener(this);
		auth.getButtonCancelar().addActionListener(this);
		sistPI.getItemSair().addActionListener(this);
	}

	public void autenticaUsuario() {
		String nome;
		char[] senha;

		nome = auth.getTextUsuario().getText();
		senha = auth.getFieldSenha().getPassword();

		usuario.setUsuario(nome);
		usuario.setSenha(senha);

		if (usuarioDAO.autenticaUsuario(usuario)) {
			// Mostra o menu SEI no caso de usuário autenticado
			sistPI.getJMenuBar().getMenu(4).setEnabled(true);
		} else {
			System.out.println("Usuário e/ou senha incorretos!");
		}

	}

	public void salvaPedidoInterno () {
	}

	public void fechaJanelas() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Autenticar")) {
			autenticaUsuario();
		} else if (e.getActionCommand().equals("Cancelar")) {
			auth.setVisible(false);
		} else if (e.getActionCommand().equals("Sair")) {
			sistPI.dispose();
		}
	}
}
