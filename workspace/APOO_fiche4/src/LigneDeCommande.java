public class LigneDeCommande {


    private Article article;
    private int quantiteArticle;

    public LigneDeCommande(Article article){
        this.article = article;
        this.quantiteArticle = 1;
    }

    public LigneDeCommande(Article article, int quantiteArticle){
        this.article = article;
        this.quantiteArticle = quantiteArticle;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantiteArticle() {
        return quantiteArticle;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
    
}
