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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int compare(String a, String b)
    {
        int k=0;
        int count=0;
        while(k<a.length() && k<b.length())
        {
            if(a.charAt(k)==b.charAt(k))
                count++;
            else
                return count;
            k++;
        }
        return count;
    }
    String longestCommonPrefix(String arr[], int n){
        if(n==1)
            return arr[0];
            
        String a="";
        int count=0,ans=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            count=compare(arr[0],arr[i+1]);
            if(count==0)
                return "-1";
            
            if(count<ans)
                ans=count;
        }
        for(int i=0;i<ans;i++)
        {
            a+=arr[0].charAt(i);
        }
        return a;
    }
}