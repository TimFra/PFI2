package kd322b_franzen_t_uppgift3;

public class Constants {
	
	/** Konstanter */
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 300000;
	public static final String colors[] = 
	{"red", "blue", "green", "yellow", "magenta", "cyan", "pink", "purple", "black", "white"};
	
	/** Kör input size i if-sats mot konstanter */
	public static int sizeLimitations(int size){
		
		if(size > MIN_SIZE && size < MAX_SIZE){
		return size;
		}
		else
		{
		return size = 0;
		}
		
	}
	/** Kör input price i if-sats mot konstanter */
	public static int priceLimitations(int price){
		if(price > MIN_PRICE && price < MAX_PRICE){
			return price;
		}
		else
		{
			return price = 0;
		}
		
	}
	/** Kör input color i loop och if-sats mot konstanter */
	public static String colorLimitations(String color){
		
		for (int i = 0; i < colors.length; i++){
			if(colors[i].contains(color)){
				return color;

			}
		}
		
		return color = "Färgen finns ej";


}
}
