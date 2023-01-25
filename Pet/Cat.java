
public class Cat extends Pet{
	
	private int hairLength;
	
	public Cat(String name, int hairLength) {
		super(name);
		this.hairLength = hairLength;
	}
	
	public int getWeight() {
		return hairLength;
	}
	
	public void setWeight(int hairLength) {
		this.hairLength = hairLength;
	}
	
	@Override
	public String toString() {
		return super.toString() + " is a cat, hair length of " + hairLength + " inches.";
	}
	
	//All Abstract Methods of SuperClass Pet Must Be Overridden and Made Concrete
	@Override
	public String move() {
		return "Prance";
	}
	@Override
	public String speak() {
		return "Meow";
	}

}