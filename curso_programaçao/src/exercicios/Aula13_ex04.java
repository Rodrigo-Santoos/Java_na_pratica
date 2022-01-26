package exercicios;

import java.util.Scanner;

public class Aula13_ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1,n2,n3,n4,media;
		
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		n4 = entrada.nextDouble();
		
		media = (n1+n2+n3+n4) / 4;
		
		if(media <= 6) {
			System.out.println("Nota:" + media + " Aluno Reprovado");
		} else {
			System.out.println("Nota: " + media + " Aluno Aprovado");
		}
		
		//System.out.println("A media do aluno é: " + media);
		
		entrada.close();
		
	}
}
