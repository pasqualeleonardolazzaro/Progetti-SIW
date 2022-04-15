package it.uniroma3.siw.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nome;
	
	private Date dataInizio;
	private int durataInMesi;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Allievo> allievi;
	
	@ManyToOne
	private Docente docente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurataInMesi() {
		return durataInMesi;
	}

	public void setDurataInMesi(int durataInMesi) {
		this.durataInMesi = durataInMesi;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

}
