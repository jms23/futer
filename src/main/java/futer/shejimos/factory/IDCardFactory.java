package futer.shejimos.factory;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{
	private List<String> owner = new ArrayList<String>();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCard card = ((IDCard) product);
		owner.add(card.getOwner());
	}

}
