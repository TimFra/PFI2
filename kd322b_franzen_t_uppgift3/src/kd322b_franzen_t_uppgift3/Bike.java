package kd322b_franzen_t_uppgift3;

public class Bike {
	//private Constants constant;
	private String color;
	private int price;
	private int size;
	public static int nrOfBikes;
	
	
	public Bike(String color, int size){
	}
	/** Skapar bike objekt med limitationer p� variabler fr�n Constants.java */
	public Bike(String color, int size, int price){
		this.color = Constants.colorLimitations(color);
		this.size = Constants.sizeLimitations(size);
		this.price = Constants.priceLimitations(price);
		nrOfBikes = nrOfBikes + 1;
		
	}
	/** H�mtar f�rg */
	public String getColor(){
		return this.color;
	}
	/** H�mtar storlek */
	public int getSize(){
		return this.size;
	}
	/** H�mtar pris */
	public int getPrice(){
		return this.price;
	}
	/** S�tter pris */
	public void setPrice(int price){
		this.price = price;
	}
	
}
