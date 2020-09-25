package recursion;

public class FirstIndex {
	public static int firstIndex(int arr[] , int x , int startIndex) {
		if(startIndex >= arr.length) {
			return -1;
		}
		if(arr[startIndex]==x) {
			return startIndex;
		}
		
		return firstIndex(arr,x,startIndex +1);
	}
	public static int firstIndex(int arr[] , int x) {
		return firstIndex(arr,x,0);
	}
	public static void main(String[] args) {
		int arr[]= {4,5,7,8,10};
		int x=8;
		System.out.println(firstIndex(arr,x));

	}

}
