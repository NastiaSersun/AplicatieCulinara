package usm.teza.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import usm.teza.enteties.Aliment;
import usm.teza.enteties.Rank;
import usm.teza.enteties.Recipe;
import usm.teza.enteties.User;

@Repository
public class RecipeDaoImpl implements RecipeDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addRecipe(Recipe recipe) {
		
		//Aliment aliment
		float price;
		Session session = sessionFactory.getCurrentSession();
		
		
	//	session.load(aliment);
		
		session.save(recipe);
	}
	
	public Recipe findRecipeByID(int recipeId) {
		Session session = sessionFactory.getCurrentSession();
		Recipe recipe = (Recipe) session.get( Recipe.class, recipeId);
        return recipe;
	}

	public List<Recipe> findRecipeByIngredients(List ingredientsList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Recipe> findRecipeByPrice(int maxPrice) {
		Integer i = maxPrice;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Recipe recipe where recipe.price>= ?";
		Query query = session.createQuery(hql);
		
		query.setString(0, i.toString());
		
		List<Recipe> listRecipe = query.list();
		
		return listRecipe;
	}

	public List<Recipe> findRecipeByTime(int timePreparation) {
		
		Integer i = timePreparation;
		
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
			String hql = "from Recipe recipe where recipe.timePreparation <= ?" ;
			Query query = session.createQuery(hql);
			query.setString(0, i.toString());
			
			List<Recipe> listRecipe = query.list();
		tx.commit();
		session.close();
		
		return listRecipe;
	}

	public List<Recipe> findRecipeByCategory(String category) {
		
		Session session = sessionFactory.getCurrentSession();
			String hql = "from Recipe recipe where recipe.category.naming = ?" ;
			Query query = session.createQuery(hql);
			query.setString(0, category);
			
			List<Recipe> listRecipe = query.list();
		
		return listRecipe;
		
	}

	public List<Recipe> showRecipeByPopularity() {
		return sessionFactory.getCurrentSession().createQuery("from Recipe recipe order by recipe.rank asc").list();
	}

	public void addRank(int recipeId, int mark) {
		
		Float newRank;
	
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
			User user = (User) sessionFactory.getCurrentSession().createQuery("from User user where user.role = 'admin' ");
		tx.commit();
		
		Rank rank = new Rank();
		rank.setRank(mark);
		rank.setIdRecipe(recipeId);
		rank.setIdUser(user.getId());

		tx = session.beginTransaction();
			session.save(rank);		

			String sQuery= "select count(rank) from Rank rank where rank.idRecipe= ?";
			Query query = session.createQuery(sQuery);
			query.setParameter(0, recipeId);
			List l=query.list();
			int this_num_votes = (Integer) l.get(0);
			
			sQuery= "select recipe.rank from Recipe recipe where recipe.recipeID = recipeId";
			float this_rating = (Float) session.createQuery(sQuery).list().get(0);
		
			newRank = ( 14 + (this_num_votes * this_rating) ) / (4 + this_num_votes);
		
			Recipe recipe = (Recipe) session.get(Recipe.class, recipeId);
			if (null != recipe) {
				recipe.setRank(newRank);
			}
		tx.commit();
		session.close();
	}

}
