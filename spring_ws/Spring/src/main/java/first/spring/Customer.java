package first.spring;

import java.util.Map;

public class Customer {
	private int id;
	private Map<Integer, String> product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getProduct() {
		return product;
	}

	public void setProduct(Map<Integer, String> product) {
		this.product = product;
	}

}
