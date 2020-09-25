package recursion;

public class CheckNumer {
	public static boolean checkNumber(int arr[],int x,int startIndex) {
		if(startIndex >= arr.length) {
			return false;
		}
		if(arr[startIndex]==x) {
			return true;
		}
		
		boolean smallAns = checkNumber(arr , x ,startIndex + 1);
		return smallAns;
	}
	public static boolean checkNumber(int arr[] ,int x) {
		return checkNumber(arr , x , 0);
	}

	public static void main(String[] args) {
		int arr[]= {4,5,7,8,10};
		int x=3;
		System.out.println(checkNumber(arr,x));
		
	}

}
