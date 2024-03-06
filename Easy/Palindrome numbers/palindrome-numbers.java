//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Long t = Long.parseLong(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPallindrome(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long isPallindrome(long N){
        String s="";
        while(N>0){
            if(N%2==0){
                s="0"+s;
            }else{
                s="1"+s;
            }
            N=N/2;
        }
        char ch;
        String str="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            str=ch+str;
        }
        if(str.equals(s)){
            return 1;
        }else{
            return 0;
        }
    }
}