package PregatireTest2.Composite.Restaurant.program;

import PregatireTest2.Composite.Restaurant.clase.Meniu;
import PregatireTest2.Composite.Restaurant.clase.Produs;
import PregatireTest2.Composite.Restaurant.clase.Structura;

public class Main {
    public static void main(String[] args) {
        //Meniul unui Restaurant
        //Produs este Leaf pentru noi

        Structura structuraMeniu = new Structura("Meniu restaurant");


        Meniu meniu = new Meniu(structuraMeniu,"Osteria Francescana");

        //Bauturi
        Structura structuraBauturi = new Structura("Bauturi");
        structuraMeniu.adaugaNod(structuraBauturi);

        Structura structuraSucuri = new Structura("Sucuri");
        structuraBauturi.adaugaNod(structuraSucuri);
        structuraSucuri.adaugaNod(new Produs("fanta", 10));
        structuraSucuri.adaugaNod(new Produs("cocacola", 12));


        //Mancare
        Structura structuraAlimente = new Structura("Mancare");
        structuraMeniu.adaugaNod(structuraAlimente); //imediat dupa ce am creat o
        //Pizza
        Structura structuraPizza = new Structura("Pizza");
        structuraAlimente.adaugaNod(structuraPizza);
        structuraPizza.adaugaNod(new Produs("capriciosa", 40));
        //Paste
        Structura structuraPaste = new Structura("Paste");
        structuraAlimente.adaugaNod(structuraPaste);
        structuraPaste.adaugaNod(new Produs("carbonara", 60));


        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());







    }
}
