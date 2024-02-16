//{ Driver Code Starts


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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
   public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=(int)Math.floor(Math.sqrt(n)); i++){
            if(n % i == 0) return false;
        } 
        return true;
    }
    public int[] AllPrimeFactors(int N)
    {
        // code here

        if(isPrime(N)) return new int[] {N};
        int n = (int) Math.floor(Math.sqrt(N));
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=2; i<=n ;i++){
            if(N % i==0){
                if(isPrime(i)) ans.add(i);
                if(N/i != i && isPrime(N/i)) ans.add(N/i);
            }
        }
        
        int[] a = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            a[i] = ans.get(i);
        }
        return a;
    }
}