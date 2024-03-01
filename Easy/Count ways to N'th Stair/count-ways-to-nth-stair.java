//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking total number of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method of class countWays()
		    //of class DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}

// } Driver Code Ends



class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
    Long countWays(int m)
    {
        long[]dp=new long[m+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=m;i++)
        {
            dp[i]=1+dp[i-2];
        }
        return dp[m];
    }    
}
