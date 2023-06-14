## Universidade Federal de Ciências da Saúde de Porto Alegre
### Bacharelado em Informática Biomédica
### Programação Orientada a Objetos - Turma A e B
#### Prof. Luciano Blomberg


### Trabalho Final

Com base nos conhecimentos obtidos ao longo do semestre, implemente um programa em Java para disponibilizar uma versão desktop simplificada do sistema de pedidos internos da UFCSPA. Esse sistema deverá seguir algumas regras gerais (de interface gráfica, por exemplo) e outras regras específicas de negócio. Nos tópicos a seguir, essas regras gerais e específicas serão melhor detalhadas.

#### 1.1. Regras Gerais do Sistema

- [x] 1.1.1. O Sistema deve ter uma janela principal representado por um JFrame;

- [ ] 1.1.2. A área de conteúdo do JFrame deve usar o gerenciador de Layout CardLayout, sendo utilizada para apresentar as diferentes telas do sistema mediante as escolhas de itens de menu.

- [ ] 1.1.3 Todas as telas do sistema devem usar MigLayout, exceto a inicial.

- [x] 1.1.4 Todas as telas devem ter dimensões de **665 x 658** (largura e altura, respectivamente).

- [ ] 1.1.5. As telas devem ter os botões **“Enviar”** e **“Cancelar”**, exceto a inicial.
  - [ ] O botão Enviar deve validar os dados de entrada e gravar o pedido interno em arquivo, exceto no caso da autenticação de usuário.
  
  - [ ] Obs1: Não permita que o pedido interno seja gerado enquanto campos especificados com * estejam em branco.
  
  - [ ] Obs2: Caso tudo esteja devidamente preenchido, grave os dados do pedido interno no arquivo `pedidos.txt` ao clicar no botão “Enviar”. Ex: número do pedido interno#data e horário#tipo#campo1#campo2#campoN...
  
  - [ ] O botão Cancelar deve limpar a tela e fazer com que o usuário seja remetido ao painel inicial (painel sem componentes).
  
- [ ] 1.1.6. Todas as mensagens de crítica quanto ao preenchimento de campos podem ser emitidas no console da aplicação (não é preciso utilizar caixas de diálogo, nem criar labels específicos para essa finalidade).

1.1.7. Não é necessário implementar barras de formatação ou anexar arquivos.

- [ ] 1.1.8 . O trabalho deve implementar obrigatoriamente os padrões MVC e DAO.

- [ ] Obs1: Cada grupo deve implementar a tela de autenticação e escolher UM dos menus acima para implementar DUAS das TRÊS telas disponíveis referentes ao item de menu escolhido. Os demais menus serão apenas apresentados na barra de menus, sem a necessidade de implementação das telas.
- [ ] Obs2: As telas apresentadas a partir de 1.2.3 são apenas ilustrativas. Não há a obrigatoriedade de implementar painéis com cores ou utilizar figuras. Cada grupo deve acessar o sistema de pedidos internos da universidade para verificar o que há de componente e de evento em cada tela.

 #### 1.2. Regras Específicas do Sistema
 
Nesse tópico serão abordados os requisitos a serem atendidos em cada janela do sistema.

1.2.1. Janela Principal

  Objetivo: Serve como um ponto central de onde as telas serão chamadas via menu. Protótipo visual:

  <img width="602" alt="image" src="https://user-images.githubusercontent.com/35051/208975950-ebadbfaf-ffcb-4cb7-87ab-49056b92863d.png">

  Requisitos:

  - [ ] Deve respeitar todas as regras gerais que se aplicam a esta tela.
  - [x] Deve possuir o título: “Sistema de Pedidos Internos”.
  - [x] A barra de menu deve apresentar os seguintes menus: Principal, ASCOM, Engenharia,
PROPLAN e, SEI.
  - [x] Todos os menus devem estar inacessíveis ao usuário, exceto o menu Principal que
