//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isKaprekar(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isKaprekar(int N) {
        int sqNum=N*N; //square
        for(int i=1;i<((int)(Math.log10(sqNum)+1));i++)//splits in two parts
        {
            int z=(int)Math.pow(10,i);
            
            if(((sqNum%z)+(sqNum/z)==N)&&(sqNum%z!=0))return 1;//if sum of two parts                                                                                                                   //equals nun
        }
        return 0;
    }
}