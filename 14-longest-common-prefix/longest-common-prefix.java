// class Solution {
//     public String longestCommonPrefix(String[] s) {
//         String prefix=s[0];
//         for(int i=1;i<=s.length-1;i++){
//             for(int j=0;j<prefix.length() && j<s[i].length();j++){
//                 if(prefix.charAt(j)!=s[i].charAt(j)){
//                     prefix=prefix.substring(0,j);
//                     break;
//                 }
//                  if (s[i].length() < prefix.length()) {
//                 prefix = prefix.substring(0, s[i].length());
//             }
//             }
//         }
//         return prefix;


        
//     }
// }

class Solution {
    public String longestCommonPrefix(String[] s) {

        String prefix = s[0];

        for (int i = 1; i < s.length; i++) {

            int j = 0;

            while (j < prefix.length() &&j < s[i].length() && prefix.charAt(j) == s[i].charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }
}

