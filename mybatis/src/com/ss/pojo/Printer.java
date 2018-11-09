package com.ss.pojo;

import java.io.Serializable;

public class Printer implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long printerId;
	private String printerName;
	private String printerAddress;
	private String PrinterPhone;
	private String printerZip;
	private String printerLegalPerson;
	private String contactPerson;
	private String contactCellphone;
	private String faxNum;
	public Long getPrinterId() {
		return printerId;
	}
	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public String getPrinterAddress() {
		return printerAddress;
	}
	public void setPrinterAddress(String printerAddress) {
		this.printerAddress = printerAddress;
	}
	public String getPrinterPhone() {
		return PrinterPhone;
	}
	public void setPrinterPhone(String printerPhone) {
		PrinterPhone = printerPhone;
	}
	public String getPrinterZip() {
		return printerZip;
	}
	public void setPrinterZip(String printerZip) {
		this.printerZip = printerZip;
	}
	public String getPrinterLegalPerson() {
		return printerLegalPerson;
	}
	public void setPrinterLegalPerson(String printerLegalPerson) {
		this.printerLegalPerson = printerLegalPerson;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactCellphone() {
		return contactCellphone;
	}
	public void setContactCellphone(String contactCellphone) {
		this.contactCellphone = contactCellphone;
	}
	public String getFaxNum() {
		return faxNum;
	}
	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Printer(Long printerId, String printerName, String printerAddress, String printerPhone, String printerZip,
			String printerLegalPerson, String contactPerson, String contactCellphone, String faxNum) {
		super();
		this.printerId = printerId;
		this.printerName = printerName;
		this.printerAddress = printerAddress;
		PrinterPhone = printerPhone;
		this.printerZip = printerZip;
		this.printerLegalPerson = printerLegalPerson;
		this.contactPerson = contactPerson;
		this.contactCellphone = contactCellphone;
		this.faxNum = faxNum;
	}
	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Printer [printerId=" + printerId + ", printerName=" + printerName + ", printerAddress=" + printerAddress
				+ ", PrinterPhone=" + PrinterPhone + ", printerZip=" + printerZip + ", printerLegalPerson="
				+ printerLegalPerson + ", contactPerson=" + contactPerson + ", contactCellphone=" + contactCellphone
				+ ", faxNum=" + faxNum + "]";
	}
	
}
