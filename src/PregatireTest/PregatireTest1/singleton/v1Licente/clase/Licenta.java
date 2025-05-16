package PregatireTest.PregatireTest1.singleton.v1Licente.clase;

public class Licenta implements AbstractTourismLicense{
    private int id;
    private String nume;
    private int nota;
    private boolean aFostModificata = false;
    private Licenta() {}


    //PregatireTest.PregatireTest1.singleton cu helper
    private static final class LicenteHelper {
        private static final Licenta INSTANCE = new Licenta();
    }

    public static Licenta getInstance() {
        return LicenteHelper.INSTANCE;
    }
    @Override
    public void setLicenseNumber(int id,String nume,int nota) throws Exception {
        if(aFostModificata)
            throw new Exception("A fost deja modificata o data");
        this.id = id;
        this.nume = nume;
        this.nota = nota;
        this.aFostModificata = true;
    }


}
