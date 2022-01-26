package exercicios;

import java.util.Scanner;

public class Aula13_ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double mili,raio,area;
		
		System.out.print("Digite a area do Raio: ");
		raio = entrada.nextDouble();
		
		mili = raio /2;
		
		area = Math.pow(mili, 2) * Math.PI;
		
		System.out.println("A area do circulo é: " + area);
		
		entrada.close();

	}

}
