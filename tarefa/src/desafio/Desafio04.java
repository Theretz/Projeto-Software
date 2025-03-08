package desafio;

import java.util.Scanner;


public class Desafio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Seguradora de automóveis 
		//Peça ao usuário: 
		//idade
		//sexo
		//anos de xp como motorista
		//M x<25 x <2: 2000 reais
		//F x<25 x<2: 1800 reais
		//x>25 or x>2: 1200
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Sexo: F OU M ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Anos de experiencia: ");
		int xp = sc.nextInt();
		
		if (sexo == 'M' && idade<=5 && xp<=2) {
			System.out.println("O seguro custa R$ 2.000 ");
		} else if (sexo == 'F' && idade<=25 && xp<=2) {
			System.out.println("O seguro custa R$ 1.800");
		} else if (idade>=25 || xp>=2) {
			System.out.println("O seguro custa R$ 1.200");
		} else {
			System.out.println("Sinto muito mas não temos nenhum plano de seguro para você");
		}
		sc.close();
	}
}
