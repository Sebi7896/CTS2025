package PregatireTest.PregatireTest1.builder.v1pacheteTuristice.program;

import PregatireTest.PregatireTest1.builder.v1pacheteTuristice.clase.BuilderPachet;
import PregatireTest.PregatireTest1.builder.v1pacheteTuristice.clase.PachetDeVacanta;
import PregatireTest.PregatireTest1.builder.v1pacheteTuristice.clase.Transport;

public class Main {
    public static void main(String[] args) throws Exception {
        BuilderPachet builderPachet = new BuilderPachet();
        PachetDeVacanta pachetDeVacanta = builderPachet.setTransport(Transport.AVION).addActivitate("muzeu").setDutata(10).build();
        PachetDeVacanta pachetDeVacanta2 = builderPachet.setTransport(Transport.AVION).addActivitate("excursie").setDutata(20).build();
        System.out.println(pachetDeVacanta);
        System.out.println(pachetDeVacanta2);

    }
}
