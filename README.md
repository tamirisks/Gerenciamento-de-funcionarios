# Gerenciamento-de-funcionários
Projeto ainda em construção!

# Idéia do projeto
Um programa simples, onde possa ser possível gerenciar a entrada e saída de funcionários de uma empresa, além de informar se o funcionário esteve presente no trabalho no dia. O programa deve também ser capaz de informar em arquivo csv, além de ter atualizações na tabela sempre que o programa for aberto.

# Linguagens e programas
Programa feito com o uso de Figma, o programa Netbeans, a linguagem java, a interface gráfica com swing, e o banco de dados MySQL.

## Partes do projeto:
### 1° Wireframe criado no Figma
Wireframe com 3 telas: 

* **Tela Inicial** - Na tela inicial, apresenta uma tabela para cada funcionário, com o nome, o email, a entrada, a saída e se foi trabalhar naquele dia. Também haverá um botão de "Gerar relatório", que pegará as informações da tabela e colocará em um arquivo csv. A tabela deverá sempre verificar - quando o programa ser iniciado - se no local do programa tem um arquivo csv e, se tiver, pegar as informações dele e adicionar na tabela.
  
* **Tela de seleção** -  Quando clicado em um usuário, uma nova tela surgirá, a "Tela de seleção". Essa tela terá três botões: botão de editar ou excluir o usuário, e o botão de cancelar, que voltará para a tela inicial. Funções dos botões:
  - Botão de editar: encaminha para uma nova tela;
  - Botão de excluir: exclui o funcionário da tabela;
    
* **Tela de edição** - Após clicar no botão de editar o usuário, aparecerá uma nova tela só pra esse funcionário, onde é possível editar o seu nome, email, horário de trabalho e marcar uma checkbox se o funcionário trabalhou naquele dia. Na tela, também terá um botão de para salvar as novas informações.

[Wwireframes com as 3 telas:] (https://www.figma.com/proto/2Rf1uuEaiUeqdZ5BIbmfey/Wireframes-do-gerenciamento?node-id=1-2&p=f&t=VFdknj537iP4U6Dd-0&scaling=min-zoom&content-scaling=fixed&page-id=0%3A1)) 

### 2° Criação das telas no Netbeans
Criação de 3 telas:

* **Tela Inicial** - Tela com 1 jPanel; 1 jLabel ("Gerenciamento de Funcionários"); e 1 JButton (botao_relatorio). **Alterado:** Adicionado um JButton a mais ("Novo funcionário").
  
* **Tela de seleção** -  Tela com 1 jLabel ("Deseja editar ou apagar o usuário?"); e 3 JButton (botao_editar, botao_excluir e botao_cancelar).
    
* **Tela de edição** - Tela com 6 Jlabel ("Editar usuário:","Nome:","Email:","Entrada:","Saída:" e "Trabalhou hoje?"); 2 JRadioButton ("Sim" ou "Não"); 1 JButton (botao_salvar) e 4 JTextField (nome_text, email_text, entrada_text e saida_text).






