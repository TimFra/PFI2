package kd322b_franzen_t_uppgift3;

import java.util.ArrayList;

public class BikeStore{
	private Bike bikes;
	private String allBikes;
	public ArrayList<Bike> storedBikes = new ArrayList<Bike>();

	

	/** Hämtar alla "Bikes" sparade i  <storedBikes> */
	public String getAllBikes(){
		

		for(Bike b : storedBikes){
			allBikes += "Färg:" + b.getColor() + "|| Storlek:" + b.getSize() + "|| Pris: " + b.getPrice()+ "\n";
		}
		 
		 return allBikes;
	}
	
	/** Metod för at lägga till objekt i <storedBikes>*/
	public void addBike(String color, String size, String price){
		//storedBikes = new ArrayList<Bike>();
		int i;
		try {
			i = Integer.parseInt(size);
		} catch (Exception e){
			i = 0;
		}
		
		int y;
		try {
			y = Integer.parseInt(price);
		} catch (Exception e){
			y = 0;
		}
		
		storedBikes.add(new Bike(color, i, y));
		
		
	}

}
