package usm.teza.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import usm.teza.enteties.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	/*
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx =null;
		try {
		
			tx = session.beginTransaction();
			session.saveOrUpdate(user);
			user.setRegisterDate(new Date());
			user.setRole("admin");
			// Unit of work inside the transaction
			tx.commit();
			tx = null;
		} catch (Exception e) {
				if (tx != null)
				tx.rollback();
		}
			finally {
			session.close();
		}
	} */
	
	
	public void addUser(User user) {

/*		Session session = sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		user.setRegisterDate(new Date());
		user.setRole("admin");
		session.save(user);
	
		tx.commit();
		
		session.close();
*/		
		user.setRegisterDate(new Date());
		user.setRole("admin");
		sessionFactory.getCurrentSession().save(user);
	}


	public String editUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRole(User user, String role) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int userID) {
		// TODO Auto-generated method stub
		
	}

	public List<User> showUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

}
