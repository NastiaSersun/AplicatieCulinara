package usm.teza.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usm.teza.enteties.Aliment;
import usm.teza.enteties.Category;
import usm.teza.enteties.Recipe;
import usm.teza.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
    private CategoryService categoryService;
	
	 @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	 public String addCategory(@ModelAttribute("x") Category category, BindingResult result){
		 categoryService.addCategory(category);
		 return "redirect:/categ";
	 }

	 @RequestMapping("/categ")
		public String listCategory(Map<String, Object> map){
		
			map.put("category", new Category());
			
	        map.put("categoryList", categoryService.listCategory());
	 
	        return "category";
		}
	 
	 @RequestMapping("/recipeByCategory")
	    public String showCateg(Map<String, Object> map) {
		 map.put("RfindCategory", new Category());
			
	        map.put("categoryList", categoryService.listCategory());
	 
	        return "RfindCategory";
	         
	    }
}
