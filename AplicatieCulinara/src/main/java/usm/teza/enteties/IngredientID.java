package usm.teza.enteties;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class IngredientID implements java.io.Serializable{
	
	 @ManyToOne
	 private Aliment aliment;
	 
	 @ManyToOne
	 private Recipe recipe;

	public Aliment getAliment() {
		return aliment;
	}

	public void setAliment(Aliment aliment) {
		this.aliment = aliment;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	 	 
}