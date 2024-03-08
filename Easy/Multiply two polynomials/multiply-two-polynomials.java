//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int M = Integer.parseInt(input[0]); 
            int N = Integer.parseInt(input[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr1[]= new int[M];
            for(int i = 0; i < M; i++)
                Arr1[i] = Integer.parseInt(input_line[i]);
            
            String input_line1[] = read.readLine().trim().split("\\s+");
            int Arr2[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr2[i] = Integer.parseInt(input_line1[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.polyMultiply(Arr1,Arr2,M,N);
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
    public int[] polyMultiply(int Arr1[], int Arr2[], int M, int N)
    {
        if((M+N-1) == 0){
            int[] ans2 =new int[1];
            ans2[0] = Arr1[0]*Arr2[0];
            return ans2;
        }
        int[] ans =new int[(M+N-1)];
        
            for(int j = 0; j<(M+N-1); j++){
               ans[j] = 0;
            }
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
               ans [i+j]+=Arr1[i]*Arr2[j];
            }
        }
        return ans;
    }
}