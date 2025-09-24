package model;

public class Produto {
	private String nome;
	private String CPF;
	private boolean admin;
	private String preco;
	private String descricao;

	/**
	 * Construtor da classe candidato.
	 * @param nome Nome do candidato.
	 * @param formacao Formação do candidato.
	 * @param areaDeInteresse Áreas de interesse do candidato.
	 * @param contratado Booleano para representar se o candidato se tornou um contratado.
	 */
	public Produto(String nome, String preco, String descricao){
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	
	}

	/**
	 * Método para exibir os dados do candidato.
	 */
	public void imprimir() {
		System.out.println("Nome: "+ this.nome);
		if(admin==true) {
			System.out.println("admin");
			
		}
		else {
			System.out.println("usuario comum");
		}
		System.out.println("##################################");
	}

	//Getters e setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}



	

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}


