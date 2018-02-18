import dao.Produit;
import dao.Services;

public class Test {

	public static void main(String[] args) {
		
		 Services s = new Services();
		 Produit p = new Produit("PC","Sony vaio", (double) 7000);
		 s.addProduit(p);

	}

}
