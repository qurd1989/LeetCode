package easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {

        String a = "aa";
        String b = "aab";
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.conCunstruct(a, b));
    }

    private Map<Character, Integer>  countMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
    public boolean canConstruct( String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> ransomNoteMap = countMap(ransomNote);
        Map<Character, Integer> magazineMap = countMap(magazine);
        for(Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            if (magazineMap.getOrDefault(c, 0) < count) {
                return false;
            }
        }
        return true;

    }
    public boolean conCunstruct(String ransomNote, String magazine){
        int [] count = new int[26];
        for(int i = 0; i < magazine.length(); i++)  {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    public void duplicateZeros(int[] arr) {

    }

}
