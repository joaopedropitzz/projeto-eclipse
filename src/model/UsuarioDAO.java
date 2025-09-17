package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar todos os candidatos 
 * cadastrados durante a execução da aplicação. Os candidatos
 * são armazenados em um Arraylist.
 */
public class UsuarioDAO {
	private final ArrayList<Usuario> listaDeUsuarios;

	/**
	 * Construtor.
	 */
	public UsuarioDAO() {
		this.listaDeUsuarios = new ArrayList<>();
	}

	/**
	 * Método responsável por adicionar um candidato à lista de candidatos.
	 * @param candidato Candidato que será adicionado na lista.
	 */
	public void adicionar(Usuario usuario) {
		if (usuario != null) {
			this.listaDeUsuarios.add(usuario);
		}
	}

	/**
	 * Método responsável por recuperar a lista de candidatos.
	 * @return Arraylist com a lista de candidatos.
	 */
	public List<Usuario> listarTodos() {
		return new ArrayList<>(this.listaDeUsuarios);
	}

	/**
	 * Método responsável por buscar por nome um candidato na lista de candidatos cadastrados.
	 * @param nome Nome do candidato que se deseja buscar.
	 * @return O candidato caso ele seja encontrado e null caso contrário.
	 */
	public Usuario buscarPorCPF(String CPF) {
		for (Usuario usuario : this.listaDeUsuarios) {
			if (usuario.getCPF() == CPF) {
				return usuario;
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
	public boolean atualizar(Usuario usuarioAtualizado) {
		for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
			Usuario usuarioExistente = this.listaDeUsuarios.get(i);

			if (usuarioExistente.getCPF()== (usuarioAtualizado.getCPF())) {
				this.listaDeUsuarios.set(i, usuarioAtualizado);
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