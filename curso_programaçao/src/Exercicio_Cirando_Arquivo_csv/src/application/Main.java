package application;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo Csv: "); //caminho do arquivo
        String caminhoCsv = entrada.nextLine();

        File caminho = new File(caminhoCsv); //passando o caminho com o File para acessar os arquivos

        String caminhoOrigin = caminho.getParent(); //obtendo so o caminho do arquivo
        //System.out.println(caminhoOrigin);

        Boolean sucess = new File(caminhoOrigin + "\\out").mkdir(); //criando a pasta no caminho
        //System.out.println("A pasta foi criada ? " + sucess);


        String criandoArquivo = caminhoOrigin + "\\out\\summary.csv";  //criando o arquivo (csv)

//----------------------------------------------------------------------------------------------------------------------

        //Lendo o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoCsv))){
            String itemsCsv = br.readLine();
            while (itemsCsv != null){
                //pegando os valores do Csv
                String[] campos = itemsCsv.split(","); // separando os campos pelas virgula
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Product(nome,preco,quantidade));//adicionado os valores na classe Product

                itemsCsv = br.readLine();
            }
            //criando arquivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(criandoArquivo))){
                for (Product item: list){
                    bw.write(item.getName() + "," + String.format("%.2f",item.total()));
                    bw.newLine();
                }

                System.out.println("Arquivo " + criandoArquivo + " Criado");

            } catch (IOException io2){
                System.out.println("Error ao escrever no arquivo" + io2.getMessage());
            }


        } catch (IOException io){
            System.out.println("Error de escrever no arquivo " + io.getMessage());
        }

        entrada.close();
    }
}
