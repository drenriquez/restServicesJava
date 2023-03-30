package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="impiegato")
public class Impiegato {
	@Id
	private int matricola;
	
	private String nome, cognome, codicefiscale;	
	
	public Impiegato() {
	    // Costruttore di default vuoto
	}
	 
	public Impiegato(String _nome, String _cognome, String _codicefiscale, int _matricola) {
	
		 setMatricola(_matricola); 
		 setNome(_nome);
		 setCognome(_cognome);
		 setCodicefiscale(_codicefiscale);
		 //System.out.println("**************NEW_IMPIEGATO************");
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodicefiscale() {
		return codicefiscale;
	}

	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", codicefiscale=" + codicefiscale + ", matricola="
				+ matricola + "]";
	}
		 
}
