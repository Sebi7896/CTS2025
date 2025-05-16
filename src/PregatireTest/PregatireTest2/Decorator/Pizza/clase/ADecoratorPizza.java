package PregatireTest.PregatireTest2.Decorator.Pizza.clase;

public abstract class ADecoratorPizza extends APizza {
    protected APizza pizza;

    public ADecoratorPizza(APizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public int getPret() {
        return pizza.getPret();
    }

    @Override
    public String getTopings() {
        return pizza.getTopings();
    }
}