apresentará os itens de menu: i) Autenticar e, ii) Sair
 
 1.2.2 Tela de Autenticação
  
  <img width="611" alt="image" src="https://user-images.githubusercontent.com/35051/208978023-e26977d0-d5b9-4b2c-9929-177fd7d27d9a.png">
  
  Requisitos:

  - [x] O menu Principal deve ter os itens de menu: Autenticar e Sair.
  - [x] Ao clicar no item de menu “Autenticar”, apresente a tela de Autenticação do Sistema. Essa tela deve usar componentes JLabel, JTextField, JPasswordField e JButton.
  - [x] Ao clicar no botão “Autenticar”, leia os dados do arquivo usuarios.txt e verifique se os dados de usuário são válidos. Caso sim, limpe os dados da tela e libere acesso aos demais menus do sistema. Caso não, emita uma mensagem via System.out.println para informar que a autenticação falhou.
  - [x] Ao clicar no botão “Cancelar”, apresente a tela inicial.
  - [x] Ao clicar no item de menu “Sair”, o sistema deve ser finalizado.

 1.2.3 ASCOM
 
 <img width="815" alt="image" src="https://user-images.githubusercontent.com/35051/208978120-022a4521-2fea-4284-82a0-92315831a0cb.png">
 
 Requisitos:
 
 - [ ] O menu ASCOM deve possuir os itens de menu: i) Cadastro de rede social afiliada à UFCSPA , ii) Solicitação de cobertura fotográfica..., iii) Solicitação para uso de Logotipo...
  - [ ] em i): considere a necessidade de utilizar componentes como JLabel, JTextField e JButton, bem como os containers adequados.
  - [ ] em ii), considere a necessidade de utilizar componentes como JLabel, JTextField, JRadioButton, JTextArea e JButton, bem como os containers adequados. Além dos eventos de ação, fique atento aos eventos de item de seleção (JRadioButton) que mostram e ocultam dados em painéis.
  - [ ] em iii), considere a necessidade de utilizar componentes como JLabel, JTextField, JRadioButton, JTextArea, JCheckBox e JButton, bem como os containers adequados.


 1.2.4 Engenharia
 
  <img width="837" alt="image" src="https://user-images.githubusercontent.com/35051/208978208-f511f0a6-3317-4fa3-a2b7-95aad6088584.png">
 
   Requisitos:
   
  - [ ] O menu Engenharia deve possuir os itens: i) Manutenção de sistemas de incêndio, ii) Solicitação de cortinas, iii) EPI's;
    - [ ] em i): considere a necessidade de utilizar componentes como JLabel, JTextField, JComboBox e JButton, bem como os containers adequados.
    - [ ] em ii), considere a necessidade de utilizar componentes como JLabel, JTextField, JRadioButton, JTextArea e JButton, bem como os containers adequados. Além dos eventos de ação, fique atento aos eventos de item de seleção (JRadioButton) que mostram e ocultam dados em painéis.
    - [ ] em iii), considere a necessidade de utilizar componentes como JLabel, JTextField, JCheckBox, JTextArea, JComboBox e JButton, bem como os containers adequados.

 1.2.5 PROPLAN
 
 <img width="820" alt="image" src="https://user-images.githubusercontent.com/35051/208978292-16cb7a7a-124c-4203-9878-c85f2a3af5d4.png">
 
   Requisitos:
   
  - [ ] O menu PROPLAN deve possuir os itens: i) Pedido de novo computador, ii) Pedido de instalação provisória, iii) Pedido de Aquisições em TI;
    - [ ] em i): considere a necessidade de utilizar componentes como JLabel, JTextField, JComboBox, JTextArea e JButton, bem como os containers adequados.
    - [ ] em ii): considere a necessidade de utilizar componentes como JLabel, JTextField, JComboBox, JTextArea e JButton, bem como os containers adequados.
    - [ ] em iii), considere a necessidade de utilizar componentes como JLabel, JTextField, JCheckBox, JComboBox, JRadioButton, JTextArea, e JButton, bem como os containers adequados.

 1.2.6 SEI
 
   <img width="790" alt="image" src="https://user-images.githubusercontent.com/35051/208978394-e7f71e99-352a-423b-85cf-a11705c5bb6c.png">
 
   Requisitos:
   
  - [ ] O menu SEI deve possuir os itens: i) Liberação de acesso em unidades, ii) Manutenção do sistema SEI, iii) Criação de unidades no SEI.
    - [ ] em i): considere a necessidade de utilizar componentes como JLabel, JTextField, JRadioButton, JTextArea e JButton, bem como os containers adequados.
    - [ ] em ii): considere a necessidade de utilizar componentes como JLabel, JTextField, JRadioButton, JTextArea e JButton, bem como os containers adequados.
    - [ ] em iii), considere a necessidade de utilizar componentes como JLabel, JTextField, JTextArea e JButton, bem como os containers adequados.

 #### 1.3. Critérios de Avaliação do Trabalho Final
 
Todos os trabalhos desenvolvidos serão avaliados conforme os seguintes critérios:

  - [ ] Atendimento das regras gerais e regras específicas (4,0 pts);
  - [ ] Utilização de recursos não vistos em aula (1,0pt)
  - [ ] Organização do código com comentários e nomenclatura padronizada (1,0pt);
  - [ ] Tratamento de exceções: (1,0pt);
  - [ ] Persistência em arquivos (3,0pt);
  
 #### Entrega
 
O trabalho final DEVERÁ ser submetido em sala de entrega no dia: **20/01/2023 até às 23:59 (Turma A e B)** por meio da submissão do arquivo .zip do projeto Java. A não efetivação da submissão desses arquivos na quantidade e no prazo indicado implicará na desconsideração do trabalho para fins de avaliação.

- [x] Número mínimo de integrantes nos grupos: 3 Número máximo de integrantes nos grupos: 4

Obs1: Não é permitida a formação de grupos entre os integrantes da turma A e B;

Obs2: Na turma A, cada grupo deverá escolher um menu diferente. Na turma B, dado o maior número de grupos, será permitido que DOIS grupos, no máximo, trabalhem em um mesmo menu desde que todos os demais já tenham sido escolhidos.

Obs3: Trabalhos com cópia de código resultarão em nota zero para todos os grupos envolvidos, independentemente da autoria.

Obs4: Na SEMANA 16 serão agendados horários extras para auxiliar os grupos no desenvolvimento do trabalho. E por fim, a SEMANA 17 será utilizada para que os grupos desenvolvam o trabalho em aula e, com o acompanhamento do professor.
