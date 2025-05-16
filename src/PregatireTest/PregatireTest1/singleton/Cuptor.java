package PregatireTest.PregatireTest1.singleton;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Cuptor {
    private static ConcurrentHashMap<Integer,Cuptor> map;

    //atr
    int id;
    private Cuptor(int id){
        this.id = id;
    }

    static {
        map = new ConcurrentHashMap<>();
    }

    public static Cuptor getInstance(int tip) {
        if(map.get(tip) == null) {
            throw new IllegalArgumentException("nu e ok");
        }
        return map.get(tip);
    }

    public static synchronized void adaugaCuptor(int id) throws Exception {
        int nrMaximCuptoare = 4;
        if(map.size() < nrMaximCuptoare) {
            map.put(id, new Cuptor(id));
            return;
        }
        throw new RuntimeException("sdadsa");
    }

    public static Cuptor getMaxCuptorId() {
       return map.values().stream().max(Comparator.comparingInt(o -> o.id)).get();
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "id=" + id +
                '}';
    }
}
