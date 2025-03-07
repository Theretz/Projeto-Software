package Desafios;

import java.lang.Math;
import java.util.Scanner;

public class Desafio_01 {

	private static int rand;

	public static void main(String[] args) {
	//Jogo de advinhação 
		
	//Gerar um número de 1 a 10
	//jogador terá de advinhar o número 
	//Mensagem se acertou ou errou 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Jogo da advinhação: ");

		
		
			int max = 10;
			int min = 0;
			
			int range = max - min + 1;
			
			for(int i = 0; i<1; i++) {
				rand = (int) (Math.random()* range) + min;
			}
			
			System.out.println("Número de tentativas");
			System.out.println("1-easy (bebezão 😭)");
			System.out.println("2-normal (sigma 😠)");
			System.out.println("3-hard (alfha 😡)");
			int tentativas = sc.nextInt();
				switch(tentativas) {
					case 1:
						System.out.println("Digite o número: ");
						int tentativa1 = sc.nextInt();		
						if (tentativa1 == rand) {
							System.out.println("Parabéns você ACERTOU !!");
							break;
						} else {
							System.out.println("Sinto muito você errou");
							System.out.println("01/03");
							
						}
					case 2:
						System.out.println("Digite o número: ");
						int tentativa2 = sc.nextInt();
						if (tentativa2 == rand) {
							System.out.println("Parabéns você ACERTOU !!");
							break;
						} else {
							System.out.println("Sinto muito você errou");
							System.out.println("02/03");
							
						}
					case 3:
						System.out.println("Digite o número: ");
						int tentativa3 = sc.nextInt();
						if (tentativa3 == rand) {
							System.out.println("Parabéns você ACERTOU !!");
							break;
						} else {
							System.out.println("Sinto muito você errou 😭");
							System.out.println("03/03");
							System.out.println("GAME OVER");
							System.out.println("o número era: " + rand);
							break;
						}
				default:
					System.out.println("opção inválida");
					break;
				}
				
			sc.close();
	}
}
		
		