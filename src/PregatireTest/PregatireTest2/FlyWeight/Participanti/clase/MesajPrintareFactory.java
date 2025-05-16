package PregatireTest.PregatireTest2.FlyWeight.Participanti.clase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MesajPrintareFactory {
    private static Map<ETipPrintare, MesajPrintare> listaMesaje = new HashMap<>();
    private static int nrBonuriPrintate;

    public static MesajPrintare getMesajPrintare(ETipPrintare tipPrintare) {
            nrBonuriPrintate++;
            return listaMesaje.computeIfAbsent(tipPrintare, MesajPrintare::new);
    }
    public static int getNrBonuriPrintate() {
        return nrBonuriPrintate;
    }
    public static int getNrMatriteBonuri() {
        return listaMesaje.size();
    }

}
