//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line[0]);
            int Y = Integer.parseInt(input_line[1]);
            int Z = Integer.parseInt(input_line[2]);

            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.goals(X, Y, Z);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}

// } Driver Code Ends


// User function Template for java

class Solution{
    static List<Integer> goals(int X, int Y, int Z)
    {
         List<Integer> al=new ArrayList<>();

        int xc=0; //xcount

        int yc=0; //ycount

        while(Z!=1)

        {

            if(X%Z==0)

            {

                X--;

                xc++;

            }

            else if(Y%Z==0)

            {

                Y--;

                yc++;

            }

            else

            {

                Z--;

            }

        }

        al.add(xc);

        al.add(yc);

        return al;
    }
}