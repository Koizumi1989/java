package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 ÷ 0 ?");
			int result = 100 / 0;
			System.out.println("Calculation result");
		} catch (ArithmeticException e) {
			System.out.println("Exception occurs");
		} finally {
			System.out.println("the end of the program");
		}
	}
}
