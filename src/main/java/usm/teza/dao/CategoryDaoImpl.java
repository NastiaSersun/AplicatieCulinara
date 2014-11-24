package usm.teza.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import usm.teza.enteties.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		
	}

	public List<Category> listCategory() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

}
