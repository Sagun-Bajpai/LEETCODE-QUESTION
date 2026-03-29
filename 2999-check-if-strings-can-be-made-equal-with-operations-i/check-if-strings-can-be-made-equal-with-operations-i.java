import java.util.Arrays;
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        char[]even1={arr1[0],arr1[2]};
        char[]even2={arr2[0],arr2[2]};
        char[]odd1={arr1[1],arr1[3]};
        char[]odd2={arr2[1],arr2[3]};
        Arrays.sort(even1);
        Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);
        if(Arrays.equals(even1,even2) && Arrays.equals(odd1,odd2)){
            return true;
        }
        else{
            return false;
        }
       
        
    }
}