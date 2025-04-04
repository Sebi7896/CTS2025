package prototype.variants;

import java.util.ArrayList;
import java.util.List;

public class Produs implements Cloneable{
    private int id;
    private String nume;
    private float pret;
    private List<String> alimente;
    public Produs (int id,String nume,float pret){
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.alimente = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", alimente=" + alimente +
                '}';
    }

    public void addAliment(String aliment) {
        alimente.add(aliment);
    }
    @Override
    protected Produs clone() throws CloneNotSupportedException {
        //facem shallow referitna la alimente e aceeasi ca la produsul in sine
        return (Produs) super.clone();

    }
}


class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Produs produs = new Produs(2,"easd",23);
        produs.addAliment("aliment 1");
        Produs produs1 = produs.clone();
        produs1.setNume("Altu");
        produs1.addAliment("aliment 2");
        System.out.println(produs1);
        System.out.println(produs);
    }
}


