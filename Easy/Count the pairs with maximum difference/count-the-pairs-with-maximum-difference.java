//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Count obj = new Count();
            System.out.println( obj.countPairs(a,n) );
            
        }
        
	}
}

// } Driver Code Ends


//User function Template for Java


class Count{
    
    public long countPairs(int a[],int n){
         int max=a[0],min=a[0],cmax=0,cmin=0;
        if(n==1)
        return 0;
        
        //calculate max and min
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
            
            if(a[i]<min)
            min=a[i];
        }
          //calculate max and min frequency
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            cmax++;
            
            if(a[i]==min)
            cmin++;
        }
        //return product of max and min frequency as answer
        return cmax*cmin;
    }    
    
}

