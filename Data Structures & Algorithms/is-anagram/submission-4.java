class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> hms = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmt = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            hms.put(charS, hms.getOrDefault(charS, 0) + 1);
            hmt.put(charT, hmt.getOrDefault(charT, 0) + 1);
        }

        for(Character c : hms.keySet()) {
            if (!hms.get(c).equals(hmt.getOrDefault(c, 0))) {
                return false;
            }
        }

        return true;
    }
}
