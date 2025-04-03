import model.Bucatar.Bucatar;
import model.Bucatar.TipBucatar;
import model.Comanda.ComandaController;
import model.Preparat.Bautura.Bautura;
import model.Preparat.FelDeMancare.FelDeMancare;
import model.Restaurant;

import java.util.Scanner;

public class Main {
    public static int prompt(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to " + restaurant.getNume() + " !");
        System.out.println("----------------");
        System.out.println("Masa");
        System.out.println("1. Insereaza masa");
        System.out.println("2. Sterge masa");
        System.out.println("3. Afiseaza disponibilitate mese");
        System.out.println("4. Ocupa o masa");
        System.out.println("5. Elibereaza o masa");
        System.out.println("----------------");
        System.out.println("Comanda");
        System.out.println("6.Comanda noua");
        System.out.println("7.Inchide o comanda");
        System.out.println("----------------");

        System.out.print("Enter a command:");
        return scanner.nextInt();
    }
    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = Restaurant.getInstance();

        restaurant.setNumeAdresa("Osteria Francescana","Str Linguinii");
        addDataBase(restaurant);
        while(true) {
            int commnand = prompt(restaurant);
            flow(commnand,restaurant);
        }
    }
    public static void flow(int command,Restaurant restaurant) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        switch (command) {
            case 1:
                System.out.print("Nume masa:");
                restaurant.getMasaRepo().addMasa(scanner.nextLine());
                break;
            case 2:
                restaurant.getMasaRepo().printMese();
                System.out.print("Nume Masa pe care doresti sa o stergi:");
                restaurant.getMasaRepo().stergeMasa(scanner.nextLine());
                break;
            case 3:
                restaurant.getMasaRepo().printMese();
                scanner.nextLine();
                break;
            case 4:
                restaurant.getMasaRepo().printMese();
                System.out.print("Masa pe care doresti sa o ocupi:");
                restaurant.getMasaRepo().setOcupata(scanner.nextLine(),false);
                scanner.nextLine();
                break;
            case 5:
                restaurant.getMasaRepo().printMese();
                System.out.print("Masa pe care doresti sa o eliberezi:");
                restaurant.getMasaRepo().setOcupata(scanner.nextLine(),true);
                scanner.nextLine();
                break;
            case 6:
                restaurant.getComandaController().creareComanda(scanner);
                break;
            case 7:
                restaurant.getComandaController().terminareComanda(scanner);
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

    }

    public static void addDataBase(Restaurant restaurant) {
        //mese
        restaurant.getMasaRepo().addMasa("Masa 1");
        restaurant.getMasaRepo().addMasa("Masa 2");
        restaurant.getMasaRepo().addMasa("Masa 3");
        //Mancare si Bauturi
        restaurant.getFelDeMancareRepo().add(new FelDeMancare(1,"Pizza Diavola",40,false));
        restaurant.getFelDeMancareRepo().add(new FelDeMancare(2,"Pizza Vegetariana",35,true));
        restaurant.getFelDeMancareRepo().add(new FelDeMancare(5,"Paste carbonara",35,true));
        restaurant.getBauturaRepo().add(new Bautura(6,"Fresh de portocale",15,false,500));
        restaurant.getBauturaRepo().add(new Bautura(3,"Coca Cola",15,false,500));
        restaurant.getBauturaRepo().add(new Bautura(4,"Gin",15,true,500));
        //Bucatari
        restaurant.getBucatarRepo().adaugaBucatar(new Bucatar(1,"Marian", TipBucatar.SEF));
        restaurant.getBucatarRepo().adaugaBucatar(new Bucatar(2,"Ionel", TipBucatar.INCEPATOR));
        restaurant.getBucatarRepo().adaugaBucatar(new Bucatar(3,"Cristi", TipBucatar.INCEPATOR));
        restaurant.getBucatarRepo().adaugaBucatar(new Bucatar(4,"Yusuf", TipBucatar.SEF));
    }


}
