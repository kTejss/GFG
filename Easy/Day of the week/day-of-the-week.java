//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int d = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int y = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.getDayOfWeek(d,m,y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String getDayOfWeek(int d, int mo, int y) {
        if(mo<3)
        {
            mo+=12;
            y--;
        }
        int q = d;
        int m = mo;
        int K = y % 100;
        int J = y / 100;
        int h = (q + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
        
        String day[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        String ans=day[h];
        return ans;
    }
};