//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int n=mat.length;
int[] in= new int[n];
int[] out= new int[n];
Arrays.fill(in,0);
Arrays.fill(out,0);

for(int i=0;i<n;i++)
{
        for(int j=0;j<n;j++)
        {
             if(mat[i][j]==1)
             {
                 in[i]++;
                 out[j]++;
             }
       }
}
        
for(int i=0;i<n;i++)
   if(in[i]==0&&out[i]==n-1)
   return i;

return -1;
    }
}