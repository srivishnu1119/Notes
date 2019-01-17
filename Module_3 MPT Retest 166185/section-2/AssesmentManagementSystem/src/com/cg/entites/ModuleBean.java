package com.cg.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee_details")
public class ModuleBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int details_Id;
	private String trainee_name;
	private String module_Name;
	private int mpt_Marks;
	private int mtt_Marks;
	public int getMtt_Marks() {
		return mtt_Marks;
	}
	public void setMtt_Marks(int mtt_Marks) {
		this.mtt_Marks = mtt_Marks;
	}
	private int assignment_Marks;
	private int total;
	public int getDetails_Id() {
		return details_Id;
	}
	public void setDetails_Id(int details_Id) {
		this.details_Id = details_Id;
	}
	public String getTrainee_name() {
		return trainee_name;
	}
	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}
	public String getModule_Name() {
		return module_Name;
	}
	public void setModule_Name(String module_Name) {
		this.module_Name = module_Name;
	}
	public int getMpt_Marks() {
		return mpt_Marks;
	}
	public void setMpt_Marks(int mpt_Marks) {
		this.mpt_Marks = mpt_Marks;
	}
	public int getAssignment_Marks() {
		return assignment_Marks;
	}
	public void setAssignment_Marks(int assignment_Marks) {
		this.assignment_Marks = assignment_Marks;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
