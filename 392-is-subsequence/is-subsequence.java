class Solution {
    public boolean isSubsequence(String s, String t) {
        // int a = 0;
        // int b =0;
        // while(a<s.length() && b<t.length()){
        //     if(s.charAt(a)==t.charAt(b)){
        //         a++;
        //     }
        //     b++;
        // }
        // return a==s.length();
        if(s.isEmpty()) return true;
        int l = 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            int f = t.indexOf(c,l);
            if(f==-1) return false;
            l = f + 1;
        }
        return true;

    }
}