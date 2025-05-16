package PregatireTest.PregatireTest1.builder.v1pacheteTuristice.clase;

import java.util.List;

public class PachetDeVacanta {
    private Transport transport;
    private Cazare cazare;
    private List<String> activitatiExtral;


     PachetDeVacanta(Transport transport, Cazare cazare,List<String> activitatiExtral) {
         this.transport = transport;
         this.cazare = cazare;
         this.activitatiExtral = activitatiExtral;
    }

    public Transport getTransport() {
        return transport;
    }

    public Cazare getCazare() {
        return cazare;
    }


    @Override
    public String toString() {
        return "PachetDeVacanta{" +
                "transport=" + transport +
                ", cazare=" + cazare +
                ", activitatiExtral=" + activitatiExtral +
                '}';
    }
}
