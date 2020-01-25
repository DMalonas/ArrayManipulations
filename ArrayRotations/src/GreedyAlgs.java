import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgs {
	
    public int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE; 

        for (int i=0; i<arr.length -1; i++) {
            if (arr[i+1] - arr[i] < diff) { 
                diff = arr[i+1] - arr[i];
            }
        }
        return diff;
    }

    
    

    
    
    
    //https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
    public int luckBalance(int k, int[][] contests) {
        ArrayList<Integer> unCnts = new ArrayList<Integer>();
        ArrayList<Integer> impCnts = new ArrayList<Integer>();

        for (int i = 0; i < contests.length; i ++) {
            if (contests[i][1] == 0) {
                unCnts.add(contests[i][0]);
            } else {
                impCnts.add(contests[i][0]);
            }
        }

        Collections.sort(impCnts);
        int cnt = (impCnts.size() - k);
        System.out.println(cnt);
        int dec = 0;


        for (int i = 0; i < cnt; i++) {
            dec += impCnts.remove(0);
        }

        int impCntsSum = impCnts.stream()
                    .mapToInt(i -> i.intValue())
                    .sum();
        int unCntsSum = unCnts.stream()
                    .mapToInt(i -> i.intValue())
                    .sum();
        return (impCntsSum + unCntsSum - dec);
    }

}
