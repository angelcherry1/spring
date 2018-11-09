package com.ss.pojo;

import java.io.Serializable;

public class PrintInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long printId;
	private Long bookInfoId;
	private Long printerId;
	private String printSize;
	private String printDate;
	private short printNum;
	private short printBatch;
	private Printer printer;
	
	
	@Override
	public String toString() {
		return "PrintInfo [printId=" + printId + ", bookInfoId=" + bookInfoId + ", printerId=" + printerId
				+ ", printSize=" + printSize + ", printDate=" + printDate + ", printNum=" + printNum + ", printBatch="
				+ printBatch + ", printer=" + printer + "]";
	}

	public PrintInfo(Long printId, Long bookInfoId, Long printerId, String printSize, String printDate, short printNum,
			short printBatch, Printer printer) {
		super();
		this.printId = printId;
		this.bookInfoId = bookInfoId;
		this.printerId = printerId;
		this.printSize = printSize;
		this.printDate = printDate;
		this.printNum = printNum;
		this.printBatch = printBatch;
		this.printer = printer;
	}

	public PrintInfo() {
		super();
	}
	
	public String getPrintDate() {
		return printDate;
	}
	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}
	
	public Long getPrintId() {
		return printId;
	}
	public void setPrintId(Long printId) {
		this.printId = printId;
	}
	public Long getBookInfoId() {
		return bookInfoId;
	}
	public void setBookInfoId(Long bookInfoId) {
		this.bookInfoId = bookInfoId;
	}
	public Long getPrinterId() {
		return printerId;
	}
	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}
	public String getPrintSize() {
		return printSize;
	}
	public void setPrintSize(String printSize) {
		this.printSize = printSize;
	}
	public short getPrintNum() {
		return printNum;
	}
	public void setPrintNum(short printNum) {
		this.printNum = printNum;
	}
	public short getPrintBatch() {
		return printBatch;
	}
	public void setPrintBatch(short printBatch) {
		this.printBatch = printBatch;
	}
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
