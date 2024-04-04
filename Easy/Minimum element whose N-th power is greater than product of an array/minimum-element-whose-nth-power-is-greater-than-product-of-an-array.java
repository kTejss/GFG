//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = sc.nextInt();
		    }
		    
		    Solution obj = new Solution();
		    
		    int v = obj.findMin(arr,n);
            System.out.println(v);
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    
    public int findMin(int a[], int n) 
    { 
        double log_sum = 0;
        int min = 0;
        
        for(int x : a){
            log_sum += Math.log(x);
        }
        
        log_sum = log_sum / n;
        
        min = (int) Math.pow(Math.E, log_sum);
        
        return min + 1;
    } 
     
}

