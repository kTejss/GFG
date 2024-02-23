//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.makeProductOne(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int makeProductOne(int[] arr, int N) {
        int count = 0;
        int negCount = 0; 
        ArrayList<Integer>ll=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                count++; 
                ll.add(0);
            } else if (arr[i] < 0) {
               
                count += -1 - arr[i]; 
                negCount++; 
            } else {
                count += arr[i] - 1; 
            }
        }
        

        if (negCount % 2 != 0) {
            
            if(ll.contains(0))
            {
                return count;
            }
            else{
                count+=2;
            }
          
        }
        
        return count;
    }
}