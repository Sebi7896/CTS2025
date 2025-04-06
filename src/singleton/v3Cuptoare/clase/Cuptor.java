package singleton.v3Cuptoare.clase;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Cuptor {

    private static Map<String,Cuptor> cuptoare;

    //atribute
    private int timp;
    private int grade;

    private Cuptor(int timp, int grade) {
        this.timp = timp;
        this.grade = grade;
    }

    static {
        cuptoare = new HashMap<>();
        cuptoare.put("cuptor1", new Cuptor(0,100));
        cuptoare.put("cuptor2", new Cuptor(0,120));
        cuptoare.put("cuptor3", new Cuptor(0,80));
        cuptoare.put("cuptor4", new Cuptor(0,150));
    }

    public static Cuptor getInstance(String cheie) {
        return cuptoare.getOrDefault(cheie,null);
    }

    public static Cuptor repartizareCuptorMinimizat() {
        Cuptor cuptor = cuptoare.values().stream().min(Comparator.comparingInt(o -> o.timp)).get();
        cuptor.setTimp(cuptor.timp + 1);
        return cuptor;

    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "timp=" + timp +
                ", grade=" + grade +
                '}';
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }
}
