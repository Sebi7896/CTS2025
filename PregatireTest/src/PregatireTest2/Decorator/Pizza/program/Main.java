package PregatireTest2.Decorator.Pizza.program;

import PregatireTest2.Decorator.Pizza.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza");
        APizza pizzaVegetariana = new PizzaVegetariana();
        System.out.println(pizzaVegetariana.getTopings());
        //vin cu decoratorul de crown
        ADecoratorPizza pizzaDecoratorCrown = new DecoratorCrown(pizzaVegetariana);

        System.out.println(pizzaDecoratorCrown.getTopings());
        //Vin si cu decoratorul de iuteala peste cele crown

        ADecoratorPizza pizzaDecoratorIute = new DecoratorIuteala(pizzaDecoratorCrown,"extrrem de iute");
        System.out.println(pizzaDecoratorIute.getTopings());
        //nu schimb obiectul pizza de la inceput cum as putea face la proxy de ex
        System.out.println(pizzaVegetariana.getTopings());

    }
}
