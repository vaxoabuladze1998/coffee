package Coffee.ingredients;
import Coffee.Coffee;
import Coffee.CoffeeIngredient;

public class DoubleSugar extends CoffeeIngredient {


    public DoubleSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.4;
    }
}