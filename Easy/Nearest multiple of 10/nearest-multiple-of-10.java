//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


            

class Solution{
    
  
    String roundToNearest(String NN)
    {
        // Complete the function
        StringBuilder N=new StringBuilder(NN);
        int check=NN.charAt(N.length()-1)-'0';
        int rem=10-check;
        StringBuilder str1=new StringBuilder(N.substring(0,N.length()-1).toString());
        // str1=N.substring(0,N.length()-1);
        str1.append(0);
        StringBuilder str2=new StringBuilder();
        for(int i=N.length()-1;i>=0;i--){
            int num=NN.charAt(i)-'0';
            num=num+rem;
            rem=num/10;
            num=num%10;
            str2.insert(0,num);
        }
        if(rem!=0)
        str2.insert(0,rem);
        if(check<=5)
        return str1.toString();
        return str2.toString();
        
    }
  
    
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine().trim();
		    
		    Solution obj = new Solution();
		    
		    String res = obj.roundToNearest(line1);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


// } Driver Code Ends