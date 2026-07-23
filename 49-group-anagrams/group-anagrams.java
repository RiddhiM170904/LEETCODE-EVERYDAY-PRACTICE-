class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //ek hashmap banaya h taki voh string aur usse valid esa valid anagram store krr skee
        HashMap<String,List<String>> map = new HashMap<>(); 
        for(String str : strs){//access kre elements froma string
            char[] arr = str.toCharArray();//usko sort krne ke liye arr banaya 
            Arrays.sort(arr);//sort kiya
            String key = new String(arr);//usko vapas string mein convert kiya
            if(!map.containsKey(key)){//check if in hashmap
                map.put(key, new ArrayList<>());//if not nayi arraylist bana dii
            }
            map.get(key).add(str);//nhi toh direct add krr diya
        }
        return new ArrayList(map.values());//values vali arraylist return krr dii
    }
}