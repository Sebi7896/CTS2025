package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

import PregatireTest.PregatireTest2.Decorator.HotelSarbatori.clase.ADecoratorFactura;

public class RutaRegio extends AbstractTrainRoute {



    @Override
    public void alegeRutaDePornire(int nrKmATotali) {
        if(nrKmATotali < 100) {
            System.out.println("Ati ales un tren de tip regio!\n");
            System.out.println("Veti fi preluat de un mecanic de locomotiva!");
            super.setNextRoute(null);
        }else {
            if(super.getNextRoute() != null) {
                getNextRoute().alegeRutaDePornire(nrKmATotali);
            } else {
                System.out.println("Din pacate nu mai sunt alte trenuri!\n");
            }
        }
    }
}
