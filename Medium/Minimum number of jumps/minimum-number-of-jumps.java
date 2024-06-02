//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        int N = arr.length;
        if(N==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int count = 0;
        int After_Jump = 0;
        int current = 0;
        
        for(int i=0; i<N; i++){
            After_Jump = Math.max(After_Jump, i+arr[i]);
            if(i == current){
                current = After_Jump;
                count++;
                if(After_Jump >= N-1){
                    return count;
                }
            }
            
        }
         return -1;
    }
}