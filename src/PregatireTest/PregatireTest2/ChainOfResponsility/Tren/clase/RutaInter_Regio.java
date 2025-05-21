package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public class RutaInter_Regio extends AbstractTrainRoute{


    @Override
    public void alegeRutaDePornire(int nrKmATotali) {
        if(nrKmATotali > 100 && nrKmATotali <500) {
            System.out.println("Ati ales un tren de tip inter-regio!\n");
            System.out.println("Veti fi preluat de un mecanic de locomotiva in prima 100 km apoi, de altul pentru restul");
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
