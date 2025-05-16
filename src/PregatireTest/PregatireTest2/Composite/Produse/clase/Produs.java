package PregatireTest.PregatireTest2.Composite.Produse.clase;

public class Produs implements IProdus{
    private String nume;
    private int intNrStock;
    private int nivelArbore;


    public Produs(String nume, int intNrStock) {
        this.nume = nume;
        this.intNrStock = intNrStock;
    }

    @Override
    public String getName() {
        return this.nume;
    }

    @Override
    public int getStock() {
        return this.intNrStock;
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--".repeat(Math.max(0, this.nivelArbore)));
        return stringBuilder.append(nume).append(" ").append(intNrStock).append("\n").toString();
    }

    @Override
    public void add(IProdus aNod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(IProdus aNod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IProdus getAnod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setNivelArbore(int nivelArbore) {
        this.nivelArbore = nivelArbore;
    }

    @Override
    public int getNivelArbore() {
        return 0;
    }
}
