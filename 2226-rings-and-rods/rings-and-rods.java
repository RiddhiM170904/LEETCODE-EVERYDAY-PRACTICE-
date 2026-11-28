class Solution {
    public int countPoints(String rings) {
        HashMap<Integer,HashSet<Character>> map = new HashMap<>();
        for(int i=0;i<10;i++){
            HashSet<Character> set = new HashSet<>();
            map.put(i,set);
        }
        int n = rings.length();
        for(int i=1;i<n;i=i+2){
            char color = rings.charAt(i-1);
            int num = rings.charAt(i) - '0';
            HashSet<Character> set = map.get(num);
            set.add(color);
            map.put(num,set);
        }
        int ans = 0;
        for(int i=0;i<map.size();i++){
            int l = map.get(i).size();
            if(l==3) ans++;
        }
        return ans;
    }
}