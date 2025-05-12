package PregatireTest1.variante;

import java.util.HashMap;
import java.util.Map;

class ExceptiaMea extends Exception {
    ExceptiaMea(String mesaj) {
        super(mesaj);
    }
}

public class StaticInitialization {
    private static final Map<String,String> mapaMesaje;
    static  {
        mapaMesaje = new HashMap<>();
        mapaMesaje.put("mesaj1","Salut");
        mapaMesaje.put("mesaj2","Buna");
        mapaMesaje.put("mesaj3","Hola");
    }
    private StaticInitialization(){}
    public static String getMesaj(String cheie) throws ExceptiaMea {
        if(!mapaMesaje.containsKey(cheie)) {
            throw new ExceptiaMea("Nu exista acest mesaj!");
        }
        return mapaMesaje.get(cheie);
    }
    public static void main(String[] args) {
        try {
            String mesaj1 = StaticInitialization.getMesaj("mesaj1");
            System.out.println(mesaj1);
        }catch (ExceptiaMea ea) {
            ea.printStackTrace();
        }
    }
}