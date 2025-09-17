package controller;

import model.Usuario;
import model.UsuarioDAO;
import view.TelaCadastroUsuarios;

/**
 * Classe responsável pela comunicação entre a view (TelaCadastro) e o model (candidatoDAO).
 */
public class CadastroUsuariosController {
	private final TelaCadastroUsuarios view;
	private final UsuarioDAO model;
	private final Navegador navegador;

	/**
	 * Construtor da classe
	 * @param view Referência à tela que controla (TelaCadastro).
	 * @param model Referência ao modelo de dados (CandidatoDAO).
	 * @param navegador Referência ao elemento que faz a transição de telas.
	 */
	public CadastroUsuariosController(TelaCadastroUsuarios view, UsuarioDAO model, Navegador navegador) {
		this.view = view;
		this.model = model;
		this.navegador = navegador;

		//Define o que será executado quando o botão 'Cadastrar' da TelaCadastro for clicado.
		this.view.cadastrar(e -> {
			String nome = view.getNome();
			String CPF = view.getCPF();
			

			if(!nome.equals("") &&
					!CPF.equals(""))
					 {

				Usuario c = new Usuario(nome, CPF,  false);
				this.model.adicionar(c);

				this.view.limparFormulario();
				this.view.exibirMensagem("Sucesso", "Candidato salvo!", 1);
			}
			else {
				this.view.exibirMensagem("Erro", "Preencha todos os campos!", 0);
			}
		});

		//Define o que será executado quando o botão 'Próximo' da TelaCadastro for clicado.
		this.view.voltar(e -> {
			
				this.navegador.navegarPara("TelaLogin");
			
		});

		//Define o que será executado quando o botão 'Cancelar' da TelaCadastro for clicado.
		
	}

}
