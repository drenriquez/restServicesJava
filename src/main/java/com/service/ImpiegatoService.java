package com.service;

import java.util.List;
import java.util.Optional;


import com.model.Impiegato;
//import com.exception.ResourceNotFoundException;
import com.model.Impiegato;


public interface ImpiegatoService {

	
	  public List < Impiegato > getImpiegati();
	  public List < Impiegato > getImpiegatiByCognome(String cognome);
	  public Impiegato getImpiegatoByCodicefiscale(String codicefiscale);
	  public void eliminaByCodicefiscale(String codicefiscale);
	    public void saveImpiegato(Impiegato imp);

	    public Impiegato getImpiegato(int Id) ;
	    public void deleteImpiegato(int Id) ;
}
