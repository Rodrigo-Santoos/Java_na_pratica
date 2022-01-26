package exercicios;

import java.util.Scanner;

public class Aula13_ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;
		
		System.out.print("Escreva um numero: ");
		n = entrada.nextInt();
		
		System.out.println("O numero informado foi: " + n);
		entrada.close();
	}

}
