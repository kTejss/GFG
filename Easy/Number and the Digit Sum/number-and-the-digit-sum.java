//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
    		System.out.println (new Sol().numberCount (n, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static long numberCount (long N, long K)
    {
        long count=0;
        for(long i=1;i<=N;i++){
            long sum=0;
            long num=i;
            while(num>0){
                 sum=sum+num%10;
                 num/=10;
                
            }
            if((i-sum)>=K)
            count++;
        }
        return count;
    }
}