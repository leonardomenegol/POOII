package visao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Autenticar extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textUsuario;
	private JPasswordField fieldSenha;
	private JButton btnAutenticar;
	private JButton btnCancelar;

	/**
	 * Create the panel.
	 */
	public Autenticar() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_3 = new JPanel();
		panel.add(panel_3);

		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[294.00,center]", "[][][40.00][][][40.00][]"));

		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(lblUsuario, "flowy,cell 0 0");

		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(textUsuario, "cell 0 1,growx");
		textUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(lblSenha, "cell 0 3");

		fieldSenha = new JPasswordField();
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(fieldSenha, "cell 0 4,growx");

		btnAutenticar = new JButton("Autenticar");
		panel_2.add(btnAutenticar, "flowx,cell 0 6");

		btnCancelar = new JButton("Cancelar");
		panel_2.add(btnCancelar, "cell 0 6");

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
	}

	public JTextField getTextUsuario() {
		return textUsuario;
	}

	public void setTextUsuario(JTextField textUsuario) {
		this.textUsuario = textUsuario;
	}

	public JPasswordField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JPasswordField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JButton getButtonCancelar() {
		return btnCancelar;
	}

	public JButton getButtonAutenticar() {
		return btnAutenticar;
	}
}
