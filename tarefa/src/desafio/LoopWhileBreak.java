package desafio;

import java.util.Scanner;

public class LoopWhileBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Loop While Break
		String loginSalvo = "admin";
		String senhaSalva = "123";
		String login = "";
		String senha = "";
		int tentativas = 0;
		int maxTentativas = 5;
		
		while (true) {
			System.out.println("Informe seu login: ");
			login = sc.nextLine();
			
			System.out.println("Informe sua senha");
			senha = sc.nextLine();
			
			if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso Liberado");
				break;
			} else if (tentativas >= maxTentativas) { 
				System.out.println("Número máximo de tentativas excedido, acesso bloqueado");
				break;
			} else {
				tentativas++;
				System.out.println("Acesso Negado");
			}
		}
		
		sc.close();	
	}
}
