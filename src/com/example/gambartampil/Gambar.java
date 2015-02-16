package com.example.gambartampil;

public class Gambar {

	private int ID;
	private String GAMBAR;
	private String SUARA;

	public Gambar() {
		ID=0;
		GAMBAR="";
		SUARA="";
	}
	
	public Gambar(String gAMBAR, String sUARA) {
		
		GAMBAR=gAMBAR;
		SUARA=sUARA;
	
	}
	
	// fungsi get
	public int getID() {
		return ID;
	}
	
	public String getGAMBAR() {
		return GAMBAR;
	}
	
	public String getSUARA() {
		return SUARA;
	}
	
	
	//fungsi set
	public void setID(int id) {
		ID=id;
	}
	
	
	public void setGAMBAR(String gAMBAR) {
		GAMBAR = gAMBAR;
	}
	
	public void setSUARA(String sUARA) {
		SUARA = sUARA;
	}
		
}
