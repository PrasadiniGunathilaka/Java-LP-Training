package factory_design_pattern;

public class IceCreamMain {
	
	public static void main(String args[]) {
		
		IceCream aIceCream=IceCreamFactory.makeIceCream(IceCreamCode.VANILLA);
		System.out.println(aIceCream);
		
		IceCream bIceCream=IceCreamFactory.makeIceCream(IceCreamCode.STAWBERRY);
		System.out.println(bIceCream);
	}

}
