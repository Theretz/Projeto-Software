package Variaveis;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		// + -> Adição 
		// - -> Subtração
		// / -> Divisão 
		// * -> Multiplicação 
		// % -> Módulo 
		
		//Operador potência
		double potencia = Math.pow(2, 3);
		System.out.println(potencia);
		
		//Operador Raiz Quadrada
		double raizQuadrada = Math.sqrt(16);
		System.out.println(raizQuadrada);
		
		//Número Aleatório
		double numeroAleatorio = Math.random();
		System.out.printf("%.1f %n", numeroAleatorio);
		System.out.println("Finalizado");

	}

}
