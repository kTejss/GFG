//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int fib(int N){
        if(N==0){
            return 0;
        }
        long a=0l;
        long b=1l;
        for(int i=0;i<N;i++){
            long c=(a+b)%10;
            a=b;
            b=c;
        }
        
        return (int)a%10;
    }
}

//{ Driver Code Starts.
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
            System.out.println(ob.fib(N));
        }
    }
}
// } Driver Code Ends