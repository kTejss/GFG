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
            int L = Integer.parseInt(input[0]); 
            int R = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            int[] ans = ob.sixyPrime(L,R);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] sixyPrime(int L, int R)
    {
        List<Integer> res=new ArrayList<>();
        int i=L, j=L+1;
        
        while(j<=R && i<R){
            while(!isPrime(i))
                i++;
            while(!isPrime(j))
                j++;
            if(j-i==6 && i<R && j<=R){
                res.add(i);
                res.add(j);
                i++;
                j++;
            }
            else if(j-i<6)
                j++;
            else
                i++;
        }
        //System.out.println(res);
        if(res.isEmpty())
            res.add(-1);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
 
        if (n == 2 || n == 3)
            return true;
 
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
        return true;
    }
}