package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public class ADecoratorTrainRoute extends AbstractTrainRoute{
    private AbstractTrainRoute trainRoute;
    public ADecoratorTrainRoute(AbstractTrainRoute trainRoute) {
        this.trainRoute = trainRoute;
    }

    @Override
    public void alegeRutaDePornire(int nrKmATotali) {
        trainRoute.alegeRutaDePornire(nrKmATotali);
    }
}
