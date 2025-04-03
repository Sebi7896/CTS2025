package model;

enum TipBlat {
    SUBTIRE,
    MOALE
}

public class Pizza extends Preparat implements IProdus {

    private TipBlat tipBlat;
    public Pizza(int id,int nrGradeDeGatire, String denumire) {
        super(id,nrGradeDeGatire, denumire);
    }

    @Override
    public String getDenumireProdus() {
        return this.getDenumire();
    }

    public void setTipBlat(TipBlat tipBlat) {
        this.tipBlat = tipBlat;
    }
    public TipBlat getTipBlat() {
        return tipBlat;
    }
}
