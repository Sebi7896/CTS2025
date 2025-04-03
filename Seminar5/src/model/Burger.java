package model;
enum TipCarne {
    PORC,
    VITA
}
public class Burger extends Preparat implements IProdus {
    private int id;
    private String denumire;
    private TipCarne tipCarne;
    public Burger(int id,int nrGradeDeGatire, String denumire) {
        super(id,nrGradeDeGatire, denumire);

    }

    public void setTipCarne(TipCarne tipCarne) {
        this.tipCarne = tipCarne;
    }
    public TipCarne getTipCarne() {
        return tipCarne;
    }

    @Override
    public String getDenumireProdus() {
        return this.getDenumire();
    }
}
