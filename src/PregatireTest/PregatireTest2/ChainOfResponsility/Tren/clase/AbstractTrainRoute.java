package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public abstract class AbstractTrainRoute {
    private AbstractTrainRoute nextRoute;

    public void setNextRoute(AbstractTrainRoute nextRoute) {
        this.nextRoute = nextRoute;
    }
    public AbstractTrainRoute getNextRoute() {
        return nextRoute;
    }

    public abstract void alegeRutaDePornire(int nrKmATotali);
}
