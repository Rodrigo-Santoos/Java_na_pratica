package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    //============================================================================
    //construct

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //============================================================================
    //getters e setters

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    //============================================================================
    //metodos

    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f" , totalPrice())
                + " (Customs fee: " + String.format("%.2f", customsFee ) + " )";
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }
}
