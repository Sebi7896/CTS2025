package PregatireTest.PregatireTest1.builder.v1pacheteTuristice.clase;

public class Cazare {
    private int durata;
    private int stele;
    private String hotel;
    private TipCamera tipCamera;

    Cazare() {}

    public int getDurata() {
        return durata;
    }

    public int getStele() {
        return stele;
    }

    public String getHotel() {
        return hotel;
    }

    public TipCamera getTipCamera() {
        return tipCamera;
    }

     void setDurata(int durata) {
        this.durata = durata;
    }

     void setStele(int stele) {
        this.stele = stele;
    }

     void setHotel(String hotel) {
        this.hotel = hotel;
    }

     void setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
    }

    @Override
    public String
    toString() {
        return "Cazare{" +
                "durata=" + durata +
                ", stele=" + stele +
                ", hotel='" + hotel + '\'' +
                ", tipCamera=" + tipCamera +
                '}';
    }
}
