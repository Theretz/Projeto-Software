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
		
		int tentativas = 1;
		
		boolean loop = true;
	
		
		while (!(login.equals(loginSalvo)) || !(senha.equals(senhaSalva)) && loop && tentativas<6) {
			
			tentativas++;
			
			System.out.println("Informe seu login: ");
			login = sc.nextLine();
			
			System.out.println("Informe sua senha: ");
			senha = sc.nextLine();
		}
		
		if((login.equals(loginSalvo)) || (senha.equals(senhaSalva))) {
			System.out.println("Acesso Liberado");
		} else {
			System.out.println("Acesso Negado");
		}
	}
}


