class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(n>0){
            int rem = n%10;
            arr.add(rem);
            n = n/10;
        }
        if(arr.size()<2){
            return arr.get(1);
        }
        Collections.sort(arr);
        int s = arr.size();
        int n1 = arr.get(s-1);
        int n2 = arr.get(s-2);
        return n1*n2;
    }
}