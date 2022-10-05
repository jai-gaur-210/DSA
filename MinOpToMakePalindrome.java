// Java program to find number of operations
// to make an array palindrome

class MinOpToMakePalindrome
{
	// Returns minimum number of count operations
	// required to make arr[] palindrome
	static int findMinOps(int[] arr, int n)
	{
		int count=0;
        int l=0; int h=arr.length-1;
        while(l<=h){
            if(arr[l]==arr[h]){
                l++;h--;
            }
            else if(arr[l]>arr[h]){
                arr[h-1] = arr[h]+arr[h-1];
                h--;
                count++;
            }
            else{
                arr[l+1] = arr[l]+arr[l+1];
                l++;
                count++;
            }
        }
        return count;
	}

	// Driver method to test the above function
	public static void main(String[] args)
	{
		int arr[] = new int[]{11, 14, 15, 99} ;
		System.out.println("Count of minimum operations is "+
								findMinOps(arr, arr.length));
	
	}
}

