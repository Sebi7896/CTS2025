package PregatireTest.PregatireTest1.factory.v2CreareStiri.clase;

public interface IFactoryStire {
        NewsArticle creareStire(TipStire tipStire,String titlu, String text) throws Exception;
}
