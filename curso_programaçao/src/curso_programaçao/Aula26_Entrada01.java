package curso_programaçao;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Entrada01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); //voce troca a virgula pelo ponto ex: 4,0 para  4.0
		
		Scanner entrada = new Scanner(System.in);
		
		char y, z;
		Double x ;
		
		System.out.print("Digite um valor: ");
		x = entrada.nextDouble();
		
		System.out.print("Digite que mostrae primeira letra: ");
		y = entrada.next().charAt(0);
		
		
		System.out.println("Voce digitou: " + x);
		System.out.println("A primeira letra é: " + y);
	
		
		
		
		entrada.close();
	}

}
