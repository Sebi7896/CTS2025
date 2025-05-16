package PregatireTest.PregatireTest2.Decorator.Magazin.program;

import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Comanda;
import PregatireTest.PregatireTest2.Decorator.Magazin.clase.ADecoratorMagazin;
import PregatireTest.PregatireTest2.Decorator.Magazin.clase.Client;
import PregatireTest.PregatireTest2.Decorator.Magazin.clase.DecoratorPrimulClient;
import PregatireTest.PregatireTest2.Decorator.Magazin.clase.Magazin;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Magazin magazin = new Magazin();
        //clienti
        Client client = new Client("Ionel",10);
        Client client2 = new Client("Cristi",40);

        //prima comanda inainte de decoratpr
        System.out.println(magazin.calculeazaCostTotalComanda(List.of(new Comanda("dfasd",20,20)),client));
        //cu decorator
        ADecoratorMagazin aDecoratorMagazin = new DecoratorPrimulClient(magazin);
        System.out.println(aDecoratorMagazin.calculeazaCostTotalComanda(List.of(new Comanda("dfasd",20,20)),client));
        //mai face o comanda Ionel
        System.out.println(aDecoratorMagazin.calculeazaCostTotalComanda(List.of(new Comanda("dfasd",20,20)),client));
        //comanda pentru Cristi
        System.out.println(aDecoratorMagazin.calculeazaCostTotalComanda(List.of(new Comanda("dfasd",20,20)),client2));
    }
}
