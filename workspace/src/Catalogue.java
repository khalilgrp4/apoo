import java.util.ArrayList;
public class Catalogue {
    private ArrayList<Livre> livres;
    public Catalogue(){
        livres = new ArrayList<Livre>();
    }

    public boolean contient(Livre livre){
        return livres.contains(livre);
    }
    public boolean ajouter(Livre livre){
        if (livres.contains(livre)){
            return false;
        }
        return livres.add(livre);
    }
    public boolean retirer(Livre livre){
        return livres.remove(livre);
    }
    public int nombreDeLivres(){
        return livres.size();
    }

    public boolean isEmpty(){
        return livres.isEmpty();
    }

    public Livre chercherLivre(String isbn){
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn)){
                return livre;
            }

        }
        return null;


    }

    @Override
    public String toString() {
        return "Liste des livres : " + "\n"+ livres;
    }
}
