//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    static class Data{
        int startTime;
        int endTime;

        
        Data(int startTime, int endTime){
            this.startTime=startTime;
            this.endTime=endTime;
        }
    }
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        // Comparator<Data> com = new Comparator<>(){
        //     @Override
        //     public int compare(Data a, Data b){
        //         return a.endTime - b.endTime;
        //     }
        // }
        if(n<=0){
            return 0;
        }
        
        ArrayList<Data> list = new ArrayList<>();
      // add activity to the list
        for(int i =0; i<n; i++){
            list.add(new Data(start[i],end[i]));
        }
        // sort based on end time 
        Collections.sort(list,(n1,n2)->Integer.compare(n1.endTime,n2.endTime));
        // first acitivty will be performed in any case
        int activityCount =1;
        //and now check with previous actitivty 
        // 1st activity end will be stored
        int previousActivity = list.get(0).endTime;
        
        for(int i =1; i<n; i++){
            if(list.get(i).startTime>previousActivity){
                activityCount++;
                previousActivity = list.get(i).endTime;
            }
        }
        return activityCount;
    }
    
    // class sortByActivity implements Comparator<Data>{
    //     public int compare(Data a, Data b){
    //         return a.endTime - b.startTime;
    //     }
    // }
}
