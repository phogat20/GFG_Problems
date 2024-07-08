//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends

//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
       if(N==1) return 0; 
       int prev2 = 0;
       int prev1 = Math.abs(arr[0]-arr[1]); // 10
       
       for(int i =2; i<N; i++){
        int curr = Math.min(prev1+ Math.abs(arr[i] - arr[i-1]), prev2+Math.abs(arr[i] -arr[i-2]));
        prev2=prev1;
        prev1=curr;
        }
        
        return prev1;
    }
    
    
}