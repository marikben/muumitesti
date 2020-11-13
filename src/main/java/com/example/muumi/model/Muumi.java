package com.example.muumi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity

public class Muumi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nimi;
	@ManyToOne
	@JoinColumn(name="kategoria")
	private Kategoriat kategoria;
	public Kategoriat getKategoria() {
		return kategoria;
	}
	public void setKategoria(Kategoriat kategoria) {
		this.kategoria = kategoria;
	}
	public Muumi() {}
	public Muumi(String Nimi) {
		this.Nimi = Nimi;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNimi() {
		return Nimi;
	}
	public void setNimi(String nimi) {
		Nimi = nimi;
	}
	
	@Override
	public String toString() {
		return "Muumi [id=" + id + ", Nimi=" + Nimi + "]";
	}
}