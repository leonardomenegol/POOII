package visao;

import java.awt.CardLayout;

/* authors: Guilherme Pires, Jï¿½ssica Figueira, Mell Matsuda, Samuel Eichner */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SistPedidosInt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JMenuItem itemSair;
	public final Autenticar auth;

	/* Launch the application. */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					SistPedidosInt frame = new SistPedidosInt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame. */

	public SistPedidosInt() {
		setResizable(false);
		setTitle("Sistema de Pedidos Internos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 658);

		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

		JMenu menuPrincipal = new JMenu("Principal");
		barraMenu.add(menuPrincipal);

		JMenuItem itemAutenticar = new JMenuItem("Autenticar");
		menuPrincipal.add(itemAutenticar);

		itemSair = new JMenuItem("Sair");
		menuPrincipal.add(itemSair);

		JMenu menuASCOM = new JMenu("ASCOM");
		menuASCOM.setEnabled(false);
		barraMenu.add(menuASCOM);

		JMenu menuEngenharia = new JMenu("Engenharia");
		menuEngenharia.setEnabled(false);
		barraMenu.add(menuEngenharia);

		JMenu menuPROPLAN = new JMenu("PROPLAN");
		menuPROPLAN.setEnabled(false);
		barraMenu.add(menuPROPLAN);

		JMenu menuSEI = new JMenu("SEI");
		menuSEI.setEnabled(false);
		barraMenu.add(menuSEI);

		JMenuItem itemLiberacao = new JMenuItem("Liberação de acesso em unidades");
		menuSEI.add(itemLiberacao);

		JMenuItem itemCriacao = new JMenuItem("Criação de unidade no SEI");
		menuSEI.add(itemCriacao);

		container = new JPanel();
		container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(container);
		container.setLayout(new CardLayout(0, 0));

		CardLayout card = new CardLayout();
		container.setLayout(card);

		JPanel tva = new JPanel();
		auth = new Autenticar();
		Liberacao tl = new Liberacao();
		Criacao tc = new Criacao();

		container.add(tva,"telaI");
		container.add(auth,"telaAutenticacao");
		container.add(tl,"telaLiberacao");
		container.add(tc,"telaCriacao");

		itemAutenticar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(container, "telaAutenticacao");
			}
		});

		itemLiberacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(container, "telaLiberacao");
			}
		});

		itemCriacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(container, "telaCriacao");
			}
		});
	}

	public JMenuItem getItemSair() {
		return itemSair;
	}

}
