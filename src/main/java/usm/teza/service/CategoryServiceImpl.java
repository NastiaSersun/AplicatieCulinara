package usm.teza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import usm.teza.dao.CategoryDao;
import usm.teza.enteties.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	 
	@Transactional
	public void addCategory(Category category) {
		categoryDao.addCategory(category);
	}

	@Transactional
	public List<Category> listCategory() {
		return categoryDao.listCategory();
	}

}
