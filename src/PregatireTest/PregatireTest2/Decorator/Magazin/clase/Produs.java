package PregatireTest.PregatireTest2.Decorator.Magazin.clase;

public class Produs {
    private String denumire;
    private float pret;

    public Produs(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
