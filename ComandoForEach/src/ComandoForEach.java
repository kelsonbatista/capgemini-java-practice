
public class ComandoForEach {

	public static void main(String[] args) {
		
		int[] vetorNumeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// leitura sem uso de foreach
		System.out.println("Leitura sem uso de forEach");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr: " + vetorNumeros[i]);
		}
		
		// leitura com o uso de foreach
		System.out.println("Leitura com uso de forEach");
		for (int i : vetorNumeros) {
			System.out.println("Nr: " + i);
		}
	}

}
