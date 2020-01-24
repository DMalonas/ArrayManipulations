
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
}
