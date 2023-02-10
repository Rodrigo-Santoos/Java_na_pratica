import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Estudos\\Downloads\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            //lendo uma linha do arquivo
            String line = br.readLine();

            //loop para ler outras linha
            while (line != null){  //toda vez que terminar de o arquivo ele retorna null
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage() );
        }

    }
}