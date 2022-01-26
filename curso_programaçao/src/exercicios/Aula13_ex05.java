package exercicios;

import java.util.Scanner;

public class Aula13_ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int metro,centi;
		
		System.out.print("Digite um valor Metro: ");
		metro = entrada.nextInt();
		
		centi = metro*100;
		
		System.out.println("O valor em centimetros: " + centi +" cm");
		
		entrada.close();
		
	}

}
