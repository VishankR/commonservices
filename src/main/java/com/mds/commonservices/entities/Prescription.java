package com.mds.commonservices.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="prescription")
public class Prescription {

	private int days;
	
	private int dispensed_quantity;
	
	private String drug_name;
	
	private int prescribed_quantity;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescription_id;
	
	private int refill_quantity;
	
	private int refills;
	 
	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;

	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "pres")
	private List<PrescriptionFill> presFill;

	public List<PrescriptionFill> getPresFill() {
		return presFill;
	}

	public void setPresFill(List<PrescriptionFill> presFill) {
		this.presFill = presFill;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getDispensed_quantity() {
		return dispensed_quantity;
	}

	public void setDispensed_quantity(int dispensed_quantity) {
		this.dispensed_quantity = dispensed_quantity;
	}

	public String getDrug_name() {
		return drug_name;
	}

	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}

	public int getPrescribed_quantity() {
		return prescribed_quantity;
	}

	public void setPrescribed_quantity(int prescribed_quantity) {
		this.prescribed_quantity = prescribed_quantity;
	}

	public int getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}

	public int getRefill_quantity() {
		return refill_quantity;
	}

	public void setRefill_quantity(int refill_quantity) {
		this.refill_quantity = refill_quantity;
	}

	public int getRefills() {
		return refills;
	}

	public void setRefills(int refills) {
		this.refills = refills;
	}

	@Override
	public String toString() {
		return "Prescription [days=" + days + ", dispensed_quantity=" + dispensed_quantity + ", drug_name=" + drug_name
				+ ", patient_id=" + ", prescribed_quantity=" + prescribed_quantity + ", prescription_id="
				+ prescription_id + ", refill_quantity=" + refill_quantity + ", refills=" + refills + "]";
	}
	
}
