import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o caminho das pastas: ");
        String caminhoPasta = entrada.nextLine();


        File caminho = new File(caminhoPasta);

        //===================================================================
        //pegando as pastas

        File [] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas neste caminho:");
        for (File pasta : pastas){
            System.out.println(pasta);
        }

        //===================================================================
        //pegando so os arquivos
        File [] arquivos = caminho.listFiles(File::isFile);
        System.out.println("Arquivos nesse caminho");
        for (File arquivo: arquivos){
            System.out.println(arquivo);
        }

        //===================================================================
        //criando pasta no caminho escrito
        boolean sucesso = new File(caminhoPasta + "//pastanova").mkdir();
        if (sucesso == true){
            System.out.println("Pasta criada com " + sucesso + " no caminho " + caminhoPasta);
        } else {
            System.out.println("Pasta nao criada");
        }


        entrada.close();
    }
}