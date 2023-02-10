package entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    //======================================================================
    //construct
    public Company(){
        super();
    }

    public Company(String name, Double anualincome, Integer numberOfEmployees) {
        super(name, anualincome);
        this.numberOfEmployees = numberOfEmployees;
    }

    //======================================================================
    //getters e setters

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    //======================================================================
    //metodos
    @Override
    public Double tax() {

        if (numberOfEmployees > 10){
            return getAnualincome() * 0.14;

        }else {
            return getAnualincome() * 0.16;
        }
    }
}
