//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.prodTwoDigit(N));
        }
    }
}
// } Driver Code Ends




class Solution {
    static long prodTwoDigit(long N) {
          if(N==0){
            return 0;
        }
        long ans=1;
        long mod=1000000000+7;
        while(N!=0){
            long k=N%100;
            N/=100;
            ans=ans*k;
            ans=ans%mod;
        }
        return ans;
    }
};