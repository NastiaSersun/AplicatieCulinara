package usm.teza.enteties;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ALIMENTS")
public class Aliment {
	
	
	@Id
	@GeneratedValue
	@Column(name = "id_aliment")
	private int idAliment;
	
	@Basic
	@Column(name="naming", nullable=false, length =70)
	private String name;
	
	@Basic
	@Column(name="calories", nullable=false)
	private int calories;   //per 1 kg
	
	@Basic
	@Column(name="price", nullable=false)
	private float price;
	
//*************************
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.aliment", cascade=CascadeType.ALL)
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
//*****************************************

	public int getIdAliment() {
		return idAliment;
	}

	public void setIdAliment(int idAliment) {
		this.idAliment = idAliment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
/*
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAliment;
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
		Aliment other = (Aliment) obj;
		if (idAliment != other.idAliment)
			return false;
		return true;
	}

	
}
