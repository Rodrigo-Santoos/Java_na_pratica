import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String strPath = entrada.nextLine();

        File path = new File(strPath);

        //==========================================================
        //pegando o nome do arquivo do caminho especificado
        System.out.println("Nome do arquivo (getName): " + path.getName());

        //==========================================================
        //pegando o nome do caminho especificado
        System.out.println("Nome do arquivo (getParent): " + path.getParent());

        //==========================================================
        //pegando todo caminho
        System.out.println("Nome do arquivo (getPath): " + path.getPath());



        entrada.close();
    }
}