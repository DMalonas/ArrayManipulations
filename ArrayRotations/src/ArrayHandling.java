import java.util.Arrays;

public class ArrayHandling implements ArrayManipulation{

    public int getHourGlassSum(int[][] arr) {
        int sum = 0;
        boolean isFirstSum = true;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
	                if(!isFirstSum) {
	                    if (sum < (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2])) {
	                    	sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
	                    }
	                } else {
	                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
	                    isFirstSum = false;
	                }
	            }
        }
        return sum;
    }

	@Override
	public int makeAnagramFromString(String a, String b) {
        int[] alph1 = new int[26];
        Arrays.fill(alph1, 0);
        int[] alph2 = new int[26];
        Arrays.fill(alph2, 0);
        for (int i = 0; i < a.length(); i++) {
            alph1[a.charAt(i) - 97]++;
        }
        for (int i = 0; i < b.length(); i++) {
                alph2[b.charAt(i) - 97]++;
        }
        int numOfCharactersToDelete = 0;
        for (int i = 0; i < alph1.length; i++) {
            numOfCharactersToDelete += Math.abs(alph1[i] - alph2[i]); 
        }
        return numOfCharactersToDelete;
    }
}
