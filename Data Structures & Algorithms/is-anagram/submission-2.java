class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        Map<Character,Integer> map1= new HashMap<>(); // O(map1)
        Map<Character,Integer> map2= new HashMap<>();// O(map2)


        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        return map1.equals(map2); // return true else false

    }

    //S:O(map1 + map2)
    //T:O(n)
}
