package desafio;

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
			
			
			float reais = sc.nextFloat();
			
			
			System.out.println("Conversão: ");
			System.out.println("1-Dólar(R$ 1 = US$0,20)");
			System.out.println("2-Euro(R$ 1 = €0,18)");
			System.out.println("3-Libra(R$ 1 = £0,15)");
			
			
			int dinheiro = sc.nextInt();
			switch(dinheiro) {
			case 1:
				System.out.println("O valor da conversão é: US$" + String.format("%.2f",reais*0.20+reais) + " dolares");
				break;
			case 2:
				System.out.println("O valor da conversão é:  € " + String.format("%.2f",reais*0.18+reais) + " euros");
				break;
			case 3:
				System.out.println("O valor da conversão é: £ " + String.format("%2.f",reais*0.15+reais) + " libras");
				break;
			default:
				System.out.println("opção inválida");
				break;
			
			}
		sc.close();
		}
	

	}
