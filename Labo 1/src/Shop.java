
import java.util.ArrayList;


public class Shop {
	private ArrayList<Product> products;

	public Shop() {
		products = new ArrayList<>();
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
	
	public Product getProduct(String id){
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < this.products.size() && !found; i++) {
			if(this.products.get(i).getId().equals(id)) {
				idx = i;
				found = true;
			}
		}
		if(found) {
			return this.products.get(idx);
		}
		return null;
	}

	public double getPrice(String id, int days){
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < this.products.size() && !found; i++){
			if(this.products.get(i).getId().equals(id)){
				idx = i;
				found = true;
			}
		}
		if(found){
			return this.products.get(idx).getPrice(days);
		}
		else{
		    throw new IllegalArgumentException("This product is not in the shop.");
        }
	}

}
