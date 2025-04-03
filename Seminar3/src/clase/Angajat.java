package clase;

public abstract class Angajat {
    int id;
    String nume;
    float salariulDeBaza;

    public Angajat(int id, String nume, float salariulDeBaza) {
        this.id = id;
        this.nume = nume;
        this.salariulDeBaza = salariulDeBaza;
    }
}
