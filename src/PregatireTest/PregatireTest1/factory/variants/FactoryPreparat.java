package PregatireTest.PregatireTest1.factory.variants;

import PregatireTest.PregatireTest1.prototype.variants.Produs;

enum TipProdus {
    PIZZA,
    BURGER
}

public class FactoryPreparat {


    public Preparat creareProdus(TipProdus tipProdus) {
        switch (tipProdus) {
            case PIZZA -> {
                return new Pizza(2,"assd","23","multe");
            }
        }
        return null;

    }
}

class Main {
    public static void main(String[] args) {
        FactoryPreparat factoryPreparat = new FactoryPreparat();
        factoryPreparat.creareProdus(TipProdus.PIZZA).afisare();
    }
}
