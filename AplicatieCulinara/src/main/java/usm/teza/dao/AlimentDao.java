package usm.teza.dao;

import java.util.List;

import usm.teza.enteties.Aliment;

public interface AlimentDao {
	public void addAliment(Aliment aliment);
	public Aliment findAliment(int idAliment);
	public List<Aliment> listAliment();
	public void editAliment(Aliment aliment);
	public void deleteAliment(int idAliment);

}
