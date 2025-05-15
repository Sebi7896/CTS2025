package PregatireTest2.Decorator.Pizza.clase;

public class DecoratorIuteala extends ADecoratorPizza {
    private String nivelIuteala;

    public DecoratorIuteala(APizza pizza, String nivelIuteala) {
        super(pizza);
        this.nivelIuteala = nivelIuteala;
    }

    public DecoratorIuteala(APizza pizza) {
        super(pizza);
    }

    @Override
    public int getPret() {
        return super.getPret(); //pret initial si nivel de iuteala
    }

    @Override
    public String getTopings() {
        return super.getTopings() + "iuteala " + nivelIuteala;
    }
}
