import java.io.*;

public class Main {
    public static void main(String[] args) {

        String [] line = new String[]{ "OLa " , "como vai", "Adeus"};

        String patch = "C:\\Users\\Estudos\\Downloads\\on.txt";

        //============================================================================
        //criando e rescrevendo o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(patch))){
            for (String lines :line){
                bw.write(lines);
                bw.newLine();
            }
        }
        catch (IOException io){
            System.out.println("erro: " + io.getMessage());
        }

        //--------------------------------------------------------------------
        //escrevendo o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(patch,true))){
            for (String lines :line){
                bw.write(lines);
                bw.newLine();
            }
        }
        catch (IOException io){
            System.out.println("erro: " + io.getMessage());
        }

        //===========================================================================
        //lendo o arquivo com metodo
        lendoArquivo(patch);
    }

    public static void lendoArquivo(String cam){
        //============================================================================
        //Lendo as linhas dos arquivos
        try (BufferedReader br = new BufferedReader(new FileReader(cam))){

            String linha = br.readLine();

            while (linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException io){
            System.out.println("erro: " + io.getMessage());
        }
    }
}