package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Categorie {
	private Long idCategorie;
	private String titre;
	private String Descreption;
	private Date dateAjout;
	
	//cette collection est permet de charger de tous les produits pour chaque categorie
	private Set<Produit> produits = new HashSet<Produit>();
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categorie(String titre, String descreption, Date dateAjout) {
		super();
		this.titre = titre;
		this.Descreption = descreption;
		this.dateAjout = dateAjout;
	}



	public Long getIdCategorie() { 
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescreption() {
		return Descreption;
	}
	public void setDescreption(String descreption) {
		Descreption = descreption;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	public Set<Produit> getProduits() {
		return produits;
	}



	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}	

}
