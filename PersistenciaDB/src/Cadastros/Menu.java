package Cadastros;

import java.util.List;

public class Menu {

	public static void main(String[] args) {
		
		PessoaDao pd = new PessoaDao();
		
		try {
			// incluir uma pessoa
			Pessoa p1 = new Pessoa(1, "Jose", "jose@email.com");
			Pessoa p2 = new Pessoa(2, "Joao", "joao@email.com");
			Pessoa p3 = new Pessoa(3, "Maria", "maria@email.com");
			Pessoa p4 = new Pessoa(4, "Marcela", "mama@email.com");
			Pessoa p5 = new Pessoa(5, "Robert", "rob@email.com");
			Pessoa p6 = new Pessoa(6, "Snoopy", "snoopy@email.com");
			
			Pessoa[] pessoas = {p1, p2, p3, p4, p5, p6};
			
			for (Pessoa p : pessoas) {
				pd.incluirPessoa(p);
			}
			
			// alterar pessoa
			Pessoa pessoa = pd.consultarPessoaIndividual(2);
			if (pessoa != null) {
				pessoa.setEmail("joaozinho@email.com");
				
				// chama o metodo que contem o comando update
				// System.out.println("Pessoa: " + pessoa);
				if (pd.alterarPessoa(pessoa)) {
					System.out.println("Pessoa alterada com sucesso!");
				}
				
				// listando todas as pessoas
				List<Pessoa> listaPessoas = pd.ListarPessoas();
				
				for (Pessoa p: listaPessoas) {
					System.out.println(p);
				}
			}
			
			// excluir pessoa
			Pessoa pessoa1 = pd.consultarPessoaIndividual(2);
			// chamar o delete
			pd.excluirPessoa(pessoa1);
			// listando todas as pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for (Pessoa p: listaPessoas) {
				System.out.println(p);
			}
			
			// consultas
			// listar uma pessoa
			Pessoa pes1 = pd.consultarPessoaIndividual(1);
			System.out.println("Código.....: " + pes1.getIdPessoa());
			System.out.println("Nome.......: " + pes1.getNomePessoa());
			System.out.println("Email......: " + pes1.getEmail());
			
			// listar varias pessoas
			List<Pessoa> listaPessoas2 = pd.ListarPessoas();
			for (Pessoa p : listaPessoas) {
				System.out.println("Código.....: " + p.getIdPessoa());
				System.out.println("Nome.......: " + p.getNomePessoa());
				System.out.println("Email......: " + p.getEmail());
				System.out.println("------------------------------------------------");
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
