
public class Membre {
	private String nomMembre, prenomMembre, numeroTelephone ;
    private Membre membreParrain;


	//Ajoutez un constructeur initialisant le nom, le prénom et le numéro de téléphone du membre.
    public Membre(String nomMembre, String prenomMembre, String numeroTelephone){
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.numeroTelephone = numeroTelephone;

    }


	
	//Ajoutez des getters pour tous les attributs

    public String getNomMembre() {
        return nomMembre;
    }

    public String getPrenomMembre() {
        return prenomMembre;
    }

    public Membre getMembreParrain() {
        return membreParrain;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }


    //Ajouter un setter pour le numéro de téléphone.

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }


    //Ajoutez une méthode permettant d'initialiser le parrain.
	//Cette méthode renvoie false si le membre a déjà un parrain ou si le membre passé en paramètre est le membre lui-même. 
	//Sinon, elle initialise le parrain et renvoie true.

    public boolean initialiserParrain(Membre parrainPotentiel){
        if (this.membreParrain != null)
            return false;

        if (this == membreParrain)
            return false;
        this.membreParrain = parrainPotentiel;
        return true;
    }

    @Override
    public String toString() {
        if (this.membreParrain==null){
            return nomMembre +" "+ prenomMembre+" "+numeroTelephone;
        }
        return nomMembre +" "+ prenomMembre+" "+" "+numeroTelephone+" "+ membreParrain.getNomMembre()+" "+membreParrain.getPrenomMembre();
    }


    //Ajoutez une méthode toString qui renverra toutes les informations du membre sous forme textuelle.
	//Si le membre a un parrain, il faut uniquement reprendre le prénom et le nom du parrain. Sinon, il faut dire que le membre n'a pas de parrain.






}
