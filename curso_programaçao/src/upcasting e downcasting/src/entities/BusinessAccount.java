package entities;

public class BusinessAccount extends Accont{

    /*herança é quando herda tudo que a outa classe tenha */

    private Double loanLimit;

    /*--------------------------------------------------------------*/
    /*Construct*/

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    /*--------------------------------------------------------------*/
    /*getters e setters*/

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /*--------------------------------------------------------------*/
    /*Metodos*/
    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10;
        }
    }
}
