//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java





class GFG
{
    long uneatenLeaves(long arr[], int n,int k)
    {
      HashSet<Long> hs = new HashSet<>();
        Arrays.sort(arr);
        
        if(arr[0] == 1)
        {
            return 0;
        }
        
        for(long x : arr)
        {
            if(hs.contains(x))
            {
                continue;
            }
            for(long i = x; (int)i<=n; i+= x)
            {
                hs.add(i);
            }
        }
        
        return n - hs.size();
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[k];
            for (int i = 0; i < k; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            GFG ob = new GFG();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans = ob.uneatenLeaves(a,n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends