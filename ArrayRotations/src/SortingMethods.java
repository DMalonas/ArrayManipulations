
public class SortingMethods {

	//https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
    static void countSwapsInBubbleSort(int[] a) {
        int swaps = 0, temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.print("Array is sorted in " + swaps + " swaps.\n" +
                         "First Element: " + a[0] + "\n" +
                         "Last Element: " + a[a.length - 1] + "\n");

    }

}
