package usm.teza.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import usm.teza.enteties.Aliment;
import usm.teza.enteties.Recipe;
import usm.teza.enteties.User;
import usm.teza.service.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;

	@RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
	 public String addRecipe(@ModelAttribute("x") Recipe recipe, BindingResult result){
		 recipeService.addRecipe(recipe);
		 return "redirect:/recipes";
	 }
	
	@RequestMapping("/recipes")
    public String listRecipes(Map<String, Object> map) {
		map.put("recipe",new Recipe());
		map.put("recipeList", recipeService.findRecipeByPrice(100));
		
		return "recipe";
         
    }
	
	@RequestMapping("/recipeByCategory-{categoryName}")
	public String listRecipesByCategory (@PathVariable("categoryName") String categoryName, Map<String, Object> map) {
		map.put("recipeList",new Recipe());
		map.put("recipeList", recipeService.findRecipeByCategory(categoryName));
		
		return "recipeList";
	}
	
	@RequestMapping("/show-{recipeID}")
	public String showRecipe (@PathVariable("recipeID") Integer recipeID, Map<String, Object> map) {
		map.put("recipeShow",new Recipe());
		map.put("recipe", recipeService.findRecipeByID(recipeID));
		
		return "recipeShow";
	}
	
	
	@RequestMapping("/showPrice-{priceP}")
	public String listRecipesByPrice(@PathVariable("priceP") Integer priceP, Map<String, Object> map) {
			map.put("recipeList",new Recipe());
			map.put("recipeList", recipeService.findRecipeByPrice(priceP));
			
			return "recipeList";
	}
	
	@RequestMapping("/recipeByPrice")
	 public String setPrice(@ModelAttribute("x") Integer priceP, BindingResult result){
		 return "redirect:/showPrice-{priceP}";
	}
	
}
