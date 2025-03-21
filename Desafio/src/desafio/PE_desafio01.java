package desafio;

import java.util.Scanner;

public class PE_desafio01 {

	public void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do aluno: ");
		String nome = sc.next();
		System.out.println("Nota número 1: ");
		int n1 = sc.nextInt();
		System.out.println("Nota número 2: ");
		int n2 = sc.nextInt();
		System.out.println("Nota número 3:");
		int n3 = sc.nextInt();
		int media = (n1 + n2 + n3)/3;
		if (media >= 5) {
			System.out.println("Passou");
		} else {
			System.out.println("Reprovado");
		}
	}
}
