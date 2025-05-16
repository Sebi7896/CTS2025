package PregatireTest.PregatireTest2.Composite.Produse.clase;

public interface IProdus {
    //operatii
    String getName();
    int getStock();

    //
    void add(IProdus aNod);
    void remove(IProdus aNod);
    IProdus getAnod(int index);


}
