import java.util.ArrayList;
import java.util.Iterator;

public class ListeSolides {

    private ArrayList<Solide> solides;

    public ListeSolides() {
        solides = new ArrayList<Solide>();
    }

    public boolean estVide(){
        if (solides.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean ajouter(Solide s){
        if (solides.contains(s)){
            return false;
        }
        return solides.add(s);
    }

    public boolean supprimer(Solide s){
        return solides.remove(s);
    }

    public boolean contient(Solide s){
        return solides.contains(s);
    }

    public int nombreDeSolides(){
        return solides.size();
    }

    public Iterator<Solide> iterator(){
        return this.solides.iterator() ;
    }

    public ArrayList<Solide> trouverPlusGrand(){
        ArrayList<Solide> liste = new ArrayList<Solide>();
        double volumeMax = 520;
        for (Solide solide : solides) {
            if (solide.calculerVolume()>volumeMax){
                liste.add(solide);
            }
        }
        return liste;

    }

    @Override
    public String toString() {
        String texte = "Liste des solide :"+"\n";
        for (Solide solide : solides) {
            texte += solide+"\n";
        }
        return texte;
    }
}
