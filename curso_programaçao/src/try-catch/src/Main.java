import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        metodoTryCatch();

        System.out.println("Fim :)");

    }

    public static void metodoTryCatch (){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite os nomes para adicionar no vetor: ");
        String [] vect = entrada.nextLine().split(" ");

        try {
            System.out.print("Digite qual posiçao voce quer consultar: ");
            int posi = entrada.nextInt();

            System.out.println(vect[posi]);
        }
        catch (ArrayIndexOutOfBoundsException arrayErro){
            System.out.println("So existe " + vect.length + " posiçoes salvas!");
        }
        catch (InputMismatchException inputErro){
            System.out.println("Precisa digitar em numeros inteiros!");
        }

        entrada.close();
    }
}