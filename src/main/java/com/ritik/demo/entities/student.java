package com.ritik.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class student {
	
    @Id
    @GeneratedValue
    private int sId;
    private String sName;
	private String sGmail;
	private String sGender;
	
	
	

	public void setsId(int sId) {
		this.sId = sId;
	}

	public student()
	{
		super();
	}
	
	public student(String sName, String sGmail, String sGender) {
		super();
		this.sName = sName;
		this.sGmail = sGmail;
		this.sGender = sGender;
	}

	public student(student stu) {
		super();
		this.sName = stu.sName;
		this.sGmail = stu.sGmail;
		this.sGender = stu.sGender;
	}

	public String getsGmail() {
		return sGmail;
	}
	public void setsGmail(String sGmail) {
		this.sGmail = sGmail;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public int getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "student [sId=" + sId + ", sName=" + sName + ", sGmail=" + sGmail + ", sGender=" + sGender + "]";
	}
	
}
