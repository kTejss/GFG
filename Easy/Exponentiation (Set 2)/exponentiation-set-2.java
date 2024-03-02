//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            long b = sc.nextLong();

            Solution ob = new Solution();
            System.out.println(ob.power(a, b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long power(int a, long b){
         long MOD = 1000000007;
        long result = 1;
        long base = a;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            b >>= 1;
        }

        return result;
    }
}