package prototype_design_pattern;

public abstract class Phone implements Cloneable {
	
	private String model;
	private String simType;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	
	@Override
	public String toString() {
		return "Phone{" +
				"model=" +model +
				", simType= '" + simType + '\'' +
				'}';
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	

}
