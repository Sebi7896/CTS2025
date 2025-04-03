package model.Bucatar;

public class Bucatar implements Comparable<Bucatar> {
    private int id;
    private String nume;
    private TipBucatar tipBucatar;
    private boolean status;
    private int numarComenzi;

    public Bucatar(int id,String nume, TipBucatar tipBucatar) {
        this.id = id;
        this.nume = nume;
        this.tipBucatar = tipBucatar;
        numarComenzi = 0;
        status = true;
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
    public TipBucatar getTipBucatar() {
        return tipBucatar;
    }
    public int getNumarComenzi() {
        return numarComenzi;
    }
    public void incrementComenzi() {
        this.numarComenzi++;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nume='" + nume + '\'' +
                ", -> tipBucatar=" + tipBucatar +
                ", -> status=" + (status? "Disponibil" : "Indisponibil") +

                ", numarComenzi=" + numarComenzi;
    }


    @Override
    public int compareTo(Bucatar o) {
        return this.numarComenzi - o.numarComenzi;
    }
}
