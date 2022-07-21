package factory_design_pattern;

public class IceCreamFactory {
	
	public static IceCream makeIceCream(IceCreamCode iceCreamCode) {
		
		switch (iceCreamCode) {
		
		case VANILLA:
			return new VanillaIceCream();
			
		case STAWBERRY:
			return new StrawberryIceCream();
			
		case CHOCOLATE:
			return new ChocolateIceCream();
			
		default :
			return null;
		}
	}

}
