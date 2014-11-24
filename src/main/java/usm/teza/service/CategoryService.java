package usm.teza.service;

import java.util.List;

import usm.teza.enteties.Category;

public interface CategoryService {
	public void addCategory(Category category);
	public List<Category> listCategory();

}
