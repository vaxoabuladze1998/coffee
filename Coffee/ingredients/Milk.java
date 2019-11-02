package Coffee.ingredients;
import Coffee.Coffee;
import Coffee.CoffeeIngredient;

public class Milk extends CoffeeIngredient {
    public Milk(Coffee coffee) {

        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.9;
    }
}