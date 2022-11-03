package main;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String nameClinte ;
        String emailClinte;
        Date bithDate;

        /*Lendo o nome do cliente*/
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        nameClinte = entrada.nextLine();

        /*Lendo o email do cliente*/
        System.out.print("Email: ");
        emailClinte = entrada.nextLine();

        /*Lendo o aniversario do cliente*/
        System.out.print("Birth date: ");
        bithDate = sdf.parse(entrada.nextLine());

        /*Salvando na classe Cliente*/
        Client client = new Client(nameClinte,emailClinte,bithDate);
/*---------------------------------------------------------------------------------------------------------------------*/

        System.out.println();

        /*Salvando o status do produto*/
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(entrada.next());

        /*Salvando na classe Order junto com dados da classe client ja digitado em cima*/
        Order order = new Order(new Date(),status,client);

        System.out.print("How many items to this order? ");
        int orderItems = entrada.nextInt();

        for (int i = 1; i>= orderItems; i++){
            System.out.println("Enter #" + i + " item data:" );

            System.out.print("Product name: ");
            String productName = entrada.nextLine();

            System.out.print("Product price: ");
            double productPrice = entrada.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = entrada.nextInt();

            /*Salvando na classe Product */
            Product product = new Product(productName,productPrice);

            /*Salvando na OrderItem junto com dados da Product*/
            OrderItem orderItem = new OrderItem(productQuantity,productPrice,product);

            /*adicionando*/
            order.addItems(orderItem);

        }

        System.out.println();
        System.out.println(order);

        entrada.close();
    }
}
