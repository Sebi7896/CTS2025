package PregatireTest.PregatireTest1.builder.variante;

public class Salariu {

    private int id;
    private String angajator;
    private float valariu;

    Salariu(int id) {
        this.id = id;
    }

    Salariu(int id, String angajator, float valariu) {
        this.id = id;
        this.angajator = angajator;
        this.valariu = valariu;
    }

    public int getId() {
        return id;
    }

    public String getAngajator() {
        return angajator;
    }

    public float getValariu() {
        return valariu;
    }
    @Override
    public String toString() {
        return "Salariu{" +
                "id=" + id +
                ", angajator='" + angajator + '\'' +
                ", valariu=" + valariu +
                '}';
    }

    void setId(int id) {
        this.id = id;
    }

    void setAngajator(String angajator) {
        this.angajator = angajator;
    }

    void setValariu(float valariu) {
        this.valariu = valariu;
    }
}
