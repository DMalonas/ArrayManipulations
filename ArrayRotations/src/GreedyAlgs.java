import java.util.Arrays;

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

}
