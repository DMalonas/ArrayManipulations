import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsFrmwMethods implements CollectionsFrameworkInterface {
	String[] magazine = {"give", "me", "one", "grand", "today", "night"};//{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
	String[] note = {"give", "me", "one", "grand", "today", "night"};//{"ive", "got", "some", "coconuts"};

    public void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineWords = new HashMap<String, Integer>();
        for (int i = 0; i < magazine.length; i++) {
        	if (magazineWords.containsKey(magazine[i])) {
        		magazineWords.replace(magazine[i], magazineWords.get(magazine[i]) + 1);
        	} else {
        		magazineWords.put(magazine[i], 1);
        	}
        }
        for (int i = 0; i < note.length; i++) {
            if (magazineWords.containsKey(note[i])) {
            	if (magazineWords.get(note[i]) > 0) {
            		magazineWords.replace(note[i], magazineWords.get(note[i]) - 1);
            		
            	} else {
            		System.out.print("No");
            		return; 
            	}
            } else {
        		System.out.print("No");
        		return;
            }
        }
        System.out.print("Yes");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean checkIfCommonSubString(String s1, String s2) {
        String[] sa1 = s1.split("");
        String[] sa2 = s2.split("");
        Map<String, Integer> sam1 = new HashMap<String, Integer>();
        Map<String, Integer> sam2 = new HashMap<String, Integer>();

        for (int i = 0; i < sa1.length; i++) {
            if(!sam1.containsKey(sa1[i])) {
                sam1.put(sa1[i], i);
            }
        }
        for (int i = 0; i < sa2.length; i++) {
            if(sam1.containsKey(sa2[i])) {
                return true;
            }
        }        
        return false;
    }
    
    
    
    public List<String> usernamesSystem(List<String> u) {
    	Map<String, Integer> uniqueUsers = new HashMap<String, Integer>();

    	for(int i = 0; i < u.size(); i++) {
    		if (!uniqueUsers.containsKey(u.get(i))) {
    			uniqueUsers.put(u.get(i), 0);
    		} else {
    			uniqueUsers.replace(u.get(i), uniqueUsers.get(u.get(i)) + 1);
    			u.set(i, u.get(i) + uniqueUsers.get(u.get(i)));
    		}
    	}
    	
		return u;
    }
    
    
    public int segment(int x, List<Integer> arr) {
		boolean isFirstMinVal = true;
		int minVal = 0;
		int finalMaxVal = 0;
		List<Integer> minVals = new ArrayList<Integer>();
		HashMap<Integer, int[]> slices = new HashMap<Integer, int[]>();
		for (int i = 0; i < arr.size() - x; i++) {
			slices.put(i, getSlice(arr, i, i + x));
		}
	    for (int i = 0;  i < slices.size(); i++) {
	    	minVals.add(getMinimum(slices.get(i)));
	    }
	    finalMaxVal = minVals.get(0);
	    for (int i = 1; i < minVals.size(); i++) { 
	    	if (finalMaxVal < minVals.get(i)) {
	    		finalMaxVal = minVals.get(i);
	    	}
	    }
	    return finalMaxVal;
	
	}

	int[] getSlice(List<Integer> arr, int start, int end) {
		int[] slice = new int[end - start];
		for (int i = 0; i < slice.length; i++) {
			slice[i] = arr.get(start + i);
		}
		return slice;
	}


	public int getMinimum(int[] numbers){
	  int minValue = numbers[0];
	  for(int i=1;i<numbers.length;i++){
	    if(numbers[i] < minValue){
		  minValue = numbers[i];
		}
	  }
	  return minValue;
	}
	
	
	
	
	

	public int segment2(int x, List<Integer> li) {
		List<Integer> minVals = new ArrayList<Integer>();
		for (int i = 0; i < li.size(); i++) {
			if (i + x - 1 < li.size()) {
				//http://www.java2s.com/Code/Java/Collections-Data-Structure/FindMinimumelementofJavaArrayList.htm
				minVals.add(Collections.min(li.subList(i, i + x))); 
			}
		}
		return Collections.max(minVals);	
	}
	
	
	
	//https://www.hackerrank.com/challenges/sock-merchant/problem
	public int sockMerchant(int n, int[] ar) {
        List<Integer> fr_li = new ArrayList<Integer>(Collections.nCopies(100, 0));
        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            fr_li.set(ar[i] - 1, fr_li.get(ar[i] - 1) + 1);
            if (fr_li.get(ar[i] - 1) % 2 == 0) {
            	pairs++;
            	fr_li.set(ar[i] -1, 0);
            }
        }
        return pairs;
	}
	
	//https://www.hackerrank.com/challenges/sock-merchant/problem
    public int socketMerchantLowPerf(int n, int[] arr) {
    	int[] visited = new int[n];
    	Arrays.fill(visited, 0);
    	int pairs = 0;
    	for(int i = 0; i < n; i++) {
    		if(visited[i] == 1)
    			continue;
    		visited[i] = 1;
    		int count = 1;
    		for(int j = i + 1; j < n; j++) {
    			if(arr[i] == arr[j]) {
    				count++;
    				visited[j] = 1;
    				break;
    			}
    		}
    		if(count > 1)
    			pairs++;
    	}
    	return pairs;//        return pairs;    	
    }

}
