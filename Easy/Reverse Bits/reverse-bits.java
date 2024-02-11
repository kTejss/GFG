//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static boolean setbit(int i,long n) {
        if(((1L<<(i-1)&n))!=0)
        {
            return true;
        }
        return false;
    }
    static Long reversedBits(Long X) {
        // code here
         long ans=0L;
        for(int i=0;i<=32;i++)
        {
            if(setbit(i,X))
            {
                ans |=1L<<(32-i);
            }
        }
        return ans;
    }
};