package prototype.jucatori.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeFactory {
    private static Map<TipJucator,Jucator> jucatori = new HashMap<>();

    static {
        //le aducem din bd datele


        Jucator portar = new Jucator(TipJucator.PORTAR,new ArrayList<>(List.of("antrenament maini")),new ArrayList<>(List.of("paracetamol")));
        Jucator atacant = new Jucator(TipJucator.ATACANT, new ArrayList<>(List.of("antrenament suturi la poarta")),new ArrayList<>(List.of("droguri")));
        jucatori.put(TipJucator.PORTAR,portar);
        jucatori.put(TipJucator.ATACANT,atacant);

    }

    public static Jucator creeazaJucator(TipJucator tipJucator,String nume) throws CloneNotSupportedException {
        if(!jucatori.containsKey(tipJucator)) {
            return null;
        }
        jucatori.get(tipJucator).setNume(nume);
        return jucatori.get(tipJucator).clone();
    }

}
