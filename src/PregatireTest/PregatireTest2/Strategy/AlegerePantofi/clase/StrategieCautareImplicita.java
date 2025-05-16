package PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase;

import java.util.HashMap;
import java.util.Map;

public class StrategieCautareImplicita implements ICautare{

    @Override
    public Map<String, Object> alegeStrategieDeCautare() {
        //Implicita
        Map<String,Object> mapaFiltrari = new HashMap<>();
        mapaFiltrari.put("nrPantof", 21);
        mapaFiltrari.put("culoare", "toate");
        return mapaFiltrari;
    }
}
