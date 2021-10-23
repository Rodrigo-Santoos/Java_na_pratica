package curso_programaçao;

public class Aula28_Funcoes_Matematicas {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(z);
		
		System.out.println("A raiz quadrada de " + x + " é de: " + a);
		System.out.println("A raiz quadrada de " + y + " é de: " + b);
		System.out.println("A raiz quadrada de " + z + " é de: " + c);
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado a " + 2.0 + " = " + b);
		System.out.println("5 elevado ao quadrado = " + c);
		
		a = Math.abs(x);
		b = Math.abs(y);
		c= Math.abs(z);
		
		System.out.println("O valor absoluto de " + x + " é: " + a);
		System.out.println("O valor absoluto de " + y + " é: " + b);
		System.out.println("O valor absoluto de " + z + " é: " + c);
	}
}
