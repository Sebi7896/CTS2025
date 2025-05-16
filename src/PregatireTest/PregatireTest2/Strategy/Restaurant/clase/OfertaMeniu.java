package PregatireTest.PregatireTest2.Strategy.Restaurant.clase;

public class OfertaMeniu {
    private String numeMeniu;
    private int nrCalorii;
    private int nrCarbohidrati;

    public OfertaMeniu(int nrCalorii, int nrCarbohidrati, String numeMeniu) {
        this.nrCalorii = nrCalorii;
        this.nrCarbohidrati = nrCarbohidrati;
        this.numeMeniu = numeMeniu;
    }

    public String getNumeMeniu() {
        return numeMeniu;
    }

    public int getNrCalorii() {
        return nrCalorii;
    }

    public int getNrCarbohidrati() {
        return nrCarbohidrati;
    }

    @Override
    public String toString() {
        return "OfertaMeniu{" +
                "numeMeniu='" + numeMeniu + '\'' +
                ", nrCalorii=" + nrCalorii +
                ", nrCarbohidrati=" + nrCarbohidrati +
                '}';
    }
}
