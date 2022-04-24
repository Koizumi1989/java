package practice;

public interface Flying {

	void fly();
	
	default void powerOff() {
		System.out.println("If you are flying, it will fall");
	}
}
