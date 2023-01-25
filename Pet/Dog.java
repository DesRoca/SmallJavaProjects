
public class Dog extends Pet implements Comparable<Dog>{
	
	private int weight;
	
	public Dog(String name, int weight) {
		super(name);
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return super.toString() + " is a dog, weighing " + weight + " pounds.";
	}
	
	//All Abstract Methods of SuperClass Pet Must Be Overridden and Made Concrete
	@Override
	public String move() {
		return "Run";
	}
	@Override
	public String speak() {
		return "Woof";
	}
	
	@Override 
	public int compareTo(Dog other) {
		if(weight == other.getWeight())
			return 0;
		else if(weight < other.getWeight())
			return -1; //can return any negative number 
		else 
			return 1; //can return any positive number
	}

}
