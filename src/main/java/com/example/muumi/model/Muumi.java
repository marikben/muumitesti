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
	private String Nimi, url;

	@ManyToOne
	@JoinColumn(name="kategoria")
	private Kategoriat kategoria;
	
	public Muumi() {}
	public Muumi(String Nimi) {
		this.Nimi = Nimi;
	}
	public Muumi(String nimi,  String url) {
		this.Nimi = nimi;
		this.url = url;
	}
	public Muumi(String nimi, Kategoriat kat, String url) {
		this.Nimi = nimi;
		this.kategoria = kat;
		this.url = url;
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
		this.Nimi = nimi;
	}
	
	public Kategoriat getKategoria() {
		return kategoria;
	}
	public void setKategoria(Kategoriat kategoria) {
		this.kategoria = kategoria;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Muumi [id=" + id + ", Nimi=" + Nimi + "]";
	}
}
