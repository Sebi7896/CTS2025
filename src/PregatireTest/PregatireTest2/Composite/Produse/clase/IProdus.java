package PregatireTest.PregatireTest2.Composite.Produse.clase;

public interface IProdus {
    //operatii
    String getName();
    int getStock();
    String getInfo();
    //
    void add(IProdus aNod);
    void remove(IProdus aNod);
    IProdus getAnod(int index);
    void setNivelArbore(int nivelArbore);
    int getNivelArbore();

}
