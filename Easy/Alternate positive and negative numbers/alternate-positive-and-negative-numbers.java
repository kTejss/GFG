//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        int[] positiveIntegers = new int[n];  //9,4,5,0,2
        int positiveCount = 0; //5
        //create an array of negative integers
        int[] negativeIntegers = new int[n]; //-2,-1,-5,-3
        int negativeCount = 0; //4
        
        for(int i: arr)
        {
            if(i>=0)
            {
                positiveIntegers[positiveCount++] = i; 
            }
            else
            {
                negativeIntegers[negativeCount++] = i;
            }
        }
        
        int arrIndex = 0;
        
        int positive = 0;
        int negative = 0;
        
        while(arrIndex<n)
        {
           
            while(positive < positiveCount || negative < negativeCount)
            {
                if(positive !=positiveCount)
                {
                    arr[arrIndex++] = positiveIntegers[positive++];
                }
                
                if(negative !=negativeCount)
                {
                    arr[arrIndex++] = negativeIntegers[negative++];
                }
                 
            } 
        }
    }
}