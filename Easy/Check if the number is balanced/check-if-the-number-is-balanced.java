//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        int lsum=0;
        int rsum=0;
        int left=0;
        int right=N.length()-1;
        int mid=left+(right-left)/2;
        for(int i=0;i<mid;i++){
            lsum+=N.charAt(i);
            left++;
        }
        for(int i=mid+1;i<=right;i++){
            rsum+=N.charAt(i);

        }
        if(lsum==rsum){
            return true;
        }
        return false;      
    }
}