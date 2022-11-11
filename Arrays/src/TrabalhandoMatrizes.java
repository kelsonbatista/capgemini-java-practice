import javax.swing.JOptionPane;

public class TrabalhandoMatrizes {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo de notas, fazer media e exibir de acordo com a media
		 */
		
		// vetor de alunos
		String[] alunos = {"Jose", "Joao", "Maria" };
		
		// matriz de notas - 3 alunos e 4 notas
		float[][] notas = new float[3][4];

		// soma das notas e media
		float somaNotas, mediaNotas;
		
		// status se esta aprovado, recuperacao ou reprovado
		String statusAluno;
		
		// informar as notas para cada aluno
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno: " + alunos[i]);
			
			somaNotas = 0;
			mediaNotas = 0;
			
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + j + " de " + alunos[i] + " :"));
				somaNotas += notas[i][j];
			}
			mediaNotas = somaNotas / 4;
			
			if (mediaNotas < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaNotas >= 5.5 && mediaNotas <= 7.5) {
				statusAluno = "RECUPERAÇÃO";
			} else {
				statusAluno = "APROVADO";
			}
			
			System.out.println("\n************ BOLETIM *************");
			System.out.println("Aluno: " + alunos[i]);
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j+1) + ": " + notas[i][j]);
			}
			System.out.println("Status do aluno " + alunos[i] + ": " + statusAluno + " | Média: " + mediaNotas);
			System.out.println("\n**********************************");
		}
	}

}
