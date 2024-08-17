//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long arr[]=new long[nums.length];
        long ans=1;
        int zeros=0;
        for(int i:nums){
            if(i==0)zeros++;
            else ans*=i;
        }
        
        for(int i=0;i<nums.length;i++){
            if(zeros>1)arr[i]=0;
            else if(zeros==1 && nums[i]==0)arr[i]=ans;
            else if(zeros==1 && nums[i]!=0)arr[i]=0;
            else {
                long temp=ans/(long)nums[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
}
