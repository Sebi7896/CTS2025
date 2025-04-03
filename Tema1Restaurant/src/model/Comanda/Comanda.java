package model.Comanda;

import model.Bucatar.Bucatar;
import model.Preparat.Bautura.Bautura;
import model.Preparat.FelDeMancare.FelDeMancare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Comanda {

    private final int idComanda;
    private CategorieComanda comanda;
    private List<Bautura> bauturi;
    private List<FelDeMancare> preparate;
    private TipLivrare tipLivrare;
    private Bucatar bucatarAles;
    private boolean status;

    Comanda(int idComanda, CategorieComanda comanda,TipLivrare tipLivrare,boolean status) {
        this.idComanda = idComanda;
        this.comanda = comanda;
        this.tipLivrare = tipLivrare;
        initializeazaListaComanda();
        this.status = status;

    }

    public TipLivrare getTipLivrare() {
        return tipLivrare;
    }

    public void setTipLivrare(TipLivrare tipLivrare) {
        this.tipLivrare = tipLivrare;
    }

    public CategorieComanda getComanda() {
        return comanda;
    }

    public void setComanda(CategorieComanda comanda) {
        this.comanda = comanda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Bucatar getBucatarAles() {
        return bucatarAles;
    }

    public void setBucatarAles(Bucatar bucatarAles) {
        this.bucatarAles = bucatarAles;
    }

    private void initializeazaListaComanda() {
        switch (comanda) {
            case BAUTURA:
                bauturi = new ArrayList<>();
                break;
            case MANCARE:
                preparate = new ArrayList<>();
                break;
            default:
                preparate = new ArrayList<>();
                bauturi = new ArrayList<>();
        }
    }

    public void addBautura(Bautura bautura) {
        if(Arrays.stream(comanda.getCodes()).anyMatch(code -> code == CategorieComanda.BAUTURA.getCodes()[0])) {
            bauturi.add(bautura);
        }else {
            System.out.println("Comanda este doare de bautura! poti anula comanda");
        }
    }
    public void addFelDeMancare(FelDeMancare felDeMancare) {
        if(Arrays.stream(comanda.getCodes()).anyMatch(code -> code ==  CategorieComanda.MANCARE.getCodes()[0])) {
            preparate.add(felDeMancare);
        }else {
            System.out.println("Comanda nu trebuie sa contina mancare! poti anula comanda");
        }
    }
    public double getValoareComanda() {
        double cost = 0d;
        if(bauturi != null) {
            cost += bauturi.stream().flatMapToDouble(bautura -> DoubleStream.of(bautura.getCost())).sum();
        }
        if(preparate != null) {
            cost += preparate.stream().flatMapToDouble(preparat -> DoubleStream.of(preparat.getCost())).sum();
        }
        return cost;
    }


    @Override
    public String toString() {
        return String.format(
                "Comanda #%d - Categorie: %s - Total: %.2f lei",
                idComanda,
                comanda,
                getValoareComanda()
        );
    }


}
