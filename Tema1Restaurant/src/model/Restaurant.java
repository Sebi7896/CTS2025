package model;

import model.Bucatar.BucatarRepo;
import model.Comanda.ComandaController;
import model.Preparat.Bautura.BauturaRepo;
import model.Preparat.FelDeMancare.FelDeMancareRepo;

public class Restaurant {
    private String nume;
    private String adress;
    private MasaRepo masaRepo;
    private FelDeMancareRepo felDeMancareRepo;
    private BauturaRepo bauturaRepo;
    private BucatarRepo bucatarRepo;
    private ComandaController comandaController;

    private Restaurant() {
        //must share the same memory
        masaRepo = MasaRepo.getInstance();
        felDeMancareRepo = FelDeMancareRepo.getInstance();
        bauturaRepo = BauturaRepo.getInstance();
        bucatarRepo = BucatarRepo.getInstance();
        comandaController = new ComandaController();
    }

    public void setNumeAdresa(String name, String adress) {
        if(nume == null || adress == null) {
            this.nume = name;
            this.adress = adress;
        }
    }
    private static final class SingletonHelper {
        private static final Restaurant INSTANCE = new Restaurant();
    }
    public static Restaurant getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public ComandaController getComandaController() {
        return comandaController;
    }

    public void setComandaController(ComandaController comandaController) {
        this.comandaController = comandaController;
    }

    public String getNume() {
        return nume;
    }

    public String getAdress() {
        return adress;
    }

    public MasaRepo getMasaRepo() {
        return masaRepo;
    }

    public FelDeMancareRepo getFelDeMancareRepo() {
        return felDeMancareRepo;
    }

    public BauturaRepo getBauturaRepo() {
        return bauturaRepo;
    }

    public BucatarRepo getBucatarRepo() {
        return bucatarRepo;
    }

    public void setBucatarRepo(BucatarRepo bucatarRepo) {
        this.bucatarRepo = bucatarRepo;
    }
}

