package model.Preparat.Bautura;

import model.Preparat.Preparat;

public class Bautura extends Preparat {
    private boolean alcoolica;
    private float volum;
    public Bautura(int id, String nume, float cost, boolean alcoolica, float volum) {
        super(id, nume, cost);
        this.alcoolica = alcoolica;
        this.volum = volum;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    public float getVolum() {
        return volum;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    @Override
    public String toString() {
        return "id=" + this.getId() +
                ", nume='" + this.getNume() + '\'' +
                ", tip='" + (alcoolica ? "alcoolica" : "non-alcoolica") + '\'' +
                ", cost=" + this.getCost() + " lei";
    }


}
