import java.util.*;

public class CoffeeShop{

	public static void main(String[] args) {
		
	}

}


class Customer {
	private String fname;
	private String lname;
	private String street;
	private String city; 
	private String zipcode;
}

class Order{

	private Date date;
}

class OrderDetail {
	
	private Item[] orderedItems;

	public double calcSubTotal(){

	}

	public calcWeight(){
		
	}

}

class Item {
	private int shippingWeight;
	private String description;
	private double weight;

	public double getPriceForQuantity(){

	}

	public double getWeight(){

	}

}

class Cash {
	private double cashTendered;

}

class Credit {
	private int number;
	private String type;
	private Date expData;

}

class Check {

	private String name; 
	private int bankID;

}