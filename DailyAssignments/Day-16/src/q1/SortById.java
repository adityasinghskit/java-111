package q1;

import java.util.Comparator;

public class SortById implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProductId()>p2.getProductId()) {
			return 1;
		}else if(p1.getProductId()<p2.getProductId()) {
			return -1;
		}else {
			return 0;
		}
	}

	
	
}
