package factory_design_pattern;

public class ChocolateIceCream extends IceCream {
	
	protected void makeIceCream() {
		
		ingredient.add(new Chocolate());
		ingredient.add(new Strawberry());
		
	}

}
