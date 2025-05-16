package PregatireTest.PregatireTest2.ChainOfResponsility.FiltrarePantofi.clase;

public class Pantof {

    private String id;
    private int numar;
    private String culoare;

    public Pantof(String id, int numar, String culoare) {
        this.id = id;
        this.numar = numar;
        this.culoare = culoare;
    }

    public String getId() {
        return id;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getNumar() {
        return numar;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "id='" + id + '\'' +
                ", numar=" + numar +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
