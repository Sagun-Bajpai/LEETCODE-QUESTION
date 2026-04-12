class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        //string of arr  then  we use strs.length;
        for(int i=1;i<strs.length;i++){// O(n) - n strings
            while(!strs[i].startsWith(prefix)){ // O(m) - max m baar chalega
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";

            }

        }
        return prefix;
        
    }
}
/*TC=0(n*m) */