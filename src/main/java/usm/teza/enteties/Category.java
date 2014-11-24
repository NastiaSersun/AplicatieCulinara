package usm.teza.enteties;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CATEGORY")
public class Category {
	
	//ar fi bine de intordus metoda getRecipes, care sa returneze lista tuturor retetelor
	@Id
	@GeneratedValue
	@Column(name = "ID_CATEGORY")
	private int idCategory;
	
	@Column(name = "naming", nullable = false, length = 70)
	private String naming;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="category", orphanRemoval=true)
	private Set<Recipe> recipes = new HashSet<Recipe>();
	
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getNaming() {
		return naming;
	}
	public void setNaming(String naming) {
		this.naming = naming;
	}
	public Set<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}

}
