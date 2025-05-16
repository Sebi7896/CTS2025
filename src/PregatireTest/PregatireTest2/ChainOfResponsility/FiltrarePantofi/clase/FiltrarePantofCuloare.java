package PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase;

import java.util.List;
import java.util.Objects;

public class FiltrarePantofCuloare extends AHandlerFiltrare{
    private String culoare;

    public FiltrarePantofCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void setNextHandler(AHandlerFiltrare nextHandler) {
        super.setNextHandler(nextHandler);
    }

    @Override
    public List<Pantof> filtrare(List<Pantof> pantofi) {
        //vom filtra dupa culoare
        List<Pantof> results = pantofi.stream().filter(pantof -> Objects.equals(pantof.getCuloare(), culoare)).toList();
        System.out.println("S-a realizat filtrarea de culoare!");
        if(getNextHandler() != null) {
            getNextHandler().filtrare(results);
        }

        return results;
    }
}
