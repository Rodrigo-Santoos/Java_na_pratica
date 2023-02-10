package application;

import model.entities.Account;
import model.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //=====================================================
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Holder: ");
        String holder = entrada.nextLine();

        System.out.print("Initial balance: ");
        double iniBalance = entrada.nextDouble();

        System.out.print("Withdraw limit: ");
        double withLimit = entrada.nextDouble();

        Account acc = new Account(number,holder,iniBalance,withLimit);

        //=====================================================

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amoWith = entrada.nextDouble();

        try {
            acc.withdraw(amoWith);
            System.out.printf("New balance: %.2f", acc.getBalance());
        }
        catch (AccountException accountException){
            System.out.println(accountException.getMessage());
        }

        entrada.close();
    }
}
