
public class PetTester {

	public static void main(String[] args) {
		
		Pet[] pets = new Pet[3];
		
		pets[0] = new Dog("Rascal", 13);
		pets[1] = new Snake("Nagini", 120);
		pets[2] = new Cat("Milo", 2);
		
		for(int i=0; i<pets.length; i++) {
		System.out.println(pets[i]);
		System.out.println(pets[i].getName() + " says " + pets[i].speak());
		System.out.println(pets[i].move() + " " + pets[i].getName() + " " + pets[i].move());
		
		}
	}

}
