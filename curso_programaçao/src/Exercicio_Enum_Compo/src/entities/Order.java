package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    /*Associando*/
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

/*-----------------------------------------------------------------------------------------------------------------*/
    /*Construct*/

    public Order(){

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

/*-----------------------------------------------------------------------------------------------------------------*/
    /*Getters e Setters*/

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

   /* public void setItems(List<OrderItem> items) {
        this.items = items;
    }*/
/*-----------------------------------------------------------------------------------------------------------------*/
    /*Metodos*/

    public void addItems(OrderItem addItem){
        items.add(addItem);
    }

    public void removeItems(OrderItem removeItem){
        items.remove(removeItem);
    }

    public double total(){
        double sum = 0;
        /*valor do produto final*/
        for(OrderItem it : items){
            sum += it.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: " + status + " \n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items: \n");

        for(OrderItem item: items){
            sb.append(item + "\n");
        }

        sb.append("Total price: $" + total());

        return sb.toString();
    }
}
