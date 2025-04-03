package model;

public class PreparatFactory implements IFactory {
    
    
    private PreparatFactory() {}
    private static int nrId = 0;
    @Override
    public IProdus crearePreparat(TipProdus produsm, String denumire) {
        switch (produsm) {
            case PIZZA -> {
                return new Pizza(nrId++,0 , denumire);
            }
            case BURGER -> {
                return new Burger(nrId++,0 , denumire);
            }
        }
        return null;
    }

    public static final class FactoryHelper {
        public static final PreparatFactory INSTANCE = new PreparatFactory();
    }

    public static PreparatFactory getInstance() {
        return FactoryHelper.INSTANCE;
    }

}
