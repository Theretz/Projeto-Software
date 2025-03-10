package desafio;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Login e senha
		
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		
		String login = "";
		String senha = "";
		
		while (!(login.equals(loginSalvo)) && !(senha.equals(senhaSalva))) {
			System.out.println("Informe seu login: ");
			login = sc.nextLine();
			
			System.out.println("Informe sua senha: ");
			senha = sc.nextLine();
		}
			
		System.out.println("Aceesso liberado");
		sc.close();
	}

}
