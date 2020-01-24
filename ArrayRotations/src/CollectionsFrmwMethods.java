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
}
