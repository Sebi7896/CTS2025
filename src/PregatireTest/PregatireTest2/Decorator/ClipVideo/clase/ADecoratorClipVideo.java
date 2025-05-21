package PregatireTest.PregatireTest2.Decorator.ClipVideo.clase;

public abstract class ADecoratorClipVideo implements IClipVideo {
    private IClipVideo clipVideo;
    public ADecoratorClipVideo(IClipVideo clipVideo) {
        this.clipVideo = clipVideo;
    }
    public IClipVideo getClipVideo() {
        return clipVideo;
    }

    @Override
    public void difuzareClipVideo() {
        clipVideo.difuzareClipVideo();
    }
}
