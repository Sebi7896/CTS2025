package PregatireTest.PregatireTest2.Proxy.Petrecere.clase;

public class Client {
    private String nume;
    private float varsta;

    public Client(float varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getVarsta() {
        return varsta;
    }

    public void setVarsta(float varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
