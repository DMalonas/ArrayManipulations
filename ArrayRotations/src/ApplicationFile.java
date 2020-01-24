
public class ApplicationFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotation t = new Rotation();
		int[] arr = {1, 2, 3, 4, 5};
		int pos = 4;
		int[] arr2 = t.rotateRightXpositions(arr, pos);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
