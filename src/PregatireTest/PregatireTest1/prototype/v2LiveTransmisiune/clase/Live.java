package PregatireTest.PregatireTest1.prototype.v2LiveTransmisiune.clase;
import java.util.List;
public interface Live {
    String getTitle();
    void setTitle(String title);
    byte[] getStream();
    List<String> getComments();
    void addComment(String comment);
}

