package PregatireTest2.Proxy.Hotel.clase;

public class Rezervare {
    private String nume;
    private int numarZile;
    public Rezervare(String nume,int numarZile) {
        this.nume = nume;
        this.numarZile = numarZile;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarZile() {
        return numarZile;
    }

    public void setNumarZile(int numarZile) {
        this.numarZile = numarZile;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", numarZile=" + numarZile +
                '}';
    }
}
