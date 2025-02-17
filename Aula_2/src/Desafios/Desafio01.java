package Desafios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		double c = sc.nextInt();
		double f = (c * 9/5) + 32;
		System.out.println("A temperatura é " +f);

	}

}
