package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List <Product> list = new ArrayList<>();

//==========================================================================

        System.out.print("Enter the number of product: ");
        int numberProduct = entrada.nextInt();

        for (int i = 1 ; i <= numberProduct; i++){

            System.out.println("Product " +i+ " data:");

            entrada.nextLine();
            System.out.print("Common, used or imported (c/u/i)?: ");
            char cui = entrada.nextLine().charAt(0);

            System.out.print("Name: ");
            String nameProduct = entrada.nextLine();

            System.out.print("Price: ");
            double namePrice = entrada.nextDouble();

            //==============================================

            if (cui == 'c'){
                list.add(new Product(nameProduct,namePrice));

            } else if (cui == 'i') {
                System.out.print("Customs fee: ");
                double custoFee = entrada.nextDouble();
                list.add(new ImportedProduct(nameProduct,namePrice,custoFee));

            }else if (cui == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(entrada.next());
                list.add(new UsedProduct(nameProduct,namePrice,date));
            }

        }

        System.out.println();
        for (Product pro : list){
            System.out.println(pro.priceTag());
        }

        entrada.close();
    }
}
