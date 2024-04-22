
public abstract class Animal {

	String name;
	
	
	public Animal(String name) {
		this.name = name;
		}
	
	abstract void sound();
	
	void eat() {
		System.out.println(name + "is eating");
	}
	
	
	
}
