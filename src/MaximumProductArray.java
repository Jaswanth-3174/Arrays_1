public class MaximumProductArray {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2}; // 180
        System.out.println(mpa(arr));
    }
    static int mpa(int[] arr){
        int n = arr.length;
        int pre = 1, suff = 1;
        int max = arr[0];
        for(int i=0; i<n; i++){
            pre = pre * arr[i];
            suff = suff * arr[n-i-1];
            max = Math.max(max, Math.max(pre, suff));
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
        }
        return max;
    }
}
