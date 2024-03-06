//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N =Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenFibSum(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long evenFibSum(long N){
         long N1 = 0;
        long N2 = 1;
        long sum = 0;
        long N3 = 1;
        if(N <2)
        return 0;
        while(N > N3)
        {
            N3 = (N2 + N1) % 1000000007;
            
            if(N>=N3 && N3%2 == 0)
            {
                sum = sum + N3;
            }
            N1 = N2;
            N2 = N3;
            
        }
        return sum ;
    } 
};