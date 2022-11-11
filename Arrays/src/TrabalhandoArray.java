import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		// declaração de array de paises
		String[] paises = new String[4];
		// declaração de array de numeros
		int[] numeros = new int[10];
		
		/*
		// inserindo paises no array
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Digite um país: ");
		}
		
		// mostrando o array de paises
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
		*/
		// inserindo numeros no array
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		}
		
		// mostrando os numeros
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		int novoValor = 220;
		numeros[8] = novoValor;

		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
	}

}
