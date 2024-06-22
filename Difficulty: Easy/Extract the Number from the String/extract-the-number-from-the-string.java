//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        String[] words = sentence.split(" ");
        long output = -1;
        for(String word : words){
            boolean flag = true;
            for(char c: word.toCharArray()){
                if((c-'0')<0 ||  (c-'0')>=9){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                    output = Long.valueOf(word)>output?Long.valueOf(word):output;
            }
        }
        return output;
    }
}