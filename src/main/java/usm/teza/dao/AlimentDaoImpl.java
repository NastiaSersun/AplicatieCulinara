package usm.teza.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import usm.teza.enteties.Aliment;

@Repository
public class AlimentDaoImpl implements AlimentDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addAliment(Aliment aliment) {
		sessionFactory.getCurrentSession().save(aliment);
		
	}

	public Aliment findAliment(int idAliment) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		Aliment aliment = (Aliment) session.get( Aliment.class, idAliment);
		tx.commit();
		session.close();
        
        return aliment;
	}

	public List<Aliment> listAliment() {
		return sessionFactory.getCurrentSession().createQuery("from Aliment").list();
	}

	public void editAliment(Aliment aliment) {
		Session session = sessionFactory.getCurrentSession();
		try 
		{
		
		session.beginTransaction();
		session.merge(aliment);
		session.getTransaction().commit();
		}
		catch (HibernateException e) {System.out.println("hibernate exception on AlimentDaoImpl");}
		
	}

	public void deleteAliment(int idAliment) {
		Aliment aliment = (Aliment)sessionFactory.getCurrentSession().load(Aliment.class, idAliment);
		if (null != aliment) {
			sessionFactory.getCurrentSession().delete(aliment);
		}
	}
	
}
