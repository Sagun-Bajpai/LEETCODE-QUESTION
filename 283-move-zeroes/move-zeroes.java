class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=0;
        while(j<=n-1){
             System.out.println("j = " + j + ", i = " + i);
            if(arr[j]!=0){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}