class Solution {
    public String reverse(String s){
        String str ="";
        for(int i=s.length()-1;i>=0;i--){
            str += s.charAt(i);
        }
        return str;
    }
    public String finalString(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='i'){
                str = reverse(str);
            }else{
                str += ch;
            }
        }
        return str;
    }
}