package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        //================================================================

        System.out.print("Enter the number of tax payers: ");
        int numberPayers = entrada.nextInt();

        entrada.nextLine();
        for (int i = 1 ; i <= numberPayers; i++){
            System.out.println("Tax payer #" +i+ " data:");

            System.out.print("Individual or company (i/c)?:");
            char ic = entrada.next().charAt(0);

            entrada.nextLine();

            System.out.print("Name: ");
            String name = entrada.nextLine();

            System.out.print("Anual income: ");
            double anualincome = entrada.nextDouble();

            if (ic == 'c'){

                System.out.print("Number of employees: ");
                int numberEmplo = entrada.nextInt();

                list.add(new Company(name,anualincome,numberEmplo));

            }else{

                System.out.print("Health expenditures: ");
                double heathExpe = entrada.nextDouble();

                list.add(new Individual(name,anualincome,heathExpe));
            }

        }
        //================================================================

        System.out.println();
        System.out.println("TAXES PAID:");
        for(TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f" , taxPayer.tax()));
        }

        entrada.close();

    }
}
