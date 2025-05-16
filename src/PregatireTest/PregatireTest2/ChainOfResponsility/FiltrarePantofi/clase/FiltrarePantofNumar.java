package PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase;

import java.util.List;
import java.util.Objects;

public class FiltrarePantofNumar extends AHandlerFiltrare {
    private int nrPantof;
    public FiltrarePantofNumar(int nrPantof) {
        this.nrPantof = nrPantof;
    }

    @Override
    public void setNextHandler(AHandlerFiltrare nextHandler) {
        super.setNextHandler(nextHandler);
    }

    public void setNrPantof(int nrPantof) {
        this.nrPantof = nrPantof;
    }

    @Override
    public List<Pantof> filtrare(List<Pantof> pantofi) {
        //vom filtra dupa nr pantof
        List<Pantof> results = pantofi.stream().filter(pantof -> pantof.getNumar() == nrPantof).toList();
        System.out.println("S-a realizat filtrarea de culoare!");
        if(getNextHandler() != null) {
            this.getNextHandler().filtrare(results);
        }

        return results;
    }
}
