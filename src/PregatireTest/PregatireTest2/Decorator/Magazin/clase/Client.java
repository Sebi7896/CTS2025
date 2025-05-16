package PregatireTest.PregatireTest2.Decorator.Magazin.clase;

public class Client {
    private String name;
    private int distantaAdresaClientAdresa;

    public Client(String name, int distantaAdresaClientAdresa) {
        this.name = name;
        this.distantaAdresaClientAdresa = distantaAdresaClientAdresa;
    }

    public int getDistantaAdresaClientAdresa() {
        return distantaAdresaClientAdresa;
    }

    public void setDistantaAdresaClientAdresa(int distantaAdresaClientAdresa) {
        this.distantaAdresaClientAdresa = distantaAdresaClientAdresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
