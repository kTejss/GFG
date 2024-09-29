//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    int totalCount(int k, int[] arr) {
         int n= arr.length;
        int newArr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            int num;
            if((arr[i] % k) == 0){
                num =  (arr[i] / k);
                newArr[i] = num;
            }
            else{
                num =  (arr[i] / k);
                newArr[i] = num + 1;
            }
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += newArr[i];
        }
        return sum;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.totalCount(k, arr);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends