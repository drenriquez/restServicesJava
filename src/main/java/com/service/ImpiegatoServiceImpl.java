package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.model.Impiegato;
import com.repository.ImpiegatoRepository;

@Service
public class ImpiegatoServiceImpl implements ImpiegatoService {
 
	@Autowired
    private ImpiegatoRepository impiegatoRepository;
	
	public List < Impiegato > getImpiegati() {
        return impiegatoRepository.findAll();
    }

	
    @Transactional
    public void saveImpiegato(Impiegato imp) {
    	impiegatoRepository.save(imp);
    }



    @Transactional
    public void deleteImpiegato(int id) {
    	impiegatoRepository.deleteById(id);
    }


	public Impiegato getImpiegato(int id) {
      return impiegatoRepository.findById(id).get();
	}

	@Override
	public List<Impiegato> getImpiegatiByCognome(String cognome) {
		// TODO Auto-generated method stub
		return impiegatoRepository.findByCognome(cognome);
	}


	@Override
	public Impiegato getImpiegatoByCodicefiscale(String codicefiscale) {
		// TODO Auto-generated method stub
		return impiegatoRepository.findByCodicefiscale(codicefiscale);
	}


	@Override
	public void eliminaByCodicefiscale(String codicefiscale) {
		impiegatoRepository.delete(getImpiegatoByCodicefiscale(codicefiscale));
		
	}

}
