package builder_pattern;

public class CheesePizza {
	
	private final String size;
	private final String sause;
	private final String topping;
	private final int price;
	
	public CheesePizza(Builder builder) {
		this.size=builder.size;
		this.sause=builder.sause;
		this.topping=builder.topping;
		this.price=builder.price;
		
	}
	
	static class Builder{
		
		private String size;
		private String sause;
		private String topping;
		private int price;
		
		
		
		public Builder(String size) {
				this.size=size;
		
		}
		
		public Builder sause(String sause) {
			this.sause=sause;
			return this;
		}
		
		public Builder topping(String topping) {
			this.topping=topping;
			return this;
		}
		
		public Builder price(int price) {
			this.price=price;
			return this;
		}
		
		 public CheesePizza build() {
	            return new CheesePizza(this);
	        }
		
	}

	@Override
	public String toString() {
		return "CheesePizza {size='" + size + '\''+
				",sause=" + sause + 
				", topping='" + topping + '\''+ 
				", price='" + price + '\''+
				'}';
	}
	
	

}
