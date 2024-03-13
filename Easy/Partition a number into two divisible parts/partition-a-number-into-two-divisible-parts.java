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
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String stringPartition(String S, int a, int b){
        String ans=find(S,a,b,1);
       return ans;
   }
   static String find(String S,int a,int b,int p){
       if(p==S.length()){
           return "-1";
       }
       StringBuilder sb=new StringBuilder(S);
       String s1=sb.substring(0,p);
       String s2=sb.substring(p,S.length());
       int n1=Integer.parseInt(s1);
       int n2=Integer.parseInt(s2);
       if(n1%a==0 && n2%b==0){
           StringBuilder res=new StringBuilder(s1);
           res.append(" ");
           res.append(s2);
           return String.valueOf(res);
       }
       return find(S,a,b,p+1);
    }
}