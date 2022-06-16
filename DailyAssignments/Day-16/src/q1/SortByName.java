package q1;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getProductName().compareTo(p2.getProductName());

}
}
