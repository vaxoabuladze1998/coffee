package Coffee;
import Coffee.Coffee;

public abstract class CoffeeIngredient implements Coffee {

    Coffee coffee;

        public CoffeeIngredient(Coffee coffee) {

            this.coffee = coffee;
        }

        @Override
        public double getPrice() {

            return coffee.getPrice();
        }
    }

