package PregatireTest.PregatireTest2.Decorator.HotelSarbatori.clase;

public abstract class ADecoratorFactura extends IFactura{
    protected IFactura factura; //wrapper peste aceasta factura

    public ADecoratorFactura(IFactura factura) {
        this.factura = factura;
    }
    @Override
    public String getNumeClient() {
        return factura.getNumeClient();
    }

    @Override
    public float getCostTotal() {
        return factura.getCostTotal();
    }
}
