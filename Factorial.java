package recursion;
import java.util.Scanner;
public class Factorial {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		int smallAns=factorial(n-1);
		return n*smallAns;
	}
	
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));
	}

}
