package factory_design_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class IceCream {
	
	protected List<Ingredient> ingredient = new ArrayList<>();
	
	public IceCream() {
		makeIceCream();
	}
	
	protected abstract void makeIceCream();

	@Override
	public String toString() {
		
		return "IceCream" +
				"ingredient = "+ ingredient +
				'}';
	}
	
	
	

}
