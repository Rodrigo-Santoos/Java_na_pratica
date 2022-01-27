package exercicios;

import java.util.Scanner;

public class Aula13_ex10 {

	public static void main(String[] args) {
		//graus Celsius para Farenheit  
		Scanner entrada = new Scanner(System.in);
		
		double fare, celsi;
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		celsi = entrada.nextDouble();
		
		fare =(celsi * 1.8) + 32;
		
		System.out.println("Convertendo graus Celsius = "+ celsi + " para Farenheit = " + fare);
		
		entrada.close();

	}

}
