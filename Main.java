import Coffee.CoffeeType.*;
import Coffee.Coffee;
import Coffee.ingredients.*;


public class Main {


    public static void main(String[] args) {
//      1) ესპრესო ორმაგი შაქრით და რძით


        Coffee coffee = new DoubleSugar(new Milk(new Espresso()));
        System.out.println(
                String.format("espreso ormagi shaqrit da rdzit fasi %.2f",coffee.getPrice())
        );


//        2) შავი ყავა სოიოს რძით და ორმაგი შაქრით


        Coffee coffee1 = new DoubleSugar(new SoyaMilk(new BlackCoffee()));
        System.out.println(
                String.format("shavi yava soios rdzit da ormagi shaqrit fasi %.2f",coffee1.getPrice())
        );
    }
}