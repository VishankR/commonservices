package com.mds.commonservices.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="prescription_fill")
public class PrescriptionFill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescription_fill_id;
	
	private int days;
	
	private int dispensed_quantity;
	
	private int fill_number;
	
	//private int prescription_id;
	
	private int refill_number;

	//JPA Annotation
	@Temporal(TemporalType.DATE)
	private Date pickup_date;
	
	@ManyToOne
	@JoinColumn(name = "prescription_id", nullable = false)
	private Prescription pres;
	
	public Prescription getPres() {
		return pres;
	}

	public void setPres(Prescription pres) {
		this.pres = pres;
	}

	public Date getPickup_date() {
		return pickup_date;
	}

	public void setPickup_date(Date pickup_date) {
		this.pickup_date = pickup_date;
	}

	public int getPrescription_fill_id() {
		return prescription_fill_id;
	}

	public void setPrescription_fill_id(int prescription_fill_id) {
		this.prescription_fill_id = prescription_fill_id;
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

	public int getFill_number() {
		return fill_number;
	}

	public void setFill_number(int fill_number) {
		this.fill_number = fill_number;
	}

	/*public int getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}*/

	public int getRefill_number() {
		return refill_number;
	}

	public void setRefill_number(int refill_number) {
		this.refill_number = refill_number;
	}
	
	@Override
	public String toString() {
		return "PrescriptionFill [prescription_fill_id=" + prescription_fill_id + ", days=" + days
				+ ", dispensed_quantity=" + dispensed_quantity + ", fill_number=" + fill_number + ", prescription_id="
				+ ", refill_number=" + refill_number + "]";
	}
}
