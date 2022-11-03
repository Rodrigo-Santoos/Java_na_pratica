package entities;

public class SavingsAccount extends Accont{
    private Double interesRate;

    /*-----------------------------------------------*/
    /*constructs*/
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    /*-----------------------------------------------*/
    /*getters e setters*/

    public Double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }

    /*-----------------------------------------------*/
    /*metodos*/

    public void updateBalace(){
        balance += balance * interesRate;
    }
}
