package factory.variants;

public abstract class Preparat {
    protected int id;
    protected String nume;
    protected String pret;

    public Preparat(int id, String nume, String pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    abstract void afisare();
}
