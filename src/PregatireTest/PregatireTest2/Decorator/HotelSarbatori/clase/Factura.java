package PregatireTest.PregatireTest2.Decorator.HotelSarbatori.clase;

public class Factura extends IFactura{
    private float costTotal;
    private String idFactura;
    private String client;

    public Factura(String idFactura,float costTotal,String client) {
        this.costTotal = costTotal;
        this.idFactura = idFactura;
        this.client = client;
    }

    @Override
    public String printare() {
       return client + " cu id-ul facturii" + idFactura + " are de platit " + costTotal + " lei\n";
    }

    @Override
    public String getNumeClient() {
        return this.client;
    }

    @Override
    public float getCostTotal() {
        return costTotal;
    }
}
