package usm.teza.service;

import java.util.List;

import usm.teza.enteties.Aliment;

public interface AlimentService {
	
	public void addAliment(Aliment aliment);
	public Aliment findAliment(int idAliment);
	public List<Aliment> listAliment();
	public void editAliment(Aliment aliment);


}
