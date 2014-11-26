package usm.teza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import usm.teza.dao.AlimentDao;
import usm.teza.enteties.Aliment;

@Service
public class AlimentServiceImpl implements AlimentService{
	
	@Autowired
	public AlimentDao alimentDao;

	@Transactional
	public void addAliment(Aliment aliment) {
		alimentDao.addAliment(aliment);
		
	}

	@Transactional
	public Aliment findAliment(int idAliment) {
		Aliment aliment = alimentDao.findAliment(idAliment);
		return aliment;
	}

	@Transactional
	public List<Aliment> listAliment() {
		return alimentDao.listAliment();
	}

	@Transactional
	public void editAliment(Aliment aliment) {
		alimentDao.editAliment(aliment);
		
	}

}
