package PregatireTest2.FlyWeight.Camera.clase;

public enum ETipInventar {
    DUPLEX(new Inventar(2,1,2)),
    _3Camere(new Inventar(5,4,2));
    private Inventar inventar;
    ETipInventar(Inventar inventar) {
        this.inventar = inventar;
    }

    public Inventar getInventar() {
        return inventar;
    }
}
