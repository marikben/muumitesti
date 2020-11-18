package com.example.muumi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Kategoriat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long kategoriaid;
	private String name;
	
	@OneToMany (cascade=CascadeType.ALL,mappedBy="kategoriat")
	
	
	public Long getKategoriaid() {
		return kategoriaid;
	}
	public Kategoriat(String name) {
		super();
		name = name;
	}
	public void setKategoriaid(Long kategoria) {
		this.kategoriaid = kategoria;
	}
	public Kategoriat() {};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
