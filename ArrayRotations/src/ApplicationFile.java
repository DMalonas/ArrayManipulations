import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ApplicationFile {

	public static void main(String[] args) {
		
		
		
		/***********************
		 * 
		 * 
		 * Check for method overloading, method
		 */
		int count = 0;
		for (Method method : CollectionsFrmwMethods.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("checkIfCommonSubString"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
        /***********************************************************************/
        
        
   
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
		
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println("Number of characters to delete to create two strings that are anagrams: " + ah.makeAnagramFromString(a, b));
		
		
		
		
		try {
			File f = new File("InputForAlternatingCharsMethod.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(ah.alternatingCharacters(st));
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		CollectionsFrmwMethods cfm = new CollectionsFrmwMethods();
		String[] magazine = {"give", "me", "one", "grand", "today", "night"};//{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
		String[] note = {"give", "me", "one", "grand", "today", "night"};//{"ive", "got", "some", "coconuts"};
		cfm.checkMagazine(magazine, note);
		

		System.out.println();
		
		boolean isSubstring = cfm.checkIfCommonSubString("Hello", "world");
		System.out.println(isSubstring);
		System.out.println(cfm.checkIfCommonSubString("Hi", "World"));
		
		
		List<String> usernames = new ArrayList<String>();
		usernames.add("bob");
		usernames.add("alice");
		usernames.add("bob");
		usernames.add("alice");
		usernames.add("bob");
		usernames.add("alice");

		usernames = cfm.usernamesSystem(usernames);
		System.out.println(usernames.toString());
		
		
		int x = 3;
		List<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 5, 1, 2, 3, 1, 2));//1, 5, 1, 2, 3, 1, 2

		System.out.println(cfm.segment2(x, testList));
		

		int n = 9;
		int[] ar3 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println("pairs :: " + cfm.sockMerchant(n, ar3));
		
		
		//int n = 9;
		//int[] ar3 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println("pairs :: " + cfm.socketMerchantLowPerf(n, ar3));
		
		
		GreedyAlgs ga = new GreedyAlgs();
		n = 3;
		int ar5[][] = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
		System.out.println("\nluck generator value: " + ga.luckBalance(n, ar5));
		
		
		String input = "{{([])}}";
		System.out.println("string is balanced : " +  ah.isBalancedString(input));
		
		

	}

}
