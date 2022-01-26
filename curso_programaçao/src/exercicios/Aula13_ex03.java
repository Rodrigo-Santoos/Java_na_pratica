package exercicios;

import java.util.Scanner;

public class Aula13_ex03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, soma;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		n2 = entrada.nextDouble();
		
		soma = n1 + n2;
		
		System.out.println(  n1 + " + " + n2 + " = " + soma);
		entrada.close();

	}

}
