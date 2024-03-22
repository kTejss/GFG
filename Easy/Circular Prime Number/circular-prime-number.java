//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int n = Integer.parseInt(S[0]);
            Solution ob = new Solution();
            int ans = ob.isCircularPrime(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int isCircularPrime(int n)
    {
         int len = String.valueOf(n).length();
       int zero = 1;
       
       for(int i=0;i<len-1;i++){
           zero *=10;
       }
       
       for(int i=0;i<len;i++){
           
        int temp = n%10;
        n=n/10;
        temp = temp * zero;
        temp +=n;
        n = temp;
        
        if(!isPrime(n))
        return 0;
        
           
           
       }
        return 1;
    }
    
    static boolean isPrime(int check){

        if(check<2)
            return false;

        if(check==2|| check==3|| check==5)
            return true;

        for(int i=2;i<=Math.sqrt(check);i++){
            if(check%i==0)
                return false;
        }

        return true;
    }
}