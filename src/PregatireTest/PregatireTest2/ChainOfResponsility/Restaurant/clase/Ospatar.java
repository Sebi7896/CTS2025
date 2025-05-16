package PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase;

public class Ospatar extends AHandler {

    @Override
    public void procesareComanda(Comanda comanda) {
        System.out.println("Procesata de catre ospatar");
        if(comanda.getProdus() != null) {
            //avem produse mancare trimitem la bucatar
            if(this.getNextHandler() != null) {
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
