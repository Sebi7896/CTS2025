package PregatireTest.PregatireTest1.factory.variants;

public class Pizza extends Preparat{
    private String topinguri;

    public Pizza(int id, String nume, String pret,String topinguri) {
        super(id, nume, pret);
        this.topinguri = topinguri;
    }


    @Override
    void afisare() {
        System.out.println("Pizza{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret='" + pret + '\'' +
                ", topinguri='" + topinguri + '\'' +
                '}');
    }
}
