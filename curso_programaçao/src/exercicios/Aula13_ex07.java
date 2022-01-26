package exercicios;

import java.util.Scanner;

public class Aula13_ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double lado,area,dobro;
		
		System.out.print("Digite o valor do lado do quadrado: ");
		lado = entrada.nextDouble();
		
		area = Math.pow(lado, 2);
		
		dobro = area * 2;
		
		System.out.println("A sua area: " + area);
		System.out.println("O dobro da area é: " + dobro);
		
		entrada.close();

	}

}
