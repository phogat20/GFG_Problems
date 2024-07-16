//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.solve(a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int solve(int bt[] ) {
    // code here
    Arrays.sort(bt);
    int waitingTime = 0;
    int time =0;    
    //12347
        for(int i =0; i<bt.length; i++){
          // Time taken by the process to get complete 
          // 1+2 +3 +4+7 =17
            time = time+bt[i];
            //waiting time for the process
            //that is diff between both the process
            //1-1 = 0;
            //3-2 =1;
            //6-3 =3;
            //10-4 = 6;
            //17-7=10; => 20
             waitingTime += (time-bt[i]);
        }
    
    return waitingTime/bt.length;
  }
}
     