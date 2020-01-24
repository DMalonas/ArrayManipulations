import java.util.HashMap;
import java.util.Map;

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
}
