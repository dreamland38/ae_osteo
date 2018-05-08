/**
 * 
 */
package com.ae_osteo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Tarif entity.
 * @author romai
 *
 */
@Entity
public class Tarif {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tarif")
	private int id;
	@Column(name="code_tarif")
	private String code;
	@Column(name="libelle_tarif")
	private String libelle;
	private int tarif;
	
	/**
	 * Constructeur par défaut
	 */
	public Tarif() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the tarif
	 */
	public int getTarif() {
		return tarif;
	}

	/**
	 * @param tarif the tarif to set
	 */
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
}
