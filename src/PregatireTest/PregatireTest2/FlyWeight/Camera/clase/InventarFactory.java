package PregatireTest.PregatireTest2.FlyWeight.Camera.clase;

import java.util.HashMap;
import java.util.Map;

public class InventarFactory {
    private static Map<ETipInventar , Inventar> inventar = new HashMap<>();//pentru fiecare camera


    public static Inventar getInventar(ETipInventar tipInventar) {
       return  inventar.computeIfAbsent(tipInventar, _ -> tipInventar.getInventar()); // se poate face cu un enum TipCamera -> avem urm Inventar , am ales pentru fiecare camera sa ti

    }
}
