class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char word = s.charAt(i);
            if(map1.containsKey(word)){
                map1.put(word, map1.get(word)+1);
            }else{
            map1.put(word, 1);
            }
        }

        for(int j = 0; j<t.length(); j++){
           char word = t.charAt(j);
            if(map2.containsKey(word)){
                map2.put(word, map2.get(word)+1);
            }else{
            map2.put(word, 1);
            }
        }

        if(map1.equals(map2)){
        return true;
        }
        else return false;
    }
}
