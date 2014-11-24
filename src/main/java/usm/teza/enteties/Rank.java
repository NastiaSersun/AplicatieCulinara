package usm.teza.enteties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RANK")
public class Rank {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int idRank;
	
	@Column(name = "ID_RECIPE", nullable = false)
	private int idRecipe;
	
	@Column(name = "ID_USER", nullable = false, length = 70)
	private int idUser;
	
	@Column(name = "RANK_VALUE", nullable = false, length = 70)
	private int rank;
	
	public int getIdRecipe() {
		return idRecipe;
	}
	public void setIdRecipe(int idRecipe) {
		this.idRecipe = idRecipe;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) { 
		this.rank = rank;
	}
	public int getIdRank() {
		return idRank;
	}
	public void setIdRank(int idRank) {
		this.idRank = idRank;
	}
	
	

}
