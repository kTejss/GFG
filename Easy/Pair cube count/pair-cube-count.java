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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.pairCubeCount(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int pairCubeCount(int N) {
         int count =0;
        for(int i =0; i<32; i++){
            for(int j = 1; j<32; j++){
                if((int)Math.pow(i,3)+(int)Math.pow(j,3)==N){
                    count++;
                }
            }
        }
        return count;
    }
};