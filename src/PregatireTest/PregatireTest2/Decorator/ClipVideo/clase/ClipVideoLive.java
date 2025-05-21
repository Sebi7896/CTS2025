package PregatireTest.PregatireTest2.Decorator.ClipVideo.clase;

public class ClipVideoLive  implements IClipVideo{

    private String calitate;
    private int nrCadrePeSecunda;
    public ClipVideoLive(String calitate, int nrCadrePeSecunda) {
        this.calitate = calitate;
        this.nrCadrePeSecunda = nrCadrePeSecunda;

    }
    public String getCalitate() {
        return calitate;

    }
    public int getNrCadrePeSecunda() {
        return nrCadrePeSecunda;
    }

    @Override
    public void difuzareClipVideo() {
        System.out.println("Se difuzeaza un clip video live in direct!");
    }
}
