
public class Rotation implements RotateMethods{


	@Override
	public int[] rotateLeftXpositions(int[] arr, int pos) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + pos < arr.length) {
               temp[i] = arr[i + pos];
            } else {
                if (arr.length - pos - i -1> 0) {
                    temp[i] = arr[arr.length - pos - i];
                } else {
                    temp[i] = arr[pos + i - arr.length];
                }
            }
        }
        return temp;
    }

	@Override
	public int[] rotateRightXpositions(int[] arr, int pos) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - pos) {
               temp[pos + i ] = arr[i];
            } else {
                if (arr.length - pos - i > 0) {
                    temp[arr.length - i - pos] = arr[i];
                } else {
                    temp[i + pos - arr.length] = arr[i];
                }
            }
        }
        return temp;
	}
}
