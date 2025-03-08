package desafio;

import java.util.Scanner;

public class Desafio03 {
	
	private static float valorTotal;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taxa de empréstimo 
		//Peça ao usuário o valor de um empréstimo 
		//Número de parcelas desejadas (6,12 ou 24 meses)
		//Estrutura switch para calcular. Considerando as taxas:
		//6 meses: +5% do valor total
		//12 meses: +10% do valor total
		//24 meses: +20% do valor total
		//Mostre o valor total a ser pago 
		System.out.println("Valor do empréstimo: ");
		float valorEmprestimo = sc.nextFloat();
		
		System.out.println("Números de parcelas para: "  +valorEmprestimo);
		System.out.println("1 - 6 meses: +5% do valor total");
		System.out.println("2 - 12 meses: +10% do valor total");
		System.out.println("3 - 24 meses: +20% do valor total");
		int numPar = sc.nextInt();
		switch(numPar) {
		case 1:
			valorTotal = (float) (valorEmprestimo + (valorEmprestimo * 0.005));
			System.out.println("Este é o valor final: " + valorTotal);
			break;
		case 2:
			valorTotal = (float) (valorEmprestimo + (valorEmprestimo * 0.010));
			System.out.println("Este é o valor final: " + valorTotal);
			break;
		case 3:
			valorTotal = (float) (valorEmprestimo + (valorEmprestimo * 0.018));
			break;
		default:
			System.out.println("opção inválida");
		sc.close();
		}
	}

}
