//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String N = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.solve(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String solve(String N) 
    { 
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : N.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder(""); 
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> get : map.entrySet()){
            if(max <= get.getValue()){
                sb.delete(0,sb.length());
                max = get.getValue();
                sb.append(get.getKey());
            }
        }
        return sb.toString();
    }
} 