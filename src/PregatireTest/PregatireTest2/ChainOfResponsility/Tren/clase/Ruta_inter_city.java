package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public class Ruta_inter_city extends AbstractTrainRoute{
    @Override
    public void alegeRutaDePornire(int nrKmATotali) {
        if(nrKmATotali > 500) {
            System.out.println("Ati ales un tren de tip inter-city!\n");
            System.out.println("Veti fi preluat de un mecanic de locomotiva in prima 100 km apoi, de altul pentru pana la km 500 , apoi un al treilea in rest\n");
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
