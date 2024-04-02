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
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.saveKnights(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long saveKnights(int n) {
         if(n==1){
            return 1;
        }
        if(n==2){
            return 4;
        }
        long m=(long)n;
        return (long)Math.ceil((m*m)/(double)2);
    }
};