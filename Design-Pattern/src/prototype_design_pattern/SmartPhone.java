package prototype_design_pattern;

public class SmartPhone extends Phone{
	private String memoryCapacity;

	public String getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(String memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	@Override
	public String toString() {
		return "SmartPhone{"+
				"memoryCapacity='" + memoryCapacity + '\'' +
				'}';
	}
	
	
	
	

}
