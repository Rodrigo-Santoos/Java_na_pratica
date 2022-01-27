package exercicios;

import java.util.Scanner;

public class Aula13_ex09 {

	public static void main(String[] args) {
		//Farenheit para graus Celsius
		Scanner entrada = new Scanner(System.in);

		double fare,celsi;
		
		System.out.println("Digite a temperatura em Farenheit: ");
		fare = entrada.nextDouble();
		
		celsi =(5*(fare-32)/9);
		
		System.out.println("A temperatura Farenheit = "+ fare +" covertida em graus Celsius = " +celsi);
		
		entrada.close();
	}

}
