//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node ptr=head;
          Node p=null,h1=null;
          int c1=0,c2=0;
        while(ptr!=null){
            if(ptr.data==0){
              Node n = new Node(ptr.data);
              if(p==null) {
                  p=n;
                  h1=p;
              }else{
                  p.next=n;
                  p=n;
              }
               
            }
            // if(ptr.data==1){
            //   c1++; 
            // }
            ptr=ptr.next;
        }
     ptr=head;
         while(ptr!=null){
          if(ptr.data==1){
              Node n = new Node(ptr.data);
              if(p==null) {
                  p=n;
                  h1=p;
              }else{
                  p.next=n;
                  p=n;
              }
               
            }
             ptr=ptr.next;
        }
     ptr=head;
        while(ptr!=null){
          if(ptr.data==2){
              Node n = new Node(ptr.data);
              if(p==null) {
                  p=n;
                  h1=p;
              }else{
                  p.next=n;
                  p=n;
              }
               
            }
             ptr=ptr.next;
        }
      return h1;
    }
}


