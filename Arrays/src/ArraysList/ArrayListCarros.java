package ArraysList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
		// construindo um array de carros
		ArrayList<String> carros = new ArrayList<>();
		
		// adicionando carros na lista
		carros.add("Fusca");
		carros.add("Gol");
		carros.add("Creta");
		carros.add("Opala");
		carros.add("Caravan");
		carros.add("Corcel");
		
		// mostra a lista
		System.out.println(carros + " - Lista atual");
		
		// trocar opala por variante
		carros.set(3, "Variante");
		System.out.println(carros + " - Troca de Opala por Variante");
		
		// remover gol
		carros.remove(1);
		System.out.println(carros + " - Remoção de Gol");
		
		// substituindo quando nao sabe a posição
		if (carros.contains("Caravan")) {
			for (int i = 0; i < carros.size(); i++) {
				if ("Caravan".equals(carros.get(i))) {
					carros.set(i, "Kombi");
					break;
				}
			}
		}
		System.out.println(carros + " - Troca Caravan por Kombi na busca");

		// esvaziando
		carros.clear();;
		System.out.println(carros + " - Limpando lista");
		if (carros.isEmpty()) {
			System.out.println("A lista de carros está vazia");
		}
		
		// adicionando carros manualmente
		for (int i = 0; i < 5; i++) {
			carros.add(JOptionPane.showInputDialog("Digite o nome do carro: "));
		}
		System.out.println(carros);
	}

}
