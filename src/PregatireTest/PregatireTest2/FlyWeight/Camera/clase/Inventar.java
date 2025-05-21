package PregatireTest.PregatireTest2.FlyWeight.Camera.clase;

public class Inventar implements IInventar {
    private ETipInventar tipInventar;
    private int nrProsoape;
    private int nrCearceafuri;
    private int nrUmerase;

    public Inventar( int nrProsoape, int nrCearceafuri, int nrUmerase) {
        this.nrProsoape = nrProsoape;
        this.nrCearceafuri = nrCearceafuri;
        this.nrUmerase = nrUmerase;
    }

    @Override
    public void afisareInventar(Camera camera) {
        System.out.println("<<Clientul " + camera.getNumeClient() + " are pentru camera " + camera.getNrCamerei() + " urmatorul inventar " + this);
    }

    @Override
    public String toString() {
        return "Inventar{" +
                "nrProsoape=" + nrProsoape +
                ", nrCearceafuri=" + nrCearceafuri +
                ", nrUmerase=" + nrUmerase +
                '}';
    }
}
