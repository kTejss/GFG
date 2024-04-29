//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line[0]);
            int Y = Integer.parseInt(input_line[1]);
            int Z = Integer.parseInt(input_line[2]);
            int N = Integer.parseInt(input_line[3]);

            Solution ob = new Solution();
            System.out.println(ob.minNumber(X, Y, Z, N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static long LCM(long x, long y) {
        if(x == 0) {
            return y;
        }
        return LCM(y%x, x);
    }
    static long minNumber(int X, int Y, int Z, int N)
    {
        long lcm1 = (X/LCM(X,Y)) * Y;
        long lcm2 = (lcm1/LCM(lcm1, Z)) * Z;
        
        long smallest = 1, greatest;
        for(int i=0;i<N-1;i++) {
            smallest *= 10;
        }
        
        greatest = smallest*10-1;
        
        if(lcm2 >= smallest && lcm2 <= greatest) {
            return lcm2;
            
        } else if(lcm2 > greatest) {
            return -1;
            
        } else if(smallest%lcm2 == 0) {
            return smallest;
        }
        
        long div = (smallest/lcm2);
        return lcm2*(div+1);
    }
}