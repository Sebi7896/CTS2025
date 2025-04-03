package model.Preparat;


public class Preparat {
    private int id;
    private String nume;
    private float cost;
    private TipPreparat tipPreparat;
    public int numar;
    public Preparat(int id, String nume, float cost) {
        this.id = id;
        this.nume = nume;
        this.cost = cost;
        this.tipPreparat = TipPreparat.MANCARE;
        this.numar = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public int getNumar() {
        return numar;
    }
    public void setNumar(int numar) {
        this.numar = numar;
    }
}
