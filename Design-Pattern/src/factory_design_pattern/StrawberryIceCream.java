package factory_design_pattern;

public class StrawberryIceCream extends IceCream{
	
	protected void makeIceCream() {
		
		ingredient.add(new Chocolate());
		ingredient.add(new Strawberry());
		ingredient.add(new Vanilla());
		
	}

}
