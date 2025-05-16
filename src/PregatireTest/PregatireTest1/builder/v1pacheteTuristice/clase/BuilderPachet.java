package PregatireTest.PregatireTest1.builder.v1pacheteTuristice.clase;



import java.util.ArrayList;
import java.util.List;

public class BuilderPachet implements IBuilderPachet {
    private Transport transport;
    private Cazare cazare;
    private List<String> activitatiExtral;
    public BuilderPachet() {}

    public BuilderPachet setTransport(Transport transport) {
        this.transport = transport;
        return this;
    }
    public BuilderPachet setHotel(String hotel) {
        if(cazare == null) {
            cazare = new Cazare();
        }
        this.cazare.setHotel(hotel);
        return this;
    }
    public BuilderPachet setDutata(int durata) {
        if(cazare == null) {
            cazare = new Cazare();
        }
        this.cazare.setDurata(durata);
        return this;
    }
    public BuilderPachet setStele(int stele) {
        if(cazare == null) {
            cazare = new Cazare();
        }
        this.cazare.setStele(stele);
        return this;
    }
    public BuilderPachet setTipCamera(TipCamera tipCamera) {
        if(cazare == null) {
            cazare = new Cazare();
        }
        this.cazare.setTipCamera(tipCamera);
        return this;
    }
    public BuilderPachet addActivitate(String activitate) {
        if(this.activitatiExtral == null) {
            this.activitatiExtral = new ArrayList<>();
        }
        this.activitatiExtral.add(activitate);
        return this;
    }

    @Override
    public PachetDeVacanta build() throws Exception {
        if(transport == null && cazare == null && activitatiExtral == null) {
            throw new Exception("nu se poate sa nu avem nimic :))");
        }
        PachetDeVacanta pachetDeVacanta = new PachetDeVacanta(transport,cazare,activitatiExtral);
        resetareCampuri();
        return pachetDeVacanta;
    }
    private void resetareCampuri() {
        transport = null;
        cazare = null;
        activitatiExtral = null;
    }

}


