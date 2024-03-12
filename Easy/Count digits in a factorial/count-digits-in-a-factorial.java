//{ Driver Code Starts
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
            System.out.println(ob.facDigits(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int facDigits(int N){
        if (N< 0)return 0;
          if (N <= 1)return 1;
        double d=0.0;
       for(int i=2;i<=N;i++){
           d=d+Math.log10(i);
       }
      d=d+1;
       return (int)d;
    }
}
