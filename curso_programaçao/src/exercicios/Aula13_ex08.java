package exercicios;

import java.util.Scanner;

public class Aula13_ex08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double valorHora, horas, salario;
		
		System.out.print("Digite o valor que ganha por horas trabalhadas: ");
		valorHora = entrada.nextDouble();
		
		System.out.println("Digite o valor das horas trabalhadas: ");
		horas = entrada.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("O seu salario é de R$ " + salario);
		
		entrada.close();

	}

}
