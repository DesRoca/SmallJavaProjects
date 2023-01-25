
public class Snake extends Pet{
	private int length;
	
	public Snake(String name, int length) {
		super(name);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " is a snake, measuring " + length + " inches long";
	}
	
	@Override
	public String move() {
		return "Slither";
	}
	@Override
	public String speak() {
		return "Hiss";
	}
}
