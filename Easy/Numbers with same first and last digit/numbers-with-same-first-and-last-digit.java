//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int L=Integer.parseInt(inp[0]);
            int R=Integer.parseInt(inp[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numbersInRange(L,R));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int numbersInRange(int L, int R){
        int count = 0;
        for(int i = L; i <= R; i++){
            if(isSame(i))
                count++;
        }   
        return count;
    }
    static boolean isSame(int num){
        int temp = num;
        int count = 0;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        if(num % 10 == num / (int) Math.pow(10, count - 1))
            return true;
        return false;
    }
}