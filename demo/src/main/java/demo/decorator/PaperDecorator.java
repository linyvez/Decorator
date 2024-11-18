package demo.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class PaperDecorator extends ItemDecorator {

    private Item item;

    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "Its a PaperDecorator.";
    }
}
