package PregatireTest2.Decorator.Pizza.clase;

public class PizzaVegetariana extends APizza{


    @Override
    public String getTopings() {
        return "rosi branza blat ..";
    }

    @Override
    public int getPret() {
        return 20;
    }
}
