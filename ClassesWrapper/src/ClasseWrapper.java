
public class ClasseWrapper {

	public static void main(String[] args) {
		/*
		 * um tipo primitivo não tem como transformar em objeto a nao ser em classes wrapper
		 * autoboxing - exemplos
		 */
		
		Boolean bolWrapper = true;
		System.out.println(bolWrapper.getClass());
		
		Character charWrapper = 'a';
		System.out.println(charWrapper.getClass());
		
		Byte byteWrapper = 1;
		System.out.println(byteWrapper.getClass());
		
		Short shortWrapper = 'B';
		System.out.println(shortWrapper.getClass());

		Integer intWrapper = 5215;
		System.out.println(intWrapper.getClass());
		
		Long longWrapper = 145454243234L;
		System.out.println(longWrapper.getClass());
		
		Float floatWrapper = 3.14159f;
		System.out.println(floatWrapper.getClass());
		
		Double doubleWrapper = 3.14159;
		System.out.println(doubleWrapper.getClass());
		
		// exmeplo de implementação
		// ex. usar um numero em string "1", nao é possive aplicar direito em numero
		// tem que fazer unboxing
		int numero = Integer.parseInt("1"); // Integer é a classe wrapper
		numero += 1;
		System.out.println(numero);
	}

}
