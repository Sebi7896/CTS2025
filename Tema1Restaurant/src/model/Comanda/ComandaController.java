package model.Comanda;

import model.Bucatar.Bucatar;
import model.Bucatar.BucatarRepo;
import model.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ComandaController {
    private static int idCurent = 0;
    private List<Comanda> comenzi;
    public ComandaController() {
        comenzi = new ArrayList<>();
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

    public void creareComanda(Scanner scanner) throws InterruptedException {
        Restaurant restaurant = Restaurant.getInstance();
        TipLivrare tipLivrare = getTipComanda(scanner);
        CategorieComanda categorieComanda = getCategorieComanda(scanner);
        Comanda comanda = new Comanda(idCurent++, categorieComanda,tipLivrare,true);
        //showing the choices
        showingChoices(restaurant,comanda);
        System.out.print("Comanda:");
        String coduriString = scanner.next();
        List<Integer> coduri= Arrays.stream(coduriString.split(",")).map(Integer::parseInt).toList();

        coduri.forEach(cod -> {
            if(restaurant.getBauturaRepo().getItem(cod) != null ) {
                comanda.addBautura(restaurant.getBauturaRepo().getItem(cod));
            }

            if( restaurant.getFelDeMancareRepo().getItem(cod) != null ) {
                comanda.addFelDeMancare(restaurant.getFelDeMancareRepo().getItem(cod));
            }
        });
        //Alegerea unui Bucatar
        System.out.println();
        comanda.setBucatarAles(BucatarRepo.getInstance().alegeBucatar(scanner));
        comenzi.add(comanda);
        System.out.println("Comanda in procesare...");
        Thread.sleep(2000);
        System.out.println("Comanda plasata cu succes!");
        scanner.next();

    }
    public TipLivrare getTipComanda(Scanner scanner) {
        System.out.println("1.Restaurant");
        System.out.println("2.Domiciliu");
        System.out.println("3.Ridicare Personala");
        System.out.print("Tipul:");
        int alegere = scanner.nextInt();

        System.out.println();
        return switch (alegere) {
            case 1 -> TipLivrare.RESTAURANT;
            case 2 -> TipLivrare.DOMICILIU;
            case 3 -> TipLivrare.RIDICARE_PERSONALA;
            default -> null;
        };
    }
    public CategorieComanda getCategorieComanda(Scanner scanner) {
        System.out.println("1.Mancare");
        System.out.println("2.Bautura");
        System.out.println("3.Ambele");
        System.out.print("Alegerea clientului:");
        int alegere = scanner.nextInt();

        return switch (alegere) {
            case 1 -> CategorieComanda.MANCARE;
            case 2 -> CategorieComanda.BAUTURA;
            case 3 -> CategorieComanda.MANCARE_BAUTURA;
            default -> null;
        };
    }
    public void showingChoices(Restaurant restaurant,Comanda comanda) {
        switch (comanda.getComanda()) {
            case CategorieComanda.MANCARE:
                restaurant.getFelDeMancareRepo().afisare();
                break;
            case CategorieComanda.BAUTURA:
                restaurant.getBauturaRepo().afisare();
                break;
            case CategorieComanda.MANCARE_BAUTURA:
                restaurant.getFelDeMancareRepo().afisare();
                restaurant.getBauturaRepo().afisare();
                break;
        }
    }

    public void terminareComanda(Scanner scanner) {
        Restaurant restaurant = Restaurant.getInstance();
        System.out.println("Comenzi active");
        comenzi.stream().filter(Comanda::isStatus).forEach(System.out::println);
        System.out.print("Alege o comanda(id):");
        int cod = scanner.nextInt();
        if(restaurant.getComandaController().getComenzi().get(cod) != null) {
            Comanda comanda = comenzi.get(cod);
            comanda.setStatus(false);
            comanda.getBucatarAles().setStatus(true);

            scanner.nextLine();
        }else
            System.out.println("Nu exista aceasta comanda!");

    }
}
