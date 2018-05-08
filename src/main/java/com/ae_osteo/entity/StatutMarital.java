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
 * Statut marital entity.
 * @author romai
 *
 */
@Entity
public class StatutMarital {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_statut_marital")
	private int id;
	@Column(name="code_statut_marital")
	private String code;
	@Column(name="libelle_statut_marital")
	private String libelle;
	
	/**
	 * Constructeur par défaut
	 */
	public StatutMarital() {
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
}
