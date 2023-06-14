package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

public class Manutencao  extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextArea textAreaMembro;
	private JButton btnEnviar, btnCancelar;
	private JRadioButton rbdLiberacao;
	private JRadioButton rbdExclusao;
	private JRadioButton rbdTroca;
	private JTextField textoNome;
	
	public Manutencao() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.NORTH);

		JLabel lblTitulo = new JLabel("Libera\u00E7\u00E3o de acesso em unidades");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblTitulo);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow]", "[][41.00][][grow][grow][][][][grow][44.00][38.00]"));

		JLabel lblLogo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(img));
		lblLogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblLogo, "cell 0 0");

		JLabel lblTextoLogo = new JLabel("");
		lblTextoLogo.setText("<html><p><b>Setor encarregado:</b> NTI - Desenvolvimento</p> <p><b>Quem pode solicitar:</b> Professores/Técnicos </p></html>");
		lblTextoLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoLogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblTextoLogo, "cell 0 1,alignx left,growy");
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7, "cell 0 3,grow");
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8, "cell 0 4,grow");

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(20, 48, 102));
		panel_1.add(panel_3, "cell 0 7,grow");

		JLabel lblTitulo2 = new JLabel("Solicita\u00E7\u00E3o");
		lblTitulo2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo2.setForeground(new Color(255, 255, 255));
		panel_3.add(lblTitulo2);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, "cell 0 8,grow");
		panel_4.setLayout(new MigLayout("", "[197.00,grow]", "[grow][][][][][38.00][][][38.00][][][101.00][38.00][][][][][][][]"));
										
												JLabel lblTipo = new JLabel("Tipo de solicita\u00E7\u00E3o *");
												lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
												panel_4.add(lblTipo, "cell 0 4");
								
										JRadioButton rdbImpossibilidade = new JRadioButton("Impossibilidade de acesso no sistema\r\n");
										rdbImpossibilidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
										panel_4.add(rdbImpossibilidade, "cell 0 5");
						
								JRadioButton rdbErro = new JRadioButton("Erro");
								rdbErro.setFont(new Font("Tahoma", Font.PLAIN, 12));
								panel_4.add(rdbErro, "cell 0 6");
				
						JRadioButton rbdOutro = new JRadioButton("Outro");
						rbdOutro.setFont(new Font("Tahoma", Font.PLAIN, 12));
						panel_4.add(rbdOutro, "cell 0 7");
		
				JLabel lblDescricao = new JLabel("Descrição da solicitação *");
				lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_4.add(lblDescricao, "cell 0 10");

		JTextArea textAreaDescricao = new JTextArea();
		textAreaDescricao.setColumns(10);
		textAreaDescricao.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textAreaDescricao.setRows(10);
		textAreaDescricao.setTabSize(10);
		panel_4.add(textAreaDescricao, "cell 0 11,grow");

		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_2.add(btnEnviar);

		btnCancelar = new JButton("Cancelar");
		panel_2.add(btnCancelar);

		JPanel panel_5 = new JPanel();
		add(panel_5, BorderLayout.EAST);

		JPanel panel_6 = new JPanel();
		add(panel_6, BorderLayout.WEST);

	}

	public JTextField getTextoNome() {
		return getTextoNome();
	}

	public void setTextoNome(JTextField textoNome) {
		this.textoNome = textoNome;
	}

	public JTextArea getTextAreaMembro() {
		return textAreaMembro;
	}

	public void setTextAreaMembro(JTextArea textAreaMembro) {
		this.textAreaMembro = textAreaMembro;
	}

	public JButton getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}

	public JRadioButton getRbdLiberacao() {
		return rbdLiberacao;
	}

	public void setRbdLiberacao(JRadioButton rbdLiberacao) {
		this.rbdLiberacao = rbdLiberacao;
	}

	public JRadioButton getRbdExclusao() {
		return rbdExclusao;
	}

	public void setRbdExclusao(JRadioButton rbdExclusao) {
		this.rbdExclusao = rbdExclusao;
	}

	public JRadioButton getRbdTroca() {
		return rbdTroca;
	}

	public void setRbdTroca(JRadioButton rbdTroca) {
		this.rbdTroca = rbdTroca;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

}