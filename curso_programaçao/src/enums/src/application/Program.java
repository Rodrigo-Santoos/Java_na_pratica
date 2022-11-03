package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args){

        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        /*imprimindo assim o enum virá como string*/
        System.out.println(order);

/*---------------------------------------------------------*/
        /*conversao de string para enum*/
        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1.getClass());
        System.out.println(os2);


    }
}
