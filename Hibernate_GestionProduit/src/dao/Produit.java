 package dao;

public class Produit {
	
	//il faut mettre toujours l'identifiant ou la clé de la table en type objet et non primitif
	//c-à-d Long au lieu de long et aussi integer au lieu de int 
	private Long idProduit;
	private String Nom;
	private String description;
	private Double prix;
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Produit(String nom, String description, Double prix) {
		super();
		this.Nom = nom;
		this.description = description;
		this.prix = prix;
	}


	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	 
}
