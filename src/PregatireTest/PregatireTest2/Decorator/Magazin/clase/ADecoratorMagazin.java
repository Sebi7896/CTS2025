package PregatireTest.PregatireTest2.Decorator.Magazin.clase;

import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Comanda;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class ADecoratorMagazin implements IMagazin{

    private IMagazin iMagazin ; //cuplam decoratorul de magazin
    //daca las static daca aplic decoratorul pe alt magazin ar trebui sa se reseteze setul de clienti, magazinul A nu are clientii magazinului B
    protected static Set<Client> clienti = new HashSet<>();

    public ADecoratorMagazin(IMagazin iMagazin) {
        this.iMagazin = iMagazin;
        clienti = new HashSet<>(); // se presupune ca de acum  fiecare client nou va avea reducere
    }

    public IMagazin getiMagazin() {
        return iMagazin;
    }

    @Override
    public float calculeazaCostTotalComanda(List<Comanda> comenzi, Client cLient) {
        return this.iMagazin.calculeazaCostTotalComanda(comenzi,cLient);
    }
}
