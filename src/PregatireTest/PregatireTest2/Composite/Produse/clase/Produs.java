package PregatireTest.PregatireTest2.Composite.Produse.clase;

public class Produs implements IProdus{
    private String nume;
    private int intNrStock;

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
}
