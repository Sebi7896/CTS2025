package PregatireTest2.Decorator.Pizza.clase;

public class DecoratorCrown extends ADecoratorPizza{
    public DecoratorCrown(APizza pizza) {
        super(pizza);
    }

    @Override
    public int getPret() {
        return super.getPret() + 10;
    }

    @Override
    public String getTopings() {
        return super.getTopings() + ",margine branza vegana!";
    }
}
