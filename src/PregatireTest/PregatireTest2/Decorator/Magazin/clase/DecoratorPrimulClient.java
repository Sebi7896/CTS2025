package PregatireTest.PregatireTest2.Decorator.Magazin.clase;

import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Comanda;

import java.util.List;

public class DecoratorPrimulClient extends ADecoratorMagazin{

    public DecoratorPrimulClient(IMagazin iMagazin) {
        super(iMagazin);
    }

    @Override
    public float calculeazaCostTotalComanda(List<Comanda> comenzi, Client cLient) {
        //vedem daca putem aplica reducere de 10%
        float costTotal = super.calculeazaCostTotalComanda(comenzi,cLient);
        if(!clienti.contains(cLient)) {
            System.out.println("S-a aplicat reducerea de 10%!");
            clienti.add(cLient);
            costTotal = (float) (0.9 * costTotal);
        }

        return costTotal;


    }
}
