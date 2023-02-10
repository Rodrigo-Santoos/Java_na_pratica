package entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    //===================================================================
    //construct

    public Individual(){
        super();
    }

    public Individual(String name, Double anualincome, Double healthExpenditures) {
        super(name, anualincome);
        this.healthExpenditures = healthExpenditures;
    }
    //===================================================================
    //getters e setters

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //===================================================================
    //metodos

    @Override
    public Double tax() {

        if (getAnualincome() < 20000.00){
            return getAnualincome() * 0.15 - healthExpenditures * 0.5;

        } else{
            return getAnualincome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
