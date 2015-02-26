package kd322b_franzen_t_uppgift3;

public class Bike {
	//private Constants constant;
	private String color;
	private int price;
	private int size;
	public static int nrOfBikes;
	
	
	public Bike(String color, int size){
	}
	/** Skapar bike objekt med limitationer på variabler från Constants.java */
	public Bike(String color, int size, int price){
		this.color = Constants.colorLimitations(color);
		this.size = Constants.sizeLimitations(size);
		this.price = Constants.priceLimitations(price);
		nrOfBikes = nrOfBikes + 1;
		
	}
	/** Hämtar färg */
	public String getColor(){
		return this.color;
	}
	/** Hämtar storlek */
	public int getSize(){
		return this.size;
	}
	/** Hämtar pris */
	public int getPrice(){
		return this.price;
	}
	/** Sätter pris */
	public void setPrice(int price){
		this.price = price;
	}
	
}
