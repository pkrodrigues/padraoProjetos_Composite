package designpattern.structural;

public class Product extends Content {
    private double value;

    public Product(String description, double value) {
        super(description);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getContent() {
        return "Descrição produto: " + getContent() + "valor: R$ " + getValue();
    }
}
