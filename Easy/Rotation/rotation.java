//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        int left=0;
        int right=n-1;
        
        while(left<=right){
            if(arr[left]<arr[right]){
                return left;
            }
            int mid=(left+right)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            
           if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                return mid;
            }
            else if(arr[mid]<arr[right]){
                right=mid-1;
            }
            else if(arr[mid]>=arr[left]){
                left=mid+1;
            }
        }
        return 0;
    }
}