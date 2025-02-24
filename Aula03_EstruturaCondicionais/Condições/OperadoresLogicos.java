package Condições;

import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//Login e Senha
			
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "vitorfern";
		String senhaSalva = "1234";
		
		String login = sc.next();
		String senha = sc.next();
		
		if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("Acesso negado");
		}
		
		sc.close();
	}
}
