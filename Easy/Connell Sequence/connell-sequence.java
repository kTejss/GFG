//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.connellSequence(n);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> connellSequence(int n){
        int count=1,counter=0,num=1;
       ArrayList<Integer> ar=new ArrayList<Integer>();
       while(1==1){
          for(int i=0; i<count; i++){
              ar.add(num);
              num+=2;
              counter++;
              if(counter==n){
                  return ar;
              }
          }
           num--;
           count++;
       }
    }
}