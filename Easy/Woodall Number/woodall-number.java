//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.isWoodall(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isWoodall(int n){
        
       int p = (int)Math.sqrt(n);
       for(int i=1;i<=p;i++)
       {
           int ans = (i*(int)Math.pow(2,i))-1;
           if(ans==n)
           {
               return 1;
           }
       }
       return 0;
    }
}