package desafio;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		//Tabuada
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		
		for(int i=1; 1<=10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}	
		sc.close();
		
	}	
}
