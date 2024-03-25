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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static Boolean three(int n){
       while(n != 0)
       {
           int m = n%10;
           if(m == 3)
           {
               return false;
           }
           n = n/10;
       }
       return true;
   }
    static long count(int N)        
    {
         long count = 0;
       for(int i = 1 ; i <= N ; i++)
       {
           if(three(i))
           {
               count++;
           }
       }
       return count;
    }
}