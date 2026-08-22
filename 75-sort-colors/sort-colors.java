class Solution {

    // YE NAYA METHOD ADD KARO
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) { 
        int n=arr.length;    
        int slow=0;
        int mid=0;
        int high=n-1;
       while(mid<=high){
        if(arr[mid]==0){
            swap(arr,mid,slow);
            mid++;
            slow++;
        }
        else if(arr[mid]==2){
            swap(arr,mid,high);
            high--;
        }
        else{
            mid++;
        }

       }
        
    }
}