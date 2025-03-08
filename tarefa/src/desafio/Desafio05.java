package desafio;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Sistema de descontos 
		//Peça o valor da compra 
		//Peça o número de itens adquiridos
		//Calculo do desconto:
		//valorCompra>=300 || numItens>=3 + (valorCompra + (valorCompra * 0.005))
		//valorCompra>=500 || numItens>=5 + (valorCompra + (valorCompra * 0.010))
		//valorCompra>=1000 + (valorCompra + (valorCompra * 0.020))
		
		System.out.println("Sistema de desconto");
		
		System.out.println("Valor da compra: ");
		float valorCompra = sc.nextFloat();
		
		System.out.println("Número de itens adquiridos: ");
		int numItens = sc.nextInt();
		
		if (valorCompra>=300 || numItens>=3){
			System.out.println(valorCompra - (valorCompra * 0.005));
		} else if (valorCompra>=500 || numItens>=5) {
			System.out.println(valorCompra - (valorCompra * 0.010));
		} else if (valorCompra>=1000) {
			System.out.println(valorCompra - (valorCompra * 0.020));
		}
		
		sc.close();
	}
	

}
