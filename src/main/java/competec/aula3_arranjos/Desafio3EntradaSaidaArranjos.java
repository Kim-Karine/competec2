package competec.aula3_arranjos;

import java.util.Scanner;

public class Desafio3EntradaSaidaArranjos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Coletar tamanho arranjo
		System.out.println("Quantos valores na lista ? ");
		int tamanho = leia.nextInt();
		
		int todos [] = new int [tamanho];
		
		for(int repete = 0; repete < tamanho; repete++){
			System.out.println("Index: " + repete);
			todos [repete] = leia.nextInt();

		}
		for(int repete = 0; repete < tamanho; repete++){
			System.out.println("Números : " + todos[repete]);
		}
		// Preencher arranjo

		// Impremir arranjo

		/*
		 * Desafio extra:
		 * Crie outro arranjo e inverta a ordem dos valores do primeiro arranjo.
		 */

	}

}
