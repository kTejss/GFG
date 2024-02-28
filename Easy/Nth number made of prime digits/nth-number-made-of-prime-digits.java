//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  Solution ob = new Solution();
		  System.out.println(ob.primeDigits(n));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find nth number made of only prime digits.
    public static int primeDigits(int n)
    {
        ArrayList<Integer> primes = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
       
       ArrayDeque<Integer> q = new ArrayDeque<>();
       
       int rank = 0;
       q.push(0);
       
       while(!q.isEmpty()){
           
           int curr = q.removeLast();
           
           for(int val : primes){
               q.push(curr * 10 + val);
               
               rank++;
               
               if(rank == n){
                   return curr * 10 + val;
               }
           }
       }
       
       return 0;
    }
}