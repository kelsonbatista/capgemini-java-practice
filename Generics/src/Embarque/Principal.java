package Embarque;

import java.util.Scanner;

import Controle.Aeronaves;

public class Principal {

	public static void main(String[] args) {
		/* Informar a quantidade de aeronaves do patio, nr de voos por ordem de chegada
		 * a ordem da decolagem é FIFO, mostrar qual primeiro voo a decolar
		 */
		Scanner sc = new Scanner(System.in);
		Aeronaves aero = new Aeronaves();
		System.out.println("Informe o nr de aeronaves: ");
		int nrAeronaves = sc.nextInt();
		
		// adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			aero.addVoo(nrVoo);
		}
		
		System.out.println("O primeiro a decolar vai ser o nr: " + aero.primeiroVoo());
		aero.listaVoos();
		sc.close();
	}

}
