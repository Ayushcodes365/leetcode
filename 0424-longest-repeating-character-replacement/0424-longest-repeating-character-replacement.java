import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int result=0;
        HashMap<Character,Integer>f =new HashMap<>();
        for(int high=0;high<s.length();high++){
           char c=s.charAt(high);
           f.put(c,f.getOrDefault(c,0)+1);
           int maxCount=0;
           for(int count:f.values()){
            maxCount=Math.max(maxCount,count);
           }

           while((high-low+1)-maxCount>k){
            char leftChar=s.charAt(low);
            f.put(leftChar,f.get(leftChar)-1);
           
           if(f.get(leftChar)==0){
            f.remove(leftChar);
           }
           low++;
           maxCount=0;
           for(int count:f.values()){
             maxCount=Math.max(maxCount,count);
           }
        }
        result=Math.max(result,high-low+1);
    }
    return result;
}}