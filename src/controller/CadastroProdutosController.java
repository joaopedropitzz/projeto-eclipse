package controller;

import model.Produto;
import model.ProdutoDAO;
import view.TelaCadastroProdutos;

/**
 * Classe responsável pela comunicação entre a view (TelaCadastro) e o model (candidatoDAO).
 */
public class CadastroProdutosController {
	private final TelaCadastroProdutos view;
	private final ProdutoDAO model;
	private final Navegador navegador;

	/**
	 * Construtor da classe
	 * @param view Referência à tela que controla (TelaCadastro).
	 * @param model Referência ao modelo de dados (CandidatoDAO).
	 * @param navegador Referência ao elemento que faz a transição de telas.
	 */
	public CadastroProdutosController(TelaCadastroProdutos view, ProdutoDAO model, Navegador navegador) {
		this.view = view;
		this.model = model;
		this.navegador = navegador;

		//Define o que será executado quando o botão 'Cadastrar' da TelaCadastro for clicado.
		this.view.cadastrar(e -> {
			String nome = view.getNome();
			String preco = view.getPreco();
			String descricao = view.getDescricao();

			if(!nome.equals("") &&
					!preco.equals("") &&
					!descricao.equals("")) {

				Produto p = new Produto(nome, preco, descricao);
				this.model.adicionar(p);

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
