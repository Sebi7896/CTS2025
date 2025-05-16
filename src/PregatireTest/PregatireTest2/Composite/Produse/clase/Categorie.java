package PregatireTest.PregatireTest2.Composite.Produse.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IProdus {
    private String numeCategorie;
    List<IProdus> produse;
    private int nivelArbore;
    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        produse = new ArrayList<>();
    }

    public int getNrProduse() {
        return produse.size();
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("--".repeat(Math.max(0, getNivelArbore())));
        info.append(this).append("\n");
        for (IProdus prod : produse) {
            prod.setNivelArbore(getNivelArbore() + 1);
            info.append(prod.getInfo());
        }
        return info.toString();
    }
    @Override
    public String getName() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public int getStock() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void add(IProdus aNod) {
        this.produse.add(aNod);
    }

    @Override
    public void remove(IProdus aNod) {
        this.produse.remove(aNod);
    }

    @Override
    public IProdus getAnod(int index) {
        return this.produse.get(index);
    }

    @Override
    public void setNivelArbore(int nivelArbore) {
        this.nivelArbore = nivelArbore;
    }

    @Override
    public int getNivelArbore() {
        return this.nivelArbore;
    }

    @Override
    public String toString() {
        return numeCategorie + " are " + getNrProduse();

    }
}
