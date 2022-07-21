package prototype_design_pattern;

public class CellPhone extends Phone {
	
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "CellPhone{" +
				"[size='" + size + '\''+
				'}';
	}
	
	
}
