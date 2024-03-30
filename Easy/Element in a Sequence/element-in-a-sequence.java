//{ Driver Code Starts
//Initial Template for Java
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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.NthTermOfSeries(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int NthTermOfSeries(int N){
        if(N==1)
    return 4;
    if(N==2)
    return 7;
    
    int count=1;
    Queue<Integer>x=new LinkedList<Integer>();
    x.add(4);
    x.add(7);
    int four;
    int seven;
    int temp=0;
    while(count<=N)
    {
        temp=x.remove();
        x.add(temp*10+4);
        x.add(temp*10+7);
        count+=1;
    }
    return temp;
    }
}