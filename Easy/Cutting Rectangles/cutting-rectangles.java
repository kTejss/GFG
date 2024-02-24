//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long B = Long.parseLong(input_line[1]);

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<Long>();
            ans = ob.minimumSquares(L, B);
            System.out.print(ans.get(0)+" ");
            System.out.println(ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        long hcf=-1;
        long l1=L, b1=B;
    
        while(L>0)
        {
            if(L%B==0)
                {
                    hcf=B;
                    break;
                }
                long t=B;
                B=(L%B);
                L=t;
        }
        List<Long> res= new ArrayList<>();
        res.add((l1/hcf)*(b1/hcf));
        res.add(hcf);
        return res;
    }
}