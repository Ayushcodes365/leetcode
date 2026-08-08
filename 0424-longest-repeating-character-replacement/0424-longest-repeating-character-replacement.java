import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,res=0,maxf=0;
        HashMap<Character,Integer>f=new HashMap<>();
        for(int j=0;j<s.length();j++){
           char c=s.charAt(j);
           f.put(c,f.getOrDefault(c,0)+1);
           maxf=Math.max(maxf,f.get(c));

           while((j-i)+1-maxf>k){
            char left=s.charAt(i);
            f.put(left,f.get(left)-1);
            i++;
           }
           res=Math.max(res,j-i+1);
        }
        return res;
    }
}