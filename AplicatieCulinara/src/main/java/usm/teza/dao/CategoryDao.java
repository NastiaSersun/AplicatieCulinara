package usm.teza.dao;

import java.util.List;


import usm.teza.enteties.Category;

public interface CategoryDao {
	public void addCategory(Category category);
	public List<Category> listCategory();
}
