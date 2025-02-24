package Condições;

import java.util.Scanner;

public class Compras {
	public static void main(String[] args) {
		//Maquina de cartão
		
		//Capturar o valor de uma compra e metodo de pagamento 
		
		//1 - Dinheiro/Pix - 10% de desconto
		//2 - Debito - 5% de desconto 
		//3 - Credito - sem desconto 
		//    -A vista = ValorTotal
		//    -2x - 5% de juros
		//    -3x - 10% de juros
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da sua compra: ");
		double ValordaCompra = sc.nextDouble();
		
		System.out.println("Método de pagamento: ");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int metodopagamento = sc.nextInt();
		
		switch (metodopagamento) {
			
			case 1:
				double ValorFinal = ValordaCompra * 0.9;
				System.out.println("O valor da sua compra ficou: " + ValorFinal);
				break;
			case 2:
				ValorFinal = ValordaCompra * 0.95;
				System.out.println("O valor da compra ficou: " + ValorFinal);
				break;
			case 3:
				System.out.println("O valor da compra ficou: " + ValordaCompra);
				System.out.println("!! "
						+ "Método de parcelamento: "
						+ "!!");
				System.out.println("1 - 2x");
				System.out.println("2 - 3x");
				System.out.println("3 - À vista");
				int Parcelamento = sc.nextInt();
					switch(Parcelamento) {
						case 1:
							ValorFinal = ValordaCompra * 1.05;
							System.out.println("O valor da parcela ficou: " + ValorFinal/2);
							break;
						case 2:
							ValorFinal = ValordaCompra * 1.10;
							System.out.println("O valor da compra ficou: " + ValorFinal/3);
							break;
						case 3:
							System.out.println("O valor da compra ficou: " + ValordaCompra);
							break;
						default:
							System.out.println("Opção invalida");
							break;
					}
					
				break;
			default:
				System.out.println("Opção invalida");
				break;
		}
		
		sc.close();
	}	
}
