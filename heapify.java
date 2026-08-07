import java.util.*;
class heapify{
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 2, 4};
        heapify(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void heapify(int[] arr,int n,int i){
        int max=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[max]){
            max=left;
        }
        if(right<n && arr[right]>arr[max]){
            max=right;
        }
        if(max!=i){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(arr, n, max);
        }
    }
}