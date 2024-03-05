//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int l = Integer.parseInt(input[0]); 
            int r = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.sumOfAll(l,r));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public boolean[] getPrimes(int num){
        
        boolean[] isPrime = new boolean[num+1];
        for (int i = 0; i <= num ;i++){
            isPrime[i] = true;
        }
        
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= num ; i ++){
            for (int j = 2 * i; j <= num ; j += i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    
    
    public int sumOfAll(int l, int r)
    {
        // code here
        
        boolean[] isPrime = getPrimes(r);
        // for (int i = 0; i <= r ;i++){
        //     System.out.println(i+" "+isPrime[i]);
        // }
        
        int sum = 0;
        for (int i = l; i <= r ;i++){
            int tempSum = 0;
            for (int j = 1; j <= i ;j++){
                if (isPrime[j] && i % j == 0){
                    tempSum += j;
                }
            }
            sum += tempSum;
        }        
        
        return sum;
    }
}