//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
       if(str1.length()!=str2.length()) return false;
        HashMap<Character,Character> hmap = new HashMap<>();
        char val;
        for(int i=0;i<str1.length();i++){
            if(!hmap.containsKey(str1.charAt(i))){
                if(hmap.containsValue(str2.charAt(i))) return false;
                hmap.put(str1.charAt(i),str2.charAt(i));
            }else{
                val=hmap.get(str1.charAt(i));
                if(val!=str2.charAt(i)) return false;
            }
        }
        return true;
        
    }
}