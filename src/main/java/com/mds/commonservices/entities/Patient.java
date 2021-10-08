package com.mds.commonservices.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

//JPA Annotation
@Entity
//JPA Annotation
@Table(name="patient")
public class Patient {
	//JPA Annotation
	@Id
	/*
	 * Strategy - GenerationType.AUTO 
	 *    -GenerationType.IDENTITY 
	 *    -GenerationType.TABLE 
	 *    -@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_name_for_using_in_GenerationType.SEQUENCE_annotation")
	 *     JPA Annotation
	        @SequenceGenerator(name = "seq_name_for_using_in_GenerationType.SEQUENCE_annotation", sequenceName = "sequence_name_in_oracle_db")
	        -@GeneratedValue(strategy=GenerationType.TABLE, generator ="seq_name_for_using_in_GenerationType.TABLE_annotation")
	        JPA Annotation
	        @TableGenerator(name = "seq_name_for_using_in_GenerationType.TABLE_annotation", 
	         schema ="schema_in_which_keyTable_exist", table = "keyTable_name", pkColumnName = "pkcoulmnName_of_keyTable",
	          valueColumnName = "valueColumnName_of_keyTable")	
	 */
	//JPA Annotation
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patient_id;

	private String first_name;
	
	private String last_name;
	
	private String middle_name;
	
	private String gender;

	//JPA Annotation
	@Column(name="dob", nullable=false)
	//JPA Annotation
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;
	
	private String mail;
	
	//hibernate annotation
	/*@Formula("lower(datediff(curDate() - birthDate)/365)")
	private int age;*/
	
	//JPA Annotation
	@Transient
	private boolean valid;

	//JPA Annotation
	@Embedded
	@AttributeOverrides({@AttributeOverride(name = "home_contact", column = @Column(name = "home_contact")),
			@AttributeOverride(name = "mobile_contact", column = @Column(name="mobile_contact")),
			@AttributeOverride(name = "office_contact", column = @Column(name="office_contact"))})
	private Contact contact;
	
	//All JPA Annotation
	@ElementCollection
	@CollectionTable(name = "patient_address", joinColumns = @JoinColumn(name="patient_id"))
	@AttributeOverrides({@AttributeOverride(name = "street", column = @Column(name = "street")), @AttributeOverride(name = "city", column = @Column(name="city")),
		@AttributeOverride(name = "state", column = @Column(name="state"))})
	private List<PatientAddress> address;

	//If I use "mappedBy" attribute in owning entity then we can suppress one additional update query which is triggered if
	//I use "mappedBy" attribute in non-owning entity in a Bi-Directional relationship.
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "patient")
	private List<Prescription> pres;

	public List<Prescription> getPres() {
		return pres;
	}

	public void setPres(List<Prescription> pres) {
		this.pres = pres;
	}
	
/*	public Prescription getPres() {
		return pres;
	}

	public void setPres(Prescription pres) {
		this.pres = pres;
	}*/

	public List<PatientAddress> getAddress() {
		return address;
	}

	public void setAddress(List<PatientAddress> address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

/*	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}*/

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
		
	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", middle_name=" + middle_name + ", gender=" + gender + ", birthDate=" + birthDate + ", mail=" + mail
				+ "]";
	}

}
