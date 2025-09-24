package main;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import controller.CadastroProdutosController;
import controller.CadastroUsuariosController;
import controller.CompraController;
import controller.LoginController;
import controller.Navegador;
import model.UsuarioDAO;
import model.ProdutoDAO;
import view.Janela;
import view.TelaCadastroProdutos;
import view.TelaCadastroUsuarios;
import view.TelaCompra;
import view.TelaLogin;

/**
 * Classe responsável por inicializar os elementos das 3 camadas: model, view e controller.
 * A execução do programa começa por aqui.
 */
public class Main {
	public static void main(String[] args) {
		//Altera a fonte dos JOptionPane para Arial, 18.
		UIManager.put("OptionPane.messageFont", new FontUIResource(
				new Font("Arial", Font.PLAIN, 18)
				));

		Janela janela = new Janela();
		Navegador navegador = new Navegador(janela);
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		ProdutoDAO produtoDAO = new ProdutoDAO();

		TelaCadastroProdutos telaCadastroProdutos = new TelaCadastroProdutos();
		TelaCadastroUsuarios telaCadastroUsuarios = new TelaCadastroUsuarios();
		TelaCompra telaCompra = new TelaCompra();
		CadastroProdutosController cadastroProdutosController = new CadastroProdutosController(telaCadastroProdutos, produtoDAO, navegador);
		CadastroUsuariosController cadastroUsuariosController = new CadastroUsuariosController(telaCadastroUsuarios, usuarioDAO, navegador);
		CompraController compraController = new CompraController();
		TelaLogin telaLogin = new TelaLogin();
		LoginController loginController = new LoginController();

		

		

		navegador.adicionarPainel("CADASTRO", telaCadastroUsuarios);
		navegador.adicionarPainel("CADASTRO", telaCadastroProdutos);
		navegador.adicionarPainel("COMPRA", telaCompra);
		navegador.adicionarPainel("LOGIN", telaLogin);

		//Seta o jframe para abrir no meio da tela.
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

		navegador.navegarPara("LOGIN");
	}
}
