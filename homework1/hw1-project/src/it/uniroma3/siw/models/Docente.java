package it.uniroma3.siw.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 

//modifico la politica di fetch da Lazy a Eager per corsi in quanto è lecito sapere i corsi che insegnano i docenti
//e le cascade in quanto se elimino un docente elimino anche i suoi corsi

@Entity
public class Docente {
	
	@Id
	private long partitaIva;
	
	
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String luogoNascita;
	
	
	@OneToMany( mappedBy = "docente", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
	private List<Corso> corsi;

	public long getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(long partitaIva) {
		this.partitaIva = partitaIva;
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

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}


}
