package usm.teza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import usm.teza.dao.RecipeDao;
import usm.teza.enteties.Recipe;


@Service
public class RecipeServiceImpl implements RecipeService{

	@Autowired
	private RecipeDao recipeDao;
	
	@Transactional
	public void addRecipe(Recipe recipe) {
		recipeDao.addRecipe(recipe);
		
	}

	@Transactional
	public Recipe findRecipeByID(int recipeId) {
		return recipeDao.findRecipeByID(recipeId);
	}

	@Transactional
	public List<Recipe> findRecipeByIngredients(List ingredientsList) {
		// TODO Auto-generated method stub
		return recipeDao.findRecipeByIngredients(ingredientsList);
	}

	@Transactional
	public List<Recipe> findRecipeByPrice(int maxPrice) {
		// TODO Auto-generated method stub
		return recipeDao.findRecipeByPrice(maxPrice);
	}

	@Transactional
	public List<Recipe> findRecipeByTime(int timePreparation) {
		// TODO Auto-generated method stub
		return recipeDao.findRecipeByTime(timePreparation);
	}

	@Transactional
	public List<Recipe> findRecipeByCategory(String category) {
		// TODO Auto-generated method stub
		return recipeDao.findRecipeByCategory(category);
	}

	@Transactional
	public List<Recipe> showRecipeByPopularity() {
		// TODO Auto-generated method stub
		return recipeDao.showRecipeByPopularity();
	}

	@Transactional
	public void addRank(int recipeId, int mark) {
		// TODO Auto-generated method stub
		recipeDao.addRank(recipeId, mark);
	}

}
