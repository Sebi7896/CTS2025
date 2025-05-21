package PregatireTest.PregatireTest2.FlyWeight.GestionareScaune;

public class Scaun implements  IScaun{
    //stare intrinseca
    private String culoare;
    private TipScaun tipScaun;
    private String material;

    public Scaun(String culoare, TipScaun tipScaun, String material) {
        this.culoare = culoare;
        this.tipScaun = tipScaun;
        this.material = material;
    }

    @Override
    public String getCuloare() {
        return this.culoare;
    }

    @Override
    public TipScaun getTipScaun() {
        return this.tipScaun;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public void printareScaun(Scaun scaun) {
        System.out.println(scaun);
    }

    @Override
    public String toString() {
        return "Scaun{" +
                "culoare='" + culoare + '\'' +
                ", tipScaun=" + tipScaun +
                ", material='" + material + '\'' +
                '}';
    }
}
