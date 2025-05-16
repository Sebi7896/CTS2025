package PregatireTest.PregatireTest2.Decorator.Magazin.clase;

import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Comanda;
import PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase.CLient;

import java.util.List;

public class Magazin implements IMagazin{


    @Override
    public float calculeazaCostTotalComanda(List<Comanda> comenzi, Client cLient) {
        float costTotalProduse = comenzi.stream().mapToInt(Comanda::getCantitate).sum();
        float costTransport =
    }
}
