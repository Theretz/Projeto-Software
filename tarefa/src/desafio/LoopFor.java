package desafio;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Tabuada
		
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		
		for(int i =1; 1<=10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}	
		
		
		
	}

}
