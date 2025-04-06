package prototype.v2LiveTransmisiune.program;

import prototype.v2LiveTransmisiune.clase.Prototype;
import prototype.v2LiveTransmisiune.clase.TransmisiuneLive;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("1");
        TransmisiuneLive original = new TransmisiuneLive();
        original.setTitle("Breaking News");
        original.setComments(new ArrayList<>());
        original.addComment("Primul comentariu");
        original.setStream(new byte[]{1, 2, 3});

        // Clonăm pentru alte platforme
        TransmisiuneLive facebook = original.clone();
        facebook.setTitle("Facebook Live");
        facebook.addComment("Comentariu 2 FB");


        TransmisiuneLive youtube = original.clone();
        youtube.setTitle("YouTube Live");
        youtube.addComment("Comentariu 2 YT ");


        youtube.setStream(new byte[] {2,3,4,5});

        System.out.println("Stream ul original" + Arrays.toString(original.getStream()));
        System.out.println("Stream ul yt" + Arrays.toString(youtube.getStream()));

        System.out.println("Original comentarii:" + original.getComments() );
        System.out.println("yt:" + youtube.getComments());
        System.out.println("Original facebook:" + facebook.getComments() );



    }
}
