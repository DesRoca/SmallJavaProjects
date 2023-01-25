
public abstract class Pet {
	
	private String name;
	
	protected Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pet " + name;
	}
	
	//Abstract Methods
	public abstract String speak();
	
	public abstract String move();

}
