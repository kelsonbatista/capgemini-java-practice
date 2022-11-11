package Programa1;

import Programa1.Aluno.STATUS;
import Programa1.Aluno.MATRICULA;

public class Construtor {

	public static void main(String[] args) {
		// passando os dados atraves do construtor com sobrecarga
		Aluno alu = new Aluno(8, 8, 8);
		// calculando a media
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		// definindo situacao do aluno
		if (mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo a situacao do aluno
		System.out.println("A média do aluno é: " + mediaAlunoFinal + " e ele está " + alu.situacaoAluno);

		// usa enum matricula
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O aluno está: " + alu.situacaoMatricula);
	}

}
