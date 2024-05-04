import java.util.*;
public class SortAnagram {
    private static String sortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sb.append((char) (i + 'a'));
                count[i]--;
            }
        }
        return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> keys = new ArrayList<>();

        for (String s : strs) {
            String sortedString = sortString(s);
            boolean found = false;
            for (int i = 0; i < keys.size(); i++) {
                if (keys.get(i).equals(sortedString)) {
                    result.get(i).add(s);
                    found = true;
                    break;
                }
            }
            if (!found) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                result.add(newList);
                keys.add(sortedString);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"loop", "pool", "part", "trap", "opt", "top"};
        List<List<String>> groupedAnagrams = groupAnagrams(words);
        for (List<String> list : groupedAnagrams) {
            System.out.println(list);
        }
    }

}



