package recursion;

public class LastIndex {
	public static int lastIndex(int arr[],int x,int startIndex) {
		if(startIndex >= arr.length) {
			return -1;
		}
		
		int  ans=lastIndex(arr,x,startIndex+1);
        if(ans != -1){
            return ans;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        else{
            return -1;
        }
	}
	public static int lastIndex(int arr[],int x) {
		return lastIndex(arr,x,0);
	}
	public static void main(String[] args) {
		int arr[]= {4,5,7,8,10,8,9,6};
		int x=8;
		System.out.println(lastIndex(arr,x));

	}

}
