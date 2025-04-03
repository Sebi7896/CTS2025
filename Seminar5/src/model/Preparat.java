package model;

public abstract class Preparat {
    private int id;
    private String denumire;
    private int nrGradeDeGatire;

    public Preparat(int id, int nrGradeDeGatire, String denumirem) {
        this.id = id;
        this.nrGradeDeGatire = nrGradeDeGatire;
        this.denumire = denumirem;
    }

    public String getDenumire() {
        return denumire;
    }
}
