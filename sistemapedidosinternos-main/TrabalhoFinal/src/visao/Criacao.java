package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JEditorPane;

public class Criacao extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textoSigla;
	private JTextField textoNomeU;
	private JTextField textEmail;
	private JButton btnEnviar;
	private JButton btnCancelar;
	private JTextArea textAreaMembro;
	private JTextArea textAreaObs;
	

	public Criacao() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.NORTH);

		JLabel lblTitulo = new JLabel("Cria\u00E7\u00E3o de unidades no SEI");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblTitulo);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow]", "[][41.00][][][][][grow]"));

		JLabel lblLogo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(img));
		panel_1.add(lblLogo, "flowx,cell 0 0");

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
		panel_4.setLayout(new MigLayout("", "[197.00,grow]", "[][][][][][][][][][][38.00][][][][60.00][][38.00][][][][][][][][][101.00][][70.00][38.00]"));

		JLabel lblNomeUnidade = new JLabel("Nome da unidade *");
		lblNomeUnidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblNomeUnidade, "cell 0 0");

		textoNomeU = new JTextField();
		textoNomeU.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(textoNomeU, "cell 0 1,growx");
		textoNomeU.setColumns(10);

		JLabel lblSigla = new JLabel("Sigla da unidade *");
		lblSigla.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblSigla, "cell 0 4");

		textoSigla = new JTextField();
		textoSigla.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(textoSigla, "cell 0 5,growx");
		textoSigla.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail vinculado a unidade *");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblEmail, "cell 0 8");

		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(textEmail, "cell 0 9,growx");
		textEmail.setColumns(10);

		JLabel lblMembro = new JLabel("Membro a ser efetuada a a\u00E7\u00E3o *");
		lblMembro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblMembro, "cell 0 12");

		JLabel lblTextoMembro = new JLabel("Incluir os nomes dos componentes separados por ; ou -");
		lblTextoMembro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblTextoMembro, "cell 0 13");

		JTextArea textAreaMembro = new JTextArea();
		textAreaMembro.setLineWrap(true);
		textAreaMembro.setColumns(10);
		textAreaMembro.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textAreaMembro.setRows(10);
		textAreaMembro.setTabSize(10);
		panel_4.add(textAreaMembro, "cell 0 14 1 3,grow");

		JLabel lblPortaria = new JLabel("Portaria de nomea\u00E7\u00E3o *");
		lblPortaria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblPortaria, "cell 0 18");

		JLabel lblTextoPortaria = new JLabel("Deve ser anexado a portaria de nomea\u00E7\u00E3o dos membros da unidade");
		lblTextoPortaria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblTextoPortaria, "cell 0 19");

		JLabel lblArquivo = new JLabel("Arquivo(s) (10 MB m\u00E1x)");
		lblArquivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblArquivo, "cell 0 21,alignx center");

		JLabel lblTextoArquivo = new JLabel("Arraste e solte seu arquivo aqui, ou");
		lblTextoArquivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblTextoArquivo, "cell 0 22,alignx center");

		JButton btnEscolher = new JButton("Escolher arquivos");
		btnEscolher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(btnEscolher, "flowx,cell 0 23,alignx center");

		JLabel lblEscolher = new JLabel("Nenhum arquivo escolhido");
		lblEscolher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblEscolher, "cell 0 23");

		JLabel lblObs = new JLabel("Observa\u00E7\u00F5es");
		lblObs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblObs, "cell 0 26");

		JTextArea textAreaObs = new JTextArea();
		textAreaObs.setLineWrap(true);
		textAreaObs.setTabSize(10);
		textAreaObs.setRows(10);
		textAreaObs.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textAreaObs.setColumns(10);
		
		panel_4.add(textAreaObs, "cell 0 27 1 2,grow");

		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_2.add(btnEnviar);

		btnCancelar = new JButton("Cancelar");
		panel_2.add(btnCancelar);

		JPanel panel_5 = new JPanel();
		add(panel_5, BorderLayout.EAST);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_5.add(scrollPane);

		JPanel panel_6 = new JPanel();
		add(panel_6, BorderLayout.WEST);

	}

	public JTextField getTextoSigla() {
		return textoSigla;
	}

	public void setTextoSigla(JTextField textoSigla) {
		this.textoSigla = textoSigla;
	}

	public JTextField getTextoNomeU() {
		return textoNomeU;
	}

	public void setTextoNomeU(JTextField textoNomeU) {
		this.textoNomeU = textoNomeU;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	public JButton getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}

	public JTextArea getTextAreaMembro() {
		return textAreaMembro;
	}

	public void setTextAreaMembro(JTextArea textAreaMembro) {
		this.textAreaMembro = textAreaMembro;
	}

	public JTextArea getTextAreaObs() {
		return textAreaObs;
	}

	public void setTextAreaObs(JTextArea textAreaObs) {
		this.textAreaObs = textAreaObs;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

}
