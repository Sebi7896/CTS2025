package PregatireTest.PregatireTest1.prototype.jucatori.clase;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements Cloneable{
    private String nume;
    private TipJucator tipJucator;
    private List<String> antrenamente;
    private List<String> medicamente;

    public Jucator(TipJucator tipJucator, List<String> antrenamente, List<String> medicamente) {
        this.tipJucator = tipJucator;
        this.antrenamente = antrenamente;
        this.medicamente = medicamente;
    }

    @Override
    protected Jucator clone() throws CloneNotSupportedException {
        Jucator jucator = (Jucator) super.clone();
        //medicamentele trebuie shallow
        //antrenamtele sa fie deep
        jucator.antrenamente = new ArrayList<>(this.antrenamente);
        return jucator;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                ", tipJucator=" + tipJucator +
                ", antrenamente=" + antrenamente +
                ", medicamente=" + medicamente +
                '}';
    }

    public void addMedicament(String medicament) {
        this.medicamente.add(medicament);
    }
    public void addAntrenament(String medicament) {
        this.antrenamente.add(medicament);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
