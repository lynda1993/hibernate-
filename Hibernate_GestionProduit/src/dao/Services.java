package dao;

import util.HibernateUtil;
import org.hibernate.Session;

;
public class Services {
	
	public void addProduit(Produit p) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

}
