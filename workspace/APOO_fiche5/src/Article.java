import java.util.Objects;

public class Article {
	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private double tauxTVA;
	private final static double TAUX_TVA_PAR_DEFAUT = 21;
	private static int nbrArticles = 0;

	public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {

		setDescription(description);
		setPrixHTVA(prixHTVA);
		this.reference = reference;
		this.nom = nom;
		this.tauxTVA=tauxTVA ;
		nbrArticles ++;
		if (reference == null || nom == null){
			throw new IllegalArgumentException("la référence ainsi que le nom d'article ne peuvent pas être null");

		}
		if (reference == "" || nom == ""){
			throw new IllegalArgumentException("Message invalide.");
		}
		if (tauxTVA<0 || tauxTVA>100){
			throw new IllegalArgumentException("On depasse l'intervalle.");
		}
		if (prixHTVA<0){
			throw new IllegalArgumentException("le prix d'un article doit être strictement positif.");
		}

	}
	
	public Article(String reference, String nom, String description,
			double prixHTVA) {
		this(reference,nom,description,prixHTVA,Article.TAUX_TVA_PAR_DEFAUT);
	}


	public String getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixHTVA() {
		return prixHTVA;
	}
	
	public void setPrixHTVA(double prixHTVA) {
		this.prixHTVA = prixHTVA;
	}

	public double getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}


	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) {
		if(reduction<0 || reduction>=100){
			throw new IllegalArgumentException("On depasse l'intervalle.");
		}
		return calculerPrixTVAComprise() * (1-reduction/100.0);

	}

	public static int getNbrArticles(){
		return nbrArticles;
	}

	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Article article = (Article) o;
		return reference.equals(article.reference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference);
	}
}
