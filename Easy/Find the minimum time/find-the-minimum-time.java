//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int S1 = Integer.parseInt(arr[0]);
            int S2 = Integer.parseInt(arr[1]);
            int N = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(S1, S2, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // k documents in s1, (n - k) documents in s2
    private static int calculateTime(int s1, int s2, int k, int n) {
        return Math.max(s1 * k, s2 * (n - k));
    }
    
    static int minTime(int s1, int s2, int n)
    {
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n; i++) {
            min = Math.min(min, calculateTime(s1, s2, i, n));
        }
        
        return min;
    }
}