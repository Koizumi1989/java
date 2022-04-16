
public class Chapter07 {
	public static void main(String[] args) {
		int distance = 10;
		if (distance <= 5) {
			System.out.println("it is very close");
		} else if (distance <= 10) {
			System.out.println("near");
		} else if (distance <= 15) {
			System.out.println("far");
		} else {
			System.out.println("very far");
		}
	}
}
