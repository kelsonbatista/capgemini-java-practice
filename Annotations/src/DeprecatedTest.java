
public class DeprecatedTest {

	void visualizar() {
		System.out.println("Método visualização");
	}

	void exibir() {
		System.out.println("Mostrando que o método exibir é normal");
	}
	
	
	// @deprecated replaced by display()
	@Deprecated
	void exibirDeprecated() {
		System.out.println("Mostrando que o método exibir é deprecated");
	}
}
