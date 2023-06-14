package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class LiberacaoAcesso extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNomeUnidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LiberacaoAcesso frame = new LiberacaoAcesso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LiberacaoAcesso() {
		setResizable(false);
		setTitle("Liberação de acesso em unidades");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][][][][][][center][center][center][center][center][][][][][][][]"));
		
		JLabel labelMensagem = new JLabel("Atenção: Somente deverá ser encaminhado PI para criação de unidades se a criação desta não for oriunda de fluxo de algum processo administrativo. Caso seja, encaminhar o pedido para o Comitê Gestor do SEI conforme o fluxo do processo que ensejou a criação desta (por e-mail ou por envio do processo para a unidade CGSEI).");
		labelMensagem.setEnabled(false);
		contentPane.add(labelMensagem, "cell 0 0 1 5");
		
		JLabel labelSolicitação = new JLabel("Solitação");
		labelSolicitação.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(labelSolicitação, "cell 0 5");
		
		JLabel labelTipoSolicitacao = new JLabel("Tipo de solicitação *");
		contentPane.add(labelTipoSolicitacao, "cell 0 6");
		
		JRadioButton radioLiberacaoAcessoUnidade = new JRadioButton("Liberação de acesso em unidades");
		contentPane.add(radioLiberacaoAcessoUnidade, "cell 0 7");
		
		JRadioButton labelExclusãoAcessoUnidades = new JRadioButton("Exclusão de acesso em unidades");
		contentPane.add(labelExclusãoAcessoUnidades, "cell 0 8");
		
		JRadioButton labelTrocaUsuarioUnidade = new JRadioButton("Troca de usuário em unidade");
		contentPane.add(labelTrocaUsuarioUnidade, "cell 0 9");
		
		JLabel labelNomeUnidade = new JLabel("Nome da unidade *");
		contentPane.add(labelNomeUnidade, "cell 0 10");
		
		fieldNomeUnidade = new JTextField();
		contentPane.add(fieldNomeUnidade, "cell 0 11,growx");
		fieldNomeUnidade.setColumns(10);
		
		JLabel labelMembroEfetuadaAcao = new JLabel("Membro a ser efetuada a ação *");
		contentPane.add(labelMembroEfetuadaAcao, "cell 0 12");
		
		JLabel labelMembroEfetuadoAcaoMensagem = new JLabel("Incluir os nomes dos componentes separados por ; ou -. Em caso de troca preencher com: usuário X por usuário Y.");
		contentPane.add(labelMembroEfetuadoAcaoMensagem, "cell 0 13");
		
		JTextPane textPane = new JTextPane();
		contentPane.add(textPane, "cell 0 14 1 10,alignx right");
		
		JLabel labelPortariaNomeacao = new JLabel("Portaria de nomeação *");
		contentPane.add(labelPortariaNomeacao, "cell 0 19");
		
		JLabel labelPortariaNomeacaoMensagem = new JLabel("Deve ser anexado a portaria de nomeação, troca ou exclusão dos membros da unidade.");
		contentPane.add(labelPortariaNomeacaoMensagem, "cell 0 20");
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setToolTipText("");
		textPane_1.setEditable(false);
		contentPane.add(textPane_1, "cell 0 21 1 5,grow");
	}

}
