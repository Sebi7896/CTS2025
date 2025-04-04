package prototype.v2LiveTransmisiune.clase;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements Live,Cloneable{
    private String title;
    private List<String> comments;
    private byte[] stream;


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public byte[] getStream() {
        return stream;
    }

    @Override
    public List<String> getComments() {
        return comments;
    }

    @Override
    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public void setStream(byte[] stream) {
        this.stream = stream;
    }

    @Override
    public TransmisiuneLive clone() throws CloneNotSupportedException {
        TransmisiuneLive transmisiuneLive = (TransmisiuneLive) super.clone();
        transmisiuneLive.setComments(new ArrayList<>());
        //deep ca fiecare treb sa aiba comentariile lui , streamul lui
        for(int i = 0; i < this.getComments().size(); i++) {
            transmisiuneLive.getComments().add(this.getComments().get(i));
        }
        transmisiuneLive.setStream(new byte[stream.length]);
        for(int i = 0; i < this.getStream().length; i++) {
            transmisiuneLive.getStream()[i] = this.getStream()[i];
        }
        return transmisiuneLive;
    }
}
