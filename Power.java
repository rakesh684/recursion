package recursion;

public class Power {
	public static int power(int n,int x) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		int ans = power(n-1,x);
		return x*ans;
	}
}
