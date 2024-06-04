//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
         int ele=0;
        int count =0;
        
        for(int i=0; i<size;i++){
            
            if(count==0){
                ele=a[i];
                count++;
            }
            
            else if(a[i]==ele){
                count++;
            }
           
            else{
                count--;
            }
        }
        
        // count the occurence of the max_element
        int cnt=0;
        for(int i=0; i<size; i++){
            if(a[i]==ele) cnt++;
        }
        
        // verify if it is greater than the size/2
        if(cnt > size/2){
        return ele;
        }
        else{
            return -1;
        }
    }
}