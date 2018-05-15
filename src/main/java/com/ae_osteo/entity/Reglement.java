package com.ae_osteo.entity;
// Generated 15 mai 2018 19:22:19 by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Reglement generated by hbm2java
 */
@Entity
@Table(name = "reglement", catalog = "ae_osteo", uniqueConstraints = @UniqueConstraint(columnNames = "code_reglement"))
public class Reglement implements java.io.Serializable {

	private Integer idReglement;
	private String codeReglement;
	private String libelleReglement;
	private Set<Facture> factures = new HashSet<Facture>(0);

	public Reglement() {
	}

	public Reglement(String codeReglement, String libelleReglement) {
		this.codeReglement = codeReglement;
		this.libelleReglement = libelleReglement;
	}

	public Reglement(String codeReglement, String libelleReglement, Set<Facture> factures) {
		this.codeReglement = codeReglement;
		this.libelleReglement = libelleReglement;
		this.factures = factures;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_reglement", unique = true, nullable = false)
	public Integer getIdReglement() {
		return this.idReglement;
	}

	public void setIdReglement(Integer idReglement) {
		this.idReglement = idReglement;
	}

	@Column(name = "code_reglement", unique = true, nullable = false, length = 45)
	public String getCodeReglement() {
		return this.codeReglement;
	}

	public void setCodeReglement(String codeReglement) {
		this.codeReglement = codeReglement;
	}

	@Column(name = "libelle_reglement", nullable = false, length = 45)
	public String getLibelleReglement() {
		return this.libelleReglement;
	}

	public void setLibelleReglement(String libelleReglement) {
		this.libelleReglement = libelleReglement;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reglement")
	public Set<Facture> getFactures() {
		return this.factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

}