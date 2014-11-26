package usm.teza.enteties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RECIPES")
public class Recipe implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "ID_RECIPE")
	private int recipeID;
	
	@Column(name = "title", nullable = false, length = 70)
	private String title;
	
	/*
	@Column(name = "id_category", nullable = false)
	private int idCategory;
	
	 @ManyToOne
	    @JoinColumn(name="department_id")
	    private Department department;
	 */
	@ManyToOne
	@JoinColumn(name="id_category")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="id_user", nullable=true)
	private User user;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "description")
	private String description;
	


	@Column(name = "rank")
	private float rank;
	
	@Column(name = "calories")
	private float calories;
	
	@Column(name = "time_prep")
	private int timePreparation;
	
	@Column(name = "image",  length =250)
	private String imageLink;
	
/*****************************************/
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.recipe", cascade=CascadeType.ALL)
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
/*****************************************/
	
	//methods
 	
	
	public int getRecipeID() {
		return recipeID;
	}

	public float getCalories() {
	return calories;
}

public void setCalories(float calories) {
	this.calories = calories;
}

	public void setRecipeID(int recipeID) {
		this.recipeID = recipeID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
/*
	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
*/

	public float getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setPrice(float price) { // se va seta la adaugarea in tabel (formula : fiecare ingredient.aliment.price *ingredient.quantity)
		this.price = price;
	}

	public float getRank() {
		return rank;
	}

	public void setRank(float rank) { //default rank = 2.5; (intervalul 1-5)
		this.rank = rank;
	}

	public int getTimePreparation() {
		return timePreparation;
	}

	public void setTimePreparation(int timePreparation) {
		this.timePreparation = timePreparation;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) { 
		this.imageLink = imageLink;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + recipeID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (recipeID != other.recipeID)
			return false;
		return true;
	}

	

}
