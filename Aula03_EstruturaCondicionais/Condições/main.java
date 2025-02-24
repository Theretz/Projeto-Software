package Condições;

import java.util.Scanner;

public class main {
	//Calcule a media do usuario e diga se ele foi 
	// -Aprovado: 7.0 a 10.0
	// -Recuperação: 5.0 a 6.9
	// -Reprovado: 0 a 4.9
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A sua media foi de: " + media);
	

		
		if(media>=7) {
			System.out.println("Aprovado");
		}
		else if (media >= 5) {
			System.out.println("Recuperação");
			System.out.println("!!"+ "Prova"+ "!!");
			System.out.println("Sua nota na prova de recuperação: ");
			double notarec = sc.nextDouble();
			media = notarec;
			if(notarec>=7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			
		}
		else {
			System.out.println("Reprovado");
		}
		
		
	
		sc.close();
	}
	
}
