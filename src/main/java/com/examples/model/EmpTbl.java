package com.examples.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emp_tbl database table.
 * 
 */
@Entity
@Table(name="emp_tbl")
@NamedQuery(name="EmpTbl.findAll", query="SELECT e FROM EmpTbl e")
public class EmpTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMP_TBL_ID_GENERATOR", sequenceName="EMPSEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_TBL_ID_GENERATOR")
	private long id;

	@Column
	private String address;

	@Column
	private String email;

	@Column
	private String name;

	@Column
	private String telephone;

	public EmpTbl() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}