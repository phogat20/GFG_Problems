//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        
        if (arr == null || arr.length == 0) {
            return -1;
        }
        
         if(k < arr[0]){
            return -1;
        }
        
        int l =0;
        int h = arr.length -1;
       
        while(l<=h){
            int mid = (l+h)/2;
         
            if(k< arr[mid]){
                h = mid -1;
            }else if(k>arr[mid]){
                l = mid +1;
            }else{
                return mid;
            }
        }
        
        return h;
        
    }
}
  
    

//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.findFloor(arr, k);

            System.out.print(ans);

            System.out.println(); // New line after printing the results
        }
    }
}

// } Driver Code Ends