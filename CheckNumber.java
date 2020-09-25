package recursion;

public class CheckNumber {
	public static int numberOfDigit(int N) {
		if(N/10 == 0) {
			return 1;
		}
		return 1 + numberOfDigit(N/10);
	}

	public static void main(String[] args) {
		int N =234;
		System.out.println(numberOfDigit(N));

	}

}
