
public interface Vehicle {
	
	void drive();
	
	default void stop() {
		System.out.println("Vehicle is Stopped");
	}

}
