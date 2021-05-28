import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class justStall {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numCows = Integer.parseInt(in.readLine());
        String[] cowArray = in.readLine().split(" "), stallArray = in.readLine().split(" ");
        ArrayList<Integer> cowHeights = new ArrayList<>();
        ArrayList<Integer> stallHeights = new ArrayList<>();

        boolean[] finishedCows = new boolean[numCows];
        for(int x=0;x<cowArray.length;x+=1)
        {
            int cowVal = Integer.parseInt(cowArray[x]);
            cowHeights.add(cowVal);
        }
        for(int x=0;x<stallArray.length;x+=1)
        {
            int stallVal = Integer.parseInt(stallArray[x]);
            stallHeights.add(stallVal);
        }
        Collections.sort(cowHeights);
        Collections.sort(stallHeights);
        //for(int i=0;i<numCows;i++)
            //System.out.println(groupsTotal(i,cowHeights,stallHeights));
        long answer = groupsTotal(numCows-1,cowHeights,stallHeights);
        System.out.println(answer);
    }

    public static long groupsTotal(int currentStallNum,ArrayList<Integer> cows,ArrayList<Integer> stalls)
    {
        if(currentStallNum==0)
        {
            if(cows.get(0)<=stalls.get(0))
                return 1;
            else
                return 0;
        }
        long previous = groupsTotal(currentStallNum-1,cows, stalls);
        long answer = 0;
        //System.out.println(""+currentStallNum+cows+stalls);
        for(int i=currentStallNum;i>=0;i--) {
            if (cows.get(currentStallNum) <= stalls.get(i)) {
                //System.out.println(i+" t");
                answer += previous;
            }
        }
        return answer;
    }
}