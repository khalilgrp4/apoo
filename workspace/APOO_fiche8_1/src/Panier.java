import java.util.ArrayList;
import java.util.Iterator;


public class Panier {
    private ArrayList<Produit> produits;
    private final static int NOMBREMAXPRODUITS = 10;

    public Panier(){
        produits = new ArrayList<Produit>();
    }

    public boolean ajouter(Produit p) throws PanierPleinException{
        if (produits.size()>NOMBREMAXPRODUITS)
            throw new PanierPleinException("panier plein");
        if (produits.contains(p)){
            return false;
        }
        return produits.add(p);
    }
    public boolean remove(Produit p){
        return produits.remove(p);
    }

    public int nbrProduits(){
        return produits.size();
    }

    public double calculerPrix(){
        double prix = 0;
        for (Produit produit : produits) {
            prix += produit.getPrix();
        }
        return prix;
    }

    @Override
    public String toString() {
        return "Panier{" +
                "produits=" + produits +
                '}';
    }

    public Iterator<Produit> iterator(){
        return this.produits.iterator() ;
    }

    public Produit retrouverProduit(String reference){

        for (Produit produit : produits) {
            if (produit.getReference().equals(reference)){
                return produit;
            }
        }
        return null;
    }


}
