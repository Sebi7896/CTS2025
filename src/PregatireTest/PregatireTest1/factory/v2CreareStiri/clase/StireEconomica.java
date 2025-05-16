package PregatireTest.PregatireTest1.factory.v2CreareStiri.clase;

public class StireEconomica implements NewsArticle {

    private String title;
    private String text;
    private String link;
    private String numarAudienta;
    StireEconomica(String text, String title) {
        this.text = text;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getLink() {
        return link;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNumarAudienta() {
        return numarAudienta;
    }

    public void setNumarAudienta(String numarAudienta) {
        this.numarAudienta = numarAudienta;
    }

    @Override
    public String toString() {
        return "StireEconomica{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", link='" + link + '\'' +
                ", numarAudienta='" + numarAudienta + '\'' +
                '}';
    }
}
