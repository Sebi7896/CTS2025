package PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.program;

import PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase.AHandlerFiltrare;
import PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase.FiltrarePantofCuloare;
import PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase.FiltrarePantofNumar;
import PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase.Pantof;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Filtrare Pantofi
        //Chain deorece nu conteaza ordinea filtrarilor

        Pantof pantof = new Pantof("2",40,"verde");
        Pantof pantof2 = new Pantof("3",41,"verde");
        Pantof pantof3 = new Pantof("4",42,"galben");
        List<Pantof> pantofi = List.of(pantof,pantof2,pantof3);



        AHandlerFiltrare handlerFiltrare = new FiltrarePantofNumar(41);
        handlerFiltrare.setNextHandler(new FiltrarePantofCuloare("verde"));
        System.out.println(handlerFiltrare.filtrare(pantofi));
        //invers

        AHandlerFiltrare handlerFiltrare2 = new FiltrarePantofNumar(41);
        handlerFiltrare2.setNextHandler(new FiltrarePantofCuloare("galben"));

        System.out.println(handlerFiltrare2.filtrare(pantofi));

    }
}
