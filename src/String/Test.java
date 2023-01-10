package String;

import java.util.Arrays;

class Test{
	public static int Solution(int[] arr)
    {
        int n = arr.length;
       
        // If length of array is even
        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = arr[z];
            int q = arr[z - 1];
 
            int ans = (e + q) / 2;
            return ans;
        }
       
        // If length if array is odd
        else
        {
            int z = Math.round(n / 2);
            return arr[z];
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
         
        // TODO Auto-generated method stub
        int[] arr1 = {2,4,5,3,1,6};
        int[] arr2 = {4,5,3};
        int[] arr3 = {5};
 
        int i = arr1.length;
        int j = arr2.length;
        int k = arr3.length;
 
        int[] arr4 = new int[i + j + k];
 
        // Merge two array into one array
        System.arraycopy(arr1, 0, arr4, 0, i);
        System.arraycopy(arr2, 0, arr4, i, j);
        System.arraycopy(arr3, 0, arr4, j, k);
 
        // Sort the merged array
        Arrays.sort(arr4);
 
        // calling the method
        System.out.print("Median = " + Solution(arr4));
    }
}