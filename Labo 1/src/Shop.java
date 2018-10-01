
import java.util.ArrayList;


public class Shop implements Price{
	private ArrayList<Product> products;
	private ArrayList<Product> shoppingCart;
	private Price pcStrategy;


	public Shop()
	{
		products = new ArrayList<>();
		shoppingCart = new ArrayList<>();
		pcStrategy = new Price();

	}


	public void addProduct(String title, String id, String type) {
		if (type.equals('M')) {
			Movie product = new Movie(title, id);
			this.products.add(product);
		}
		else {
			Game product = new Game(title, id);
			this.products.add(product);
		}
	}
	
	public Product showProduct(String id){
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < this.products.size() && !found; i++) {
			if(this.products.get(i).getId().equals(id)) {
				idx = i;
				found = true;
			}
		}
		if(found)
		{
			return this.products.get(idx);
		}
		return null;
	}

	public double showPrice(String id, String daysString){
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < this.products.size() && !found; i++){
			if(this.products.get(i).getId().equals(id)){
				idx = i;
				found = true;
			}
		}
		if(found){
			int days = Integer.parseInt(daysString);
			return this.products.get(idx).getPrice(days);
		}
	}

	@Override
	public double getPrice(int days) {
		return 0;
	}
}
