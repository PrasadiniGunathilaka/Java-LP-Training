package builder_pattern;

public class Appication {
	
	public static void main(String args[]) {
		
		CheesePizza.Builder builder = new CheesePizza.Builder("Large");
		
		CheesePizza cheesePizza = builder.sause("tomato").topping("sausages").price(1990).build();
		System.out.println(cheesePizza);
	}

}
