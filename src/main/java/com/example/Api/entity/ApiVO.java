package com.example.Api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PROC_EXPORT_CUSTOMER_SERVICE_FCL")
public class ApiVO {
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private int SNO;
	private String DEPT;
    private String PRODUCT;
    private String ACTION;   
    private String COUNT;
    private String WITHINSLA;
    private String OUTOFSLA;
    public int getSNO() {
		return SNO;
	}
	public void setSNO(int sNO) {
		SNO = sNO;
	}
	public String getDEPT() {
		return DEPT;
	}
	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}
	public String getPRODUCT() {
		return PRODUCT;
	}
	public void setPRODUCT(String pRODUCT) {
		PRODUCT = pRODUCT;
	}
	public String getACTION() {
		return ACTION;
	}
	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}
	public String getCOUNT() {
		return COUNT;
	}
	public void setCOUNT(String cOUNT) {
		COUNT = cOUNT;
	}
	public String getWITHSLA() {
		return WITHINSLA;
	}
	public void setWITHSLA(String wITHSLA) {
		WITHINSLA = wITHSLA;
	}
	public String getOUTOFSLA() {
		return OUTOFSLA;
	}
	public void setOUTOFSLA(String oUTOFSLA) {
		OUTOFSLA = oUTOFSLA;
	}
	
    }


