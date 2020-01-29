import java.util.Arrays;
import java.util.Stack;

public class ArrayHandling implements ArrayManipulation{

	
	/**************************************************************88
	 * Generics method to print arrays of different data types
	 */
	public <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s\n", element);
		}
	}
	
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
	
	
	
	
	
    public int alternatingCharacters(String s) {
        String temp = "";
        temp = s.substring(0, 1);
        int j = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                j++;
                continue;
            }
            temp += s.substring(i, i + 1);
        }
        System.out.println(temp);
        return j;

    }
    
    
    static boolean isBalancedString(String input) {
        Stack<Character> st = new Stack<Character>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    st.push(ch);
                    break;
                case '}':
                    if (st.isEmpty() || st.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (st.isEmpty() || st.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (st.isEmpty() || st.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return st.isEmpty();
    }
}
