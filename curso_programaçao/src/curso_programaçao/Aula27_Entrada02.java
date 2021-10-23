package curso_programaçao;

import java.util.Scanner;

public class Aula27_Entrada02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int x;
		String s1, s2,s3;
		
		System.out.print("Digite um numero inteiro: ");
		x = entrada.nextInt();
		
		entrada.nextLine(); 
		
		System.out.print("Digite o primeiro dado: ");
		s1 = entrada.nextLine();
		
		System.out.print("Digite os segundo: ");
		s2 = entrada.nextLine();
		
		System.out.print("Digite o terceiro: ");
		s3 = entrada.nextLine();
		
		System.out.println("Dados Digitados");
		System.out.println("Numero inteiro digitado: " +x);
		System.out.println("Primeiro dado: " + s1);
		System.out.println("Segundo dado: " + s2);
		System.out.println("Terceiro dado: " + s3);
		
		
		
		entrada.close();

	}

}
