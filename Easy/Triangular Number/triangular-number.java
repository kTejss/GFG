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
            int N=Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTriangular(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isTriangular(int N){
        // Starting from the first triangular number
        int triangular = 0;
        int i = 1;
        
        // Generate triangular numbers until we find one greater than or equal to N
        while (triangular < N) {
            triangular += i;
            i++;
        }
        
        // Check if the last generated triangular number is equal to N
        if (triangular == N) 
            return 1;
        else
            return 0;
    }
}