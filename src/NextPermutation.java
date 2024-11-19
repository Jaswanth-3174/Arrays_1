import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        int len = arr.length;
        System.out.println(Arrays.toString(arr));

        np(arr, len);
        System.out.println(Arrays.toString(arr));
    }

    static void np(int[] arr, int len){

        // 1
        int index = -1;
        for(int i=len-2; i>=0; i--){
            if(arr[i] < arr[i+1]){ // 1 < 5
                index = i;
                break;
            }
        }

        if(index == -1){
            rev(arr, 0, len-1);
            return;
        }

        // 2
        for(int i=len-1; i>index; i--){
            if(arr[i] > arr[index]){
                // swap
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }


        // 3
        rev(arr, index+1, len-1);
    }

    static void rev(int[] arr, int start, int end){
        while( start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
