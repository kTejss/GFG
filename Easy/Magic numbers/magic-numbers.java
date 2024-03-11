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
            
            int[] A = new int[N];
            String S[] = read.readLine().split(" ");
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.getVal(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int gcd(int a , int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
    static Long getVal(int n, int[] arr) {
        int result= arr[0];
        for(int i= 0; i<arr.length; i++){
            result = gcd(result,arr[i]);
        }
        long product=1;
        for(int i=0; i<arr.length; i++){
            product = (product * arr[i]) % 1000000007;
        }
        return (long)Math.pow(product,result);
    }
};