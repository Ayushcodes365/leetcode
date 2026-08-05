class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int res=0;
        Map<Character,Integer>f=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char c=s.charAt(high);
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.get(c)>1){
                char charleft=s.charAt(low);
                f.put(charleft,f.get(charleft)-1);
                if(f.get(charleft)==0){
                    f.remove(charleft);
                }
                low++;
            }
            int len=high-low+1;
            res=Math.max(res,len);
    }return res;
        }
}