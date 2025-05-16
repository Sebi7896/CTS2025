package PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase;

public abstract class AHandlerFiltrare implements ICautare{
    private AHandlerFiltrare nextHandler;

    public AHandlerFiltrare getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AHandlerFiltrare nextHandler) {
        this.nextHandler = nextHandler;
    }


}
