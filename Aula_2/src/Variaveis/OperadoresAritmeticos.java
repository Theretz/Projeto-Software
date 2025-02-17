package Variaveis;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next(); //Armazenar valores do tipo texto
		System.out.println(nome);

		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		double peso = sc.nextDouble();
		System.out.println("A sua idade  é de " + idade + "anos");
		System.out.println("o seu peso é de " +peso);
		
		sc.close();
		

	}

}
