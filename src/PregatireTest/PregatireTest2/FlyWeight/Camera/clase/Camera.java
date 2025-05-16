package PregatireTest.PregatireTest2.FlyWeight.Camera.clase;

public class Camera {
    private int nrCamerei;
    private String numeClient;

    public Camera(int nrCamerei, String numeClient) {
        this.nrCamerei = nrCamerei;
        this.numeClient = numeClient;
    }



    public int getNrCamerei() {
        return nrCamerei;
    }

    public String getNumeClient() {
        return numeClient;
    }
}
