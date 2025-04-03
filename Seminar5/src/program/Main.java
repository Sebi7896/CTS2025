package program;

import model.*;

public class Main {
    public static void main(String[] args) {
        //nu am 4 cuptoare max dim de cuptoare m adaugam in static Singleton Registry
        //Factory -> Preparat
        IFactory iFactory = PreparatFactory.getInstance();
        IProdus p1 =iFactory.crearePreparat(TipProdus.BURGER,"burger mare");
        IProdus p2 = iFactory.crearePreparat(TipProdus.PIZZA,"pizza nush");
        System.out.println(p1.getDenumireProdus());
    }
}