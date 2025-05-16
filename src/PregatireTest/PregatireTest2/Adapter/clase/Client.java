package PregatireTest.PregatireTest2.Adapter.clase;

public class Client {
    private String nume;
    private int[] costuriEvenimente;

    public Client(String nume, int[] costuriEvenimente) {
        this.nume = nume;
        this.costuriEvenimente = costuriEvenimente;
    }
    public String getNume() {
        return nume;
    }
    public int[] getCosturiEvenimente() {
        return costuriEvenimente;
    }

}
