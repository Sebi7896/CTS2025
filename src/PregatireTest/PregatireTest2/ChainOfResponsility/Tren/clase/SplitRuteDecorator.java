package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public class SplitRuteDecorator extends ADecoratorTrainRoute{
    public SplitRuteDecorator(AbstractTrainRoute trainRoute) {
        super(trainRoute);
    }

    @Override
    public void alegeRutaDePornire(int nrKmATotali) {

        super.alegeRutaDePornire(nrKmATotali);//se ocupa facade

        System.out.println("Split ruta " + nrKmATotali/2 + " pornire");
    }
}
