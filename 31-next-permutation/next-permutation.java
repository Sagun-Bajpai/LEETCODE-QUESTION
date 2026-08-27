class Solution {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] arr) {
        int pivot=-1;
        int n=arr.length;
         // Step 1: find pivot (start from n-2 to avoid out-of-bounds)
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        
          // Step 2: if no pivot, whole array is descending -> reverse it fully
        if(pivot==-1){
            reverse(arr, 0, n - 1);
            return;
        }
        
        // Step 3: find element just bigger than pivot, from the right
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        
        // Step 4: reverse everything after pivot
        int i=pivot+1;
        int j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        
    }
}