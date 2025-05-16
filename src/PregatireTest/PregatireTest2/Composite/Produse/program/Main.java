package PregatireTest.PregatireTest2.Composite.Produse.program;

import PregatireTest.PregatireTest2.Composite.Produse.clase.Categorie;
import PregatireTest.PregatireTest2.Composite.Produse.clase.IProdus;
import PregatireTest.PregatireTest2.Composite.Produse.clase.Produs;

public class Main {
    public static void main(String[] args) {
        IProdus produse = new Categorie("produse");
        IProdus categorieAnimale = new Categorie("Categorie Animale");
        produse.add(categorieAnimale);
        IProdus cusca = new Produs("cusca",20);
        categorieAnimale.add(cusca);

        IProdus categorieSpalat = new Categorie("Categorie Spalat");
        produse.add(categorieSpalat);
        categorieSpalat.add(new Produs("masina de spalat",3));


        System.out.println(produse.getInfo());
    }
}
