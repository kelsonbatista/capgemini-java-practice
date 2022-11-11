package Embarque;

import java.util.Scanner;

import Controle.AeronavesComGenerics;

public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AeronavesComGenerics<Integer> aero = new AeronavesComGenerics<>();
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
