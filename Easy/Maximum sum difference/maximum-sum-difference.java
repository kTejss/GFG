//{ Driver Code Starts


// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.maxSum(N));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution{
    static int maxSum(int N){
        if(N == 1) return 1;
        return N*(N+1)/2 + N/2 - (N+1);
    }
}