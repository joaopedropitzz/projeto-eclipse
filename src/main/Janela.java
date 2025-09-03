package main;


import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;

public class Janela extends JFrame {

	private JPanel contentPane;
	private CardLayout cardLayout;
	
	//Telas da aplicação
	private TelaCadastro telaCadastro;
	private TelaCompra telaCompra;
	private TelaIdentificacao telaIdentificacao;
	
	// Constantes para nomear as telas
    public static final String LOGIN_PANEL = "Login";
    public static final String MAIN_PANEL = "Principal";
    public static final String SETTINGS_PANEL = "Configuracoes";

    // Variável de estado: guarda o nome do usuário logado
    private String currentUser;

	/**
	 * Create the frame.
	 */
	public Janela() {
		setTitle("Exemplo de Multiplas Telas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		setLocationRelativeTo(null);
		
		// 1. Cria o CardLayout
        cardLayout = new CardLayout();
        
        // 2. Cria o JPanel que servirá como nosso contentPane
        contentPane = new JPanel(cardLayout);
        contentPane.setPreferredSize(new Dimension(500, 200));
        
        // 3. Instancia todas as telas, passando a referência deste JFrame.
        telaCadastro = new TelaCadastro(this);
        telaCompra = new TelaCompra(this);
        telaIdentificacao = new TelaIdentificacao(this);
        
        // 4. Adiciona as telas ao contentPane.
        contentPane.add(telaCadastro, LOGIN_PANEL);
        contentPane.add(telaCompra, MAIN_PANEL);
        contentPane.add(telaIdentificacao, SETTINGS_PANEL);

		setContentPane(contentPane);
		
		// Inicia na tela de login
        mostrarTela(LOGIN_PANEL);
	}

	// Método genérico para trocar de tela
    public void mostrarTela(String panelName) {
        cardLayout.show(contentPane, panelName);
    }
    
    // Método chamado pelo LoginPanel para ir para a tela principal.
    public void mostraTelaPrincipal(String username) {
        this.currentUser = username;
        telaCompra.updateWelcomeMessage(currentUser); // Atualiza a tela principal com os dados
        mostrarTela(MAIN_PANEL);
    }

    // Método chamado pela TelaPrincipal para ir para as configurações
    public void mostrarTelaConfiguracoes() {
        telaIdentificacao.setCurrentUsername(currentUser); // Prepara a tela de config com dados atuais
        mostrarTela(SETTINGS_PANEL);
    }

    // Método chamado pelo SettingsPanel para salvar as alterações e voltar
    public void atualizarNomeEMostrarPrincipal(String newUsername) {
        this.currentUser = newUsername; // Atualiza o estado da aplicação
        telaCompra.updateWelcomeMessage(currentUser); // Atualiza a tela principal
        mostrarTela(MAIN_PANEL); // Volta para a tela principal
    }
}
