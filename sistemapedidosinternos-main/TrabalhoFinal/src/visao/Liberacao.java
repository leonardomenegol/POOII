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
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;

public class Liberacao extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textoNome;
	private JTextArea textAreaMembro;
	private JButton btnEnviar, btnCancelar;
	private JRadioButton rbdLiberacao;
	private JRadioButton rbdExclusao;
	private JRadioButton rbdTroca;
	
	public Liberacao() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.NORTH);

		JLabel lblTitulo = new JLabel("Libera\u00E7\u00E3o de acesso em unidades");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblTitulo);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow]", "[][41.00][][][][][grow][44.00][38.00]"));

		JLabel lblLogo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(img));
		lblLogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblLogo, "cell 0 0");

		JLabel lblTextoLogo = new JLabel("");
		lblTextoLogo.setText("<html>"
                + "<p><b>Atenção:</b> Somente deverá ser encaminhado PI para criação de unidades se a criação desta não for oriunda de"
                + "fluxo de algum processo administrativo. Caso seja, encaminhar o pedido para o Comitê Gestor   do SEI conforme"
                + "o fluxo do processo que ensejou a criação desta (por e-mail ou por envio do processo para a"
                + "unidade CGSEI).</p>"
                + "</html>");
		lblTextoLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoLogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblTextoLogo, "cell 0 1,alignx left,growy");

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(20, 48, 102));
		panel_1.add(panel_3, "cell 0 5,grow");

		JLabel lblTitulo2 = new JLabel("Solicita\u00E7\u00E3o");
		lblTitulo2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo2.setForeground(new Color(255, 255, 255));
		panel_3.add(lblTitulo2);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, "cell 0 6,grow");
		panel_4.setLayout(new MigLayout("", "[197.00,grow]", "[grow][][][][][38.00][][][38.00][][][101.00][38.00][][][][][][][]"));

		JLabel lblTipo = new JLabel("Tipo de solicita\u00E7\u00E3o *");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblTipo, "cell 0 1");

		JRadioButton rdbLiberacao = new JRadioButton("Libera\u00E7\u00E3o de acesso em unidades");
		rdbLiberacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(rdbLiberacao, "cell 0 2");

		JRadioButton rdbExclusao = new JRadioButton("Exclus\u00E3o de acesso em unidades");
		rdbExclusao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(rdbExclusao, "cell 0 3");

		JRadioButton rbdTroca = new JRadioButton("Troca de usu\u00E1rio em unidades");
		rbdTroca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(rbdTroca, "cell 0 4");

		JLabel lblNome = new JLabel("Nome da unidade *");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblNome, "cell 0 6");

		textoNome = new JTextField();
		textoNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(textoNome, "cell 0 7,growx");
		textoNome.setColumns(10);

		JLabel lblMembro = new JLabel("Membro a ser efetuada a a\u00E7\u00E3o *");
		lblMembro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblMembro, "cell 0 9");

		JLabel lblTextoMembro = new JLabel("Incluir os nomes dos componentes separados por ; ou -. Em caso de...");
		lblTextoMembro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblTextoMembro, "cell 0 10");

		JTextArea textAreaMembro = new JTextArea();
		textAreaMembro.setColumns(10);
		textAreaMembro.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textAreaMembro.setRows(10);
		textAreaMembro.setTabSize(10);
		panel_4.add(textAreaMembro, "cell 0 11,grow");
	//	panel_4.add(scroll);

		JLabel lblPortaria = new JLabel("Portaria de nomea\u00E7\u00E3o *");
		lblPortaria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblPortaria, "cell 0 13");

		JLabel lblTextoPortaria = new JLabel("Deve ser anexado a portaria de nomea\u00E7\u00E3o, troca ou exclus\u00E3o dos...");
		lblTextoPortaria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblTextoPortaria, "cell 0 14");

		JLabel lblArquivo = new JLabel("Arquivo(s) (10 MB m\u00E1x)");
		lblArquivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblArquivo, "cell 0 17,alignx center");

		JLabel lblTextoArquivo = new JLabel("Arraste e solte seu arquivo aqui, ou");
		lblTextoArquivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblTextoArquivo, "cell 0 18,alignx center");

		JButton btnEscolher = new JButton("Escolher arquivos");
		btnEscolher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(btnEscolher, "flowx,cell 0 19,alignx center");

		JLabel lblEscolher = new JLabel("Nenhum arquivo escolhido");
		lblEscolher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblEscolher, "cell 0 19");

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
		return textoNome;
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
