package Programa1;

public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	MATRICULA situacaoMatricula;
	
	// construtor com sobrecarga (varios parametros)
	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	// DEFININDO UM ENUMERADOR
	public enum MATRICULA {
		MATRICULADO,
		PENDENTE,
		RECUSADO
	}
	
	//DEFININDO UM ENUMERADOR
	public enum STATUS {
		APROVADO,
		REPROVADO
	}
	
	public double calcularMediaAluno() {
		double mediaAluno = 0;
		//calculo da media
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
