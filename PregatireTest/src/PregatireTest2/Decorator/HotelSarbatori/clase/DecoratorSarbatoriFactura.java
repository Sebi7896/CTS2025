package PregatireTest2.Decorator.HotelSarbatori.clase;

public class DecoratorSarbatoriFactura extends ADecoratorFactura{
    private float procentReducere;
    public DecoratorSarbatoriFactura(IFactura factura,float procentReducere) {
        super(factura);
        this.procentReducere = procentReducere;

    }

    @Override
    public float getCostTotal() {
        return super.getCostTotal()*(1-procentReducere);
    }

    @Override
    public String printare() {
        //nu modificam factura curenta !!
        return factura.printare() +
                "<<<Cu Ocazia Sarbatorilor ati primit " + procentReducere * 100 + "% reducere cost total "+ getCostTotal() +  ">>> \n"+

                "<<<" + getNumeClient() + ",Hotelul va ureaza Sarbatori Fericitee >>>";
    }


}
