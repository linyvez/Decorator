package demo.decorator;

import lombok.Setter;

@Setter
public abstract class Item {
    private double price;
    private String description;

    public abstract double getPrice();

    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
