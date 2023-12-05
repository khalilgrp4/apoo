import java.util.ArrayList;

public class Carte{


    private ArrayList<Boisson> carteBoissons;

    public Carte() {
        carteBoissons = new ArrayList<Boisson>();
    }


    public boolean ajouter(Boisson boisson){
        if (this.contient(boisson))
            return false;
        return carteBoissons.add(boisson);
    }

    public boolean retirer(Boisson boisson){
        return carteBoissons.remove(boisson);
    }

    public boolean contient(Boisson boisson){
        return carteBoissons.contains(boisson);
    }

    public int nombreDeBoissons(){
        return carteBoissons.size();
    }

    @Override
    public String toString() {
        String texte = "Carte :";
        for (Boisson carteBoisson : carteBoissons) {
            texte += "\n"+carteBoisson;

        }
        return texte;


    }
}
