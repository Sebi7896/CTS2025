package PregatireTest.PregatireTest2.Decorator.ClipVideo.program;

import PregatireTest.PregatireTest2.Decorator.ClipVideo.clase.ADecoratorClipVideo;
import PregatireTest.PregatireTest2.Decorator.ClipVideo.clase.ClipVideoLive;
import PregatireTest.PregatireTest2.Decorator.ClipVideo.clase.IClipVideo;
import PregatireTest.PregatireTest2.Decorator.ClipVideo.clase.ReclamaDecorator;

public class Main {
    public static void main(String[] args) {
        IClipVideo clipVideoLive= new ClipVideoLive("mare", 60);
        clipVideoLive.difuzareClipVideo();


        //venim cu reclama
        ADecoratorClipVideo adDecorator = new ReclamaDecorator(new ReclamaDecorator(clipVideoLive,"10s",4),"10s",5);
        adDecorator.difuzareClipVideo();

    }
}
