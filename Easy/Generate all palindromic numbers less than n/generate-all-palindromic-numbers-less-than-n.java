//{ Driver Code Starts
//Initial Template for Java//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int ans  = ob.palindromicNumbers(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    static boolean tocheck(int n){

        if(n>=1 && n<=9){

            return true;

        }

        int tem = n;

        int rev=0;

              while(tem>0){

                int digit = tem%10;

                rev=rev*10+digit;

                tem=tem/10;

            }

        if(n==rev){

            return true;

        }

        return false;

    }

    static int palindromicNumbers(int N){

        int count=0;

        for(int i =1; i<N; i++){

          boolean ans=  tocheck(i);

          if(ans==true){

              count++;

 }

        }

        return count;

    }

}