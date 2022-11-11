package Cadastros;

public class Pessoa {

	private int idPessoa;
	private String nomePessoa;
	private String email;
	
	public Pessoa() {
		
	}
	
	// usado para fazer uma operacao
	public Pessoa(String nomePessoa, String email) {
		super();
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
	
	// usado para fazer uma inclusao
	public Pessoa(int idPessoa, String nomePessoa, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
