package Coffee.ingredients;

import Coffee.CoffeeIngredient;
import Coffee.Coffee;

public class SoyaMilk extends CoffeeIngredient {
    public SoyaMilk(Coffee coffee) {

        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.8;
    }
}