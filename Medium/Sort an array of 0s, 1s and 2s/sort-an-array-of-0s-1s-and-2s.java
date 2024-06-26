//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
         int zeroes=0;
        int ones=0;
        int tows=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                zeroes++;
            } else if(a[i] == 1) {
                ones++;
            } else {
                tows++;
            }
        }
        for(int j=0; j<a.length;j++){
            if(zeroes !=0){
                a[j] = 0;
                zeroes--;
                continue;
            } else if(ones !=0){
                a[j] = 1;
                ones--;
                continue;
            } else {
                a[j] = 2;
                tows--;
                continue;
            }
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends