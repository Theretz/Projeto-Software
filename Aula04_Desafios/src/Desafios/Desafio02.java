package Desafios;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		//Conversor de moedas
		//peça ao usuário um valor em reais e a moeda para conversão
		//Conversão:
		//1-Dólar(R$ 1 = US$0,20)
		//2-Euro(R$ 1 = €0,18)
		//3-Libra(R$ 1 = £0,15)
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Conversor de moedas: ");
		System.out.println("Digite o valor em reais: ");
		
		
		double reais = sc.nextDouble();
		
		
		System.out.println("Conversão: ");
		System.out.println("1-Dólar(R$ 1 = US$0,20)");
		System.out.println("2-Euro(R$ 1 = €0,18)");
		System.out.println("3-Libra(R$ 1 = £0,15)");
		
		
		double dinheiro = sc.nextDouble();
		switch(dinheiro) {
		case 1:
			double dolar = sc.nextDouble();
			reais * 0.20 = dolar;
			System.out.println("O valor da conversão é: " + dolar);
			break;
		case 2:
			double euro = sc.nextDouble();
			reais * 0.18 = euro;
			System.out.println("O valor da conversão é: " + euro);
			break;
		case 3:
			double libra = sc.nextDouble();
			reais * 0.15 = libra;
			System.out.println("O valor da conversão é: " + libra);
			break;
		case default:
			System.out.println("opção inválida");
			break;
		
		}
	sc.close();
	}

}
