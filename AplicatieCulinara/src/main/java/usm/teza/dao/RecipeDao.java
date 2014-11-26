package usm.teza.dao;

import java.util.List;

import usm.teza.enteties.Recipe;

public interface RecipeDao {
	public void addRecipe(Recipe recipe);
	public Recipe findRecipeByID(int recipeId);
	public List<Recipe> findRecipeByIngredients(List ingredientsList);
	public List<Recipe> findRecipeByPrice(int maxPrice);
	public List<Recipe> findRecipeByTime(int timePreparation);
	public List<Recipe> findRecipeByCategory(String category);
	public List<Recipe> showRecipeByPopularity();
	public void addRank(int recipeId,int mark);

}
