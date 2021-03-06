package it.uniroma3.siw.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


//lascio le politiche di fetch di default e non inserisco cascade

@Entity
public class Allievo {
	
	@Id
	private long matricola;
	
	
	private String nome;
	private String cognome;
	
	private Date dataNascita;
	private String luogoNascita;
	private String indirizzoMail;
	
	@ManyToOne
	@JoinColumn(name = "societaId")
	private Societ? societ?;
	
	@ManyToMany(mappedBy = "allievi")
	private List<Corso> corsi; 

	public long getMatricola() {
		return matricola;
	}

	public void setMatricola(long matricola) {
		this.matricola = matricola;
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

	public String getIndirizzoMail() {
		return indirizzoMail;
	}

	public void setIndirizzoMail(String indirizzoMail) {
		this.indirizzoMail = indirizzoMail;
	}

	public Societ? getSociet?() {
		return societ?;
	}

	public void setSociet?(Societ? societ?) {
		this.societ? = societ?;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
	
	
	
}
