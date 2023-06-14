## Universidade Federal de Ciências da Saúde de Porto Alegre
### Bacharelado em Informática Biomédica
### Programação Orientada a Objetos II
#### Prof. Luciano Blomberg


### Trabalho Final

Universidade Federal de Ciências da Saúde de Porto Alegre
Bacharelado em Informática Biomédica
Programação Orientada a Objetos II - Turma A e B
Prof. Luciano Blomberg
1. Trabalho Final
Com base nos conhecimentos obtidos nas disciplinas de programação orientada a objetos, implemente atualizações no sistema de pedidos internos desenvolvido na disciplina de POO I em 2022/2. Esse sistema deverá seguir algumas regras gerais (de interface gráfica, por exemplo) e outras regras específicas de negócio. Nos tópicos a seguir, as regras gerais e específicas serão melhor detalhadas. Todas as novas regras ou demandas serão destacadas em vermelho.
[] 1.1. Regras Gerais do Sistema
[] 1.1.1. O Sistema deve ter uma janela principal representado por um JFrame;
[] 1.1.2. A área de conteúdo do JFrame deve usar o gerenciador de Layout CardLayout, sendo utilizada para apresentar as diferentes telas do sistema mediante as escolhas de itens de menu.
[] 1.1.3 Todas as telas do sistema devem usar MigLayout, exceto a inicial.
[] 1.1.4 Todas as telas devem ter dimensões de 665 x 658 (largura e altura, respectivamente).
[] 1.1.5. As telas devem ter os botões “Enviar” e “Cancelar”, exceto a inicial, a tela de autenticação e a tela de Pedidos Internos.
[] ● O botão Enviar deve validar os dados de entrada e gravar o pedido interno em uma ou mais tabelas do banco de dados.
Obs1: Não permita que o pedido interno seja enviado para o banco de dados enquanto os campos especificados com * estejam em branco.
[] ● O botão Cancelar deve limpar a tela e fazer com que o usuário seja remetido ao painel
inicial (painel sem componentes).
[] ● Todos os botões do sistema devem ter ícone.
[] ● Todos os itens de menu do sistema devem ter ícone.
[] ● Todas as caixas de diálogo devem ter ícone customizado.
[] 1.1.6. Todas as mensagens de crítica quanto ao preenchimento de campos podem ser emitidas por meio de caixas de diálogo System.out.println não serão mais admitidas no sistema.
1.1.7. Não é necessário implementar barras de formatação ou anexar arquivos.
1.1.8 . O trabalho deve implementar obrigatoriamente os padrões MVC e DAO.
Obs1 Cada grupo deve implementar a tela de autenticação, escolher UM dos menus acima para
implementar DUAS das TRÊS telas disponíveis referentes ao item de menu escolhido. Os demais
menus serão apenas apresentados na barra de menus, sem a necessidade de implementação
das telas. Adicionalmente, cada grupo deverá incluir um novo menu (Pedidos Internos) com os
itens de menu: i) Consultar e ii) Remover.
Obs2:As telas apresentadas a partir de 1.2.3 são apenas ilustrativas. Figuras são bem-vindas e
em alguns casos, obrigatórias! Cada grupo deve acessar o sistema de pedidos internos da
universidade para verificar o que há de componente e de evento em cada tela.
1.2. Regras Específicas do Sistema
Nesse tópico serão abordados os requisitos a serem atendidos em cada janela do sistema.
1.2.1. Janela Principal
Objetivo: Serve como um ponto central de onde as telas serão chamadas via menu.
Protótipo visual:
Requisitos:
● Deve respeitar todas as regras gerais que se aplicam a esta tela.
● Deve possuir o título: “Sistema de Pedidos Internos”.
● A barra de menu deve apresentar os seguintes menus: Principal, ASCOM, Engenharia,
PROPLAN e, SEI.
● Todos os menus devem estar inacessíveis ao usuário, exceto o menu Principal que
apresentará os itens de menu: i) Autenticar e, ii) Sair
1.2.2 Tela de Autenticação
Requisitos:
● O menu Principal deve ter os itens de menu: Autenticar e Sair.
● Ao clicar no item de menu “Autenticar”, apresenta a tela de Autenticação do
Sistema. Essa tela deve usar componentes JLabel, JTextField, JPasswordField e
JButton.
● Ao clicar no botão “Autenticar”, leia os dados a partir de uma tabela do
banco de dados e verifique se os dados de usuário são válidos. Caso sim,
limpe os dados da tela e libere acesso aos demais menus do sistema. Caso
não, apresente uma caixa de diálogo para informar que a autenticação
falhou.
● Ao clicar no botão “Cancelar”, volte à tela inicial (mantendo o usuário logado
no sistema).
● Ao clicar no item de menu “Sair”, apresente uma caixa de diálogo de confirmação
para saber se o usuário realmente deseja sair do sistema.
1.2.3 ASCOM
Requisitos:
● O menu ASCOM deve possuir os itens de menu: i) Cadastro de rede social afiliada à
UFCSPA , ii) Solicitação de cobertura fotográfica…, iii) Solicitação para uso de Logotipo…
● em i): considere a necessidade de utilizar componentes como JLabel, JTextField e
JButton, bem como os containers adequados.
● em ii), considere a necessidade de utilizar componentes como JLabel, JTextField,
JRadioButton, JTextArea e JButton, bem como os containers adequados. Além dos
eventos de ação, fique atento aos eventos de item de seleção (JRadioButton) que
mostram e ocultam dados em painéis.
● em iii), considere a necessidade de utilizar componentes como JLabel, JTextField,
JRadioButton, JTextArea, JCheckBox e JButton, bem como os containers
adequados.
1.2.4 Engenharia
Requisitos:
● O menu Engenharia deve possuir os itens: i) Manutenção de sistemas de incêndio,
ii) Solicitação de cortinas, iii) EPI's;
● em i): considere a necessidade de utilizar componentes como JLabel, JTextField,
JComboBox e JButton, bem como os containers adequados.
● em ii), considere a necessidade de utilizar componentes como JLabel, JTextField,
JRadioButton, JTextArea e JButton, bem como os containers adequados. Além dos
eventos de ação, fique atento aos eventos de item de seleção (JRadioButton) que
mostram e ocultam dados em painéis.
● em iii), considere a necessidade de utilizar componentes como JLabel, JTextField,
JCheckBox, JTextArea, JComboBox e JButton, bem como os containers
adequados.
1.2.5 PROPLAN
Requisitos:
● O menu PROPLAN deve possuir os itens: i) Pedido de novo computador, ii) Pedido de
instalação provisória, iii) Pedido de Aquisições em TI;
● em i): considere a necessidade de utilizar componentes como JLabel, JTextField,
JComboBox, JTextArea e JButton, bem como os containers adequados.
● em ii): considere a necessidade de utilizar componentes como JLabel, JTextField,
JComboBox, JTextArea e JButton, bem como os containers adequados.
● em iii), considere a necessidade de utilizar componentes como JLabel, JTextField,
JCheckBox, JComboBox, JRadioButton, JTextArea, e JButton, bem como os
containers adequados.
1.2.6 SEI
Requisitos:
● O menu SEI deve possuir os itens: i) Liberação de acesso em unidades, ii) Manutenção do
sistema SEI, iii) Criação de unidades no SEI.
● em i): considere a necessidade de utilizar componentes como JLabel, JTextField,
JRadioButton, JTextArea e JButton, bem como os containers adequados.
● em ii): considere a necessidade de utilizar componentes como JLabel, JTextField,
JRadioButton, JTextArea e JButton, bem como os containers adequados.
● em iii), considere a necessidade de utilizar componentes como JLabel, JTextField,
JTextArea e JButton, bem como os containers adequados.
1.2.6 Pedidos Internos
Requisitos:
● O menu Pedidos Internos deve possuir o item: i) Consultar e ii) Remover
● em i): Consultar, crie uma tela de livre customização, onde deverá haver, no
mínimo, um campo para informar o ID do pedido interno e um outro
componente(JTextArea com barra de rolagem) para apresentar os dados do pedido
interno. Os pedidos internos devem estar obrigatoriamente associados ao usuário
autenticado no sistema. Permita também que todos os pedidos internos do usuário
sejam listados.
● em i): Remover, crie uma tela de livre customização, onde deverá haver, no
mínimo, um campo para informar o ID do pedido interno. Os pedidos internos a
serem removidos devem ser do usuário autenticado. Caso aconteça uma tentativa
de remoção indevida, apresente uma caixa de diálogo informando restrição de
acesso.
1.3. Critérios de Avaliação do Trabalho Final
Todos os trabalhos desenvolvidos serão avaliados conforme os seguintes critérios:
●Atendimento das regras gerais e regras específicas (4,0 pts);
●Utilização de recursos não vistos em aula (1,0pt)
●Organização do código com comentários e nomenclatura padronizada (0,5pt);
●Tratamento de exceções: (0,5pt);
● Persistência em banco de dados (4,0pts);
O trabalho final DEVERÁ ser submetido em sala de entrega no dia: 06/07/2023 até às
23:59 por meio da submissão do arquivo .zip do projeto Java, do modelo lógico do banco
de dados (figura ou pdf) e do arquivo sql utilizado para a criação do banco, tabelas,
inserções, etc. A não efetivação da submissão desses arquivos na quantidade e no
prazo indicado implicará na desconsideração do trabalho para fins de avaliação.
Número mínimo de integrantes nos grupos: 3
Número máximo de integrantes nos grupos: 6
Obs1: Os grupos criados na disciplina de POO I deverão manter a sua formação, exceto
nos casos previamente justificados, onde O PROFESSOR fará a redistribuição dos
integrantes, podendo indicar a necessidade de implementação do terceiro item de menu
presente no menu escolhido.
