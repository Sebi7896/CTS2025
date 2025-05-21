package PregatireTest.PregatireTest2.Decorator.ClipVideo.clase;

public class ReclamaDecorator extends ADecoratorClipVideo{

    private String durataReclama;
    private int minutIntroducere;

    public ReclamaDecorator(IClipVideo clipVideo, String durataReclama, int minutIntroducere) {
        super(clipVideo);
        this.durataReclama = durataReclama;
        this.minutIntroducere = minutIntroducere;
    }

    @Override
    public void difuzareClipVideo() {
        System.out.println("Reclama va fi prezentata la minutul " + (minutIntroducere));
        super.difuzareClipVideo();
    }
}
