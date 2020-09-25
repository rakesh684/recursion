package recursion;

public class SumOfArray {
	public static int sum(int arr[],int startIndex) {
		if(startIndex>=arr.length) {
			return 0;
		}
		return arr[startIndex] + sum(arr,startIndex + 1);
	}
	public static int sum(int arr[]) {
		return sum(arr , 0);
	}

	public static void main(String[] args) {
		int arr[]= {4,6,4,2};
		System.out.println(sum(arr));

	}

}
