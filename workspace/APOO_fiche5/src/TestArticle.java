public class TestArticle {

    public static void main(String[] args) {
        System.out.println("Il y'a "+Article.getNbrArticles()+" article(s).");
        try {
            Article article1 = new Article("", null, "Vest qui tient au chaud", 100);
            System.out.println(article1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Il y'a "+Article.getNbrArticles()+" article(s).");

        try {
            Article article2 = new Article("1012","","gilet pour l'automne",150,15);
            System.out.println(article2);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Il y'a "+Article.getNbrArticles()+" article(s).");

        try {
            Article article3 = new Article("8910",null,"Bonnet qui tient au chaud",200);
            System.out.println(article3);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Il y'a "+Article.getNbrArticles()+" article(s).");
        try {
            Article article4 = new Article(null,"pantalon","pantalon",200);
            System.out.println(article4);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
