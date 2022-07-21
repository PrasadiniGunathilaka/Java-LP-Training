package factory_design_pattern;

public class VanillaIceCream extends IceCream{
	
	protected void makeIceCream() {
		
		ingredient.add(new Vanilla());

	}

}
