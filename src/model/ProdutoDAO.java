package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
	private final ArrayList<Produto> listaDeProdutos;

	/**
	 * Construtor.
	 */
	public ProdutoDAO() {
		this.listaDeProdutos = new ArrayList<>();
	}

	/**
	 * Método responsável por adicionar um candidato à lista de candidatos.
	 * @param candidato Candidato que será adicionado na lista.
	 */
	public void adicionar(Produto produto) {
		if (produto != null) {
			this.listaDeProdutos.add(produto);
		}
	}

	/**
	 * Método responsável por recuperar a lista de candidatos.
	 * @return Arraylist com a lista de candidatos.
	 */
	public List<Produto> listarTodos() {
		return new ArrayList<>(this.listaDeProdutos);
	}

	/**
	 * Método responsável por buscar por nome um candidato na lista de candidatos cadastrados.
	 * @param nome Nome do candidato que se deseja buscar.
	 * @return O candidato caso ele seja encontrado e null caso contrário.
	 */
	public Produto buscarPorNome(String nome) {
		for (Produto produto : this.listaDeProdutos) {
			if (produto.getNome() == nome) {
				return produto;
			}
		}
		return null;
	}

	/**
	 * Método responsável por atualizar um candidato da lista. 
	 * Ao encontrar o candidato pelo nome, altera-se o elemento na lista pelo recebido por parâmetro. 
	 * @param candidatoAtualizado Candidato com os dados atualizados.
	 * @return
	 */
	public boolean atualizar(Produto produtoAtualizado) {
		for (int i = 0; i < this.listaDeProdutos.size(); i++) {
			Produto produtoExistente = this.listaDeProdutos.get(i);

			if (produtoExistente.getCPF()== (produtoAtualizado.getNome())) {
				this.listaDeProdutos.set(i, produtoAtualizado);
				return true;
			}
		}
		return false;
	}

	/**
	 * Método responsável por alterar o status de todos 
	 * os candidatos da lista para 'contratado'.
	 */
	

	/**
	 * Método responsável por alterar o status de todos
	 * os candidatos da lista para 'candidato'.
	 */

}
