package desafio;

import java.util.Scanner;

public class Desafio0607 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//Verificação do triângulo válido 
		//programa que recebe os lados dos triângulos
		//Verificar se o triângulo é válido
		//condição de existencia:
		//a + b > c
		//a + c > b
		//b + c > a 
	    System.out.println("Verificação do triângulo válido");
	    
	    System.out.println("Lado A do triangulo: ");
	    float a = sc.nextFloat();
	    System.out.println("Lado B do triangulo: ");
	    float b = sc.nextFloat();
	    System.out.println("Lado C do triangulo: ");
	    float c = sc.nextFloat();
	    
	    if (a + b > c) {
	    	System.out.println("Triangulo valido");
	    } else if (a + c > b) {
	    	System.out.println("Triangulo valido");
	    } else if (b + c > a) {
	    	System.out.println("Triandulo valido");
	    } else {
	    	System.out.println("Triangulo invalido");
	    }
	    
	    System.out.println("Tipo do triangulo: ");
	    
	    if (a==b || b==c) {
	    	System.out.println("triangulo equilátero");
	    } else if (a==b || b==c) {
	    	System.out.println("triangulo isóceles");
	    } else if (a!=b || b!=c) {
	    	System.out.println("triangulo escaleno");
	    }
	    
	    sc.close();
	}
}
