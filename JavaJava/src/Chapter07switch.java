
public class Chapter07switch {
	public static void main(String[] args) {
		String color = "black";
		switch (color) {
		case "red":
			System.out.println("It is a red signal");
			break;
		case "yellow":
			System.out.println("It is a yellow signal");
			break;
		case "blue":
			System.out.println("It is a blue signal");
			break;
			default:
				System.out.println("It is not the color of the signal");
		}
	}
}
