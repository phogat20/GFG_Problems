//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    // static class Train{
    //     int arr;
    //     int dep;
    
    // Train(int arr,int dep){
    //     this.arr=arr;
    //     this.dep=dep;
    // }
    // }
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        if(n<=0){
            return 0;
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0; int j=0;
        int count =0, maxCount =0;
        
        while(i<n){
           if(arr[i]<=dep[j]){
               count++;
               i++;
           }else{
                count--;
                j++;
           }
           maxCount = Math.max(count,maxCount);
        }
        
        
        
        return maxCount;
        
    }
    
}

