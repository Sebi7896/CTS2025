package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public class FacadeGara extends AbstractTrainRoute{
    Ruta_inter_city rutaInterCity = new Ruta_inter_city();
    RutaRegio rutaRegio = new RutaRegio();
    RutaInter_Regio rutaInterRegio  = new RutaInter_Regio();


    @Override
    public final void alegeRutaDePornire(int nrKmATotali) {
        rutaRegio.alegeRutaDePornire(nrKmATotali); //template sablon
        rutaRegio.setNextRoute(rutaInterRegio);
        rutaInterRegio.setNextRoute(rutaInterCity);
        rutaInterCity.setNextRoute(null);
    }
}
