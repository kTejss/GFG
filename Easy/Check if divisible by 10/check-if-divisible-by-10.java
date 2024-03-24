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
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.isDivisibleBy10(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDivisibleBy10(String bin) {
        int total = 0;
        if(bin.length() == 1 && bin.charAt(0) == '0') return 1;
        if(bin.charAt(bin.length()-1) == '1') return 0;
        int ind = 0;
        for(int i = bin.length()-2; i >= 0; i--) {
            if(bin.charAt(i) == '1') {
                if(ind % 4 == 0) {
                    total += 2;
                }else if(ind % 4 == 1) {
                    total += 4;
                }else if(ind % 4 == 2) {
                    total += 8;
                }else if(ind % 4 == 3) {
                    total += 6;
                }
                // total %= 10;
            }
            ind++;
        }
        if(total%10 == 0) return 1;
        return 0;
    }
}