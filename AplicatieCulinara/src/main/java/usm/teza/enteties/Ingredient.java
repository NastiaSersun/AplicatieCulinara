package usm.teza.enteties;

import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AssociationOverride;
import javax.persistence.JoinColumn;

@Entity
@Table(name="INGREDIENTS")
@AssociationOverrides({
    @AssociationOverride(name = "pk.aliment", 
        joinColumns = @JoinColumn(name = "id_aliment")),
    @AssociationOverride(name = "pk.recipe", 
        joinColumns = @JoinColumn(name = "id_recipe")) })
public class Ingredient {
	
	@EmbeddedId
	private IngredientID pk = new IngredientID();

	@Column(name = "quantity", nullable = false) 
	private float quantity;

	public IngredientID getPk() {
	        return pk; 
	    }

	public void setPk(IngredientID pk) {
		this.pk = pk;
	}
	
	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	/*
	
	@Column(name = "id_recipe", nullable = false)
	private int idRecipe;

	@Column(name = "id_aliment", nullable = false)
	private int idAliment;
	
	public int getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(int idRecipe) {
		this.idRecipe = idRecipe;
	}

	public int getIdAliment() {
		return idAliment;
	}

	public void setIdAliment(int idAliment) {
		this.idAliment = idAliment;
	}
	*/
	
	

}
