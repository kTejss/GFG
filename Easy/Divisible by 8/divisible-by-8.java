//{ Driver Code Starts
//Initial Template for Java

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
            String s = read.readLine().trim();
            Solution ob = new Solution();
            if(ob.isDivisible8(s) == 1)
            System.out.println("Divisible");
            else
            System.out.println("Not Divisible");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int isDivisible8(String S){
        if(S.length()==1){
            int num = S.charAt(0) - '0';
            return num%8 == 0? 1:0;
        }
        
        if(S.length()==2){
            int num1 = (S.charAt(0) - '0')*10 + (S.charAt(1) - '0');
            int num2 = (S.charAt(1) - '0')*10 + (S.charAt(0) - '0');
            
            return num1%8 == 0 || num2%8 == 0 ? 1:0;
        }
        
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length();j++){
                for(int k=0; k<S.length();k++){
                    if(i!=j && j!=k && k!=i){
                        int num3 = (S.charAt(i)-'0')*100 +
                                        (S.charAt(j) - '0')*10 +
                                            (S.charAt(k) - '0');
                        if(num3 % 8 ==0)
                            return 1;
                    } 
                }
            }
        }
        
        return 0;
    }
}