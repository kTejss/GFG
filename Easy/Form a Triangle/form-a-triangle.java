//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.noOfTriangles(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static int noOfTriangles(int nums[], int arr)
    {
Arrays.sort(nums);
        int count=0;
        
        for(int i=nums.length-1;i>=2;i--)
        {
           int left=0;
            int right=i-1;
            
            while(left<right)
            {
                if(nums[left]+nums[right]>nums[i])
                {
                    count+=(right-left);
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
                                        
        return count;
    }
}