//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.divisible_by_four(s);
            System.out.println(ans);            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public int divisible_by_four(String s)
    {
         if(s.length()==1){
            int x=Integer.valueOf(s);
            return x%4==0?1:0;
        }
        
        int n=s.length();
        ArrayList<String> l=new ArrayList<>();
        l.add("00");
        for(int i=12;i<100;i+=4){
            l.add(i+"");
        }
        
        for(int i=0;i<l.size();i++){
            String a=l.get(i).substring(0,1);
            String b=l.get(i).substring(1);
            if(a.equals(b)){
                int count=0;
                for(int j=0;j<n;j++){
                    if(s.substring(j,j+1).equals(a)) 
                       count++;
                }
                if(count>1)
                   return 1;
            }
            else if(s.contains(a) && s.contains(b))
               return 1;
        }
        
        
        return 0;
    }
}