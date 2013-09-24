public class ItemSalesTracker  {

	public static void main(String[] args) {
		
		Item i = new Item("soup");
		
		i.registerSale(10);
		i.displaySales();

		i.registerSale(4);
		i.displaySales();

	}

}

class Item {

		private String name;
		private int numSold = 0;
		private double totalSales = 0.00;
		private int totalDiscounts = 0;
		private double costPerItem = 9.99;
		private int bulkQuantity = 5;
		private double bulkDiscount = 0.05;

		public Item(String name){
			name = name;
		}

		public void registerSale(int n)  {
		
			double salePrice; 

			if (n > bulkQuantity){
				
				salePrice = costPerItem - (costPerItem * bulkDiscount);
				totalDiscounts+=1;

			} else {

				salePrice = costPerItem;

			}

			numSold += n;
			totalSales += n * salePrice;

			System.out.printf("Just sold %d item(s) at %f per item \n",n, salePrice);
		}

		public void displaySales() {


			System.out.println("\nPrinting total sales data for "+name);
			System.out.println("#################################");
			System.out.printf("Total number of items sold :%d\n", numSold);
			System.out.printf("Total sales                :%f\n", totalSales);
			System.out.printf("Total discount             :%d\n\n", totalDiscounts);
			
		}

	}
	
