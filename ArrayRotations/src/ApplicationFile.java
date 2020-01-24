
public class ApplicationFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotation t = new Rotation();
		ArrayHandling ah = new ArrayHandling();
		
		int[] arr = {1, 2, 3, 4, 5};
		int pos = 4;
		
		int[] arr2 = t.rotateRightXpositions(arr, pos);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2 = t.rotateLeftXpositions(arr, pos);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		int[][] ar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(ah.getHourGlassSum(ar));
	}

}
