//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String St[] = read.readLine().split(" ");
            
            Long R = Long.parseLong(St[0]);
            Long S = Long.parseLong(St[1]);
            Long Q = Long.parseLong(St[2]);

            Solution ob = new Solution();
            System.out.println(ob.noOfDays(R,S,Q));
        }
    }
}
// } Driver Code Ends




class Solution {
    static Long noOfDays(Long R, Long S, Long Q) {
       return (long)Math.ceil(1.0 * (Q-S) / (R-S)); 
    }
};