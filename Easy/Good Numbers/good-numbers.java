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
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int D = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.goodNumbers(L, R, D);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> goodNumbers(int L, int R, int D) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = L; i <= R; i++) {
            if(isGoodNumber(i, D)) {
                result.add(i);
            }
        }
        return result;
    }
    boolean isGoodNumber(int num, int d) {
        int digit = num % 10;
        int sum = digit;
        if(digit == d) return false;
        num /= 10;
        while(num > 0) {
            digit = num % 10;
            if(digit == d || digit <= sum) return false;
            else {
                sum += digit;
                num /= 10;
            }
        }
        return true;
    }
}