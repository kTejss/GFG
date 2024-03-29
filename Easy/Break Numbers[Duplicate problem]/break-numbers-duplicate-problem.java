//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            long N = Long.parseLong(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long countWays(long N){
         return (N*(N+1))/2+(N+1);
    }
}