package ArraysList;

import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		/*
		 * addFirst()
		 * addLast()
		 * removeFirst()
		 * removeLast()
		 * getFirst()
		 * getLast()
		 */
		
		LinkedList<String> carros = new LinkedList<String>();
		
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ferrari");
		
		// incluindo a marca Mazda no inicio
		carros.addFirst("Mazda");
		System.out.println(carros);
		
		// incluindo a marca Bugatti no inicio
		carros.addLast("Bugatti");
		System.out.println(carros);
		
		// Removendo
		carros.removeFirst();
		carros.removeLast();
		System.out.println(carros);
		
		// pegando as extremidades
		System.out.println(carros.getFirst());
		System.out.println(carros.getLast());
		System.out.println(carros.get(1));

	}

}
