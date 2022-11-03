import entities.Accont;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {

        Accont acc = new Accont(1000,"Rodrigo",0.0);
        BusinessAccount bacc = new BusinessAccount(1001,"Danilo",0.0,500.0);

        // Upcasting
        Accont acc1 = bacc;
        Accont acc2 = new BusinessAccount(1003,"Kelly", 0.0, 200.00);

        //Downcasting
    }
}