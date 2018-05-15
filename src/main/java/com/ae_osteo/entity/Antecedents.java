package com.ae_osteo.entity;
// Generated 15 mai 2018 19:22:19 by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Antecedents generated by hbm2java
 */
@Entity
@Table(name = "antecedents", catalog = "ae_osteo")
public class Antecedents implements java.io.Serializable {

	private int idAntecedents;
	private Patient patient;
	private String atcdMed;
	private String atcdTrauma;
	private String atcdChir;
	private String anamnese;

	public Antecedents() {
	}

	public Antecedents(int idAntecedents, Patient patient) {
		this.idAntecedents = idAntecedents;
		this.patient = patient;
	}

	public Antecedents(int idAntecedents, Patient patient, String atcdMed, String atcdTrauma, String atcdChir,
			String anamnese) {
		this.idAntecedents = idAntecedents;
		this.patient = patient;
		this.atcdMed = atcdMed;
		this.atcdTrauma = atcdTrauma;
		this.atcdChir = atcdChir;
		this.anamnese = anamnese;
	}

	@Id

	@Column(name = "id_antecedents", unique = true, nullable = false)
	public int getIdAntecedents() {
		return this.idAntecedents;
	}

	public void setIdAntecedents(int idAntecedents) {
		this.idAntecedents = idAntecedents;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rf_id_patient", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Column(name = "atcd_med")
	public String getAtcdMed() {
		return this.atcdMed;
	}

	public void setAtcdMed(String atcdMed) {
		this.atcdMed = atcdMed;
	}

	@Column(name = "atcd_trauma")
	public String getAtcdTrauma() {
		return this.atcdTrauma;
	}

	public void setAtcdTrauma(String atcdTrauma) {
		this.atcdTrauma = atcdTrauma;
	}

	@Column(name = "atcd_chir")
	public String getAtcdChir() {
		return this.atcdChir;
	}

	public void setAtcdChir(String atcdChir) {
		this.atcdChir = atcdChir;
	}

	@Column(name = "anamnese")
	public String getAnamnese() {
		return this.anamnese;
	}

	public void setAnamnese(String anamnese) {
		this.anamnese = anamnese;
	}

}
