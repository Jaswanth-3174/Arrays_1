import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {

        //int[] arr = {1, 2};
        // o/p : 1,2

        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 1};
        System.out.println(me2(arr, arr.length));
    }
    public static List<Integer> me2(int[] arr, int n){
        List<Integer> list = new ArrayList<>();

        // 1. moore's algo
        int count1 = 0, count2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for(int i : arr){
            if(count1 == 0 && ele2 != i){
                count1 = 1;
                ele1 = i;
            }else if(count2 == 0 && ele1 != i){
                count2 = 1;
                ele2 = i;
            }
            else if(ele1 == i) count1++;
            else if(ele2 == i) count2++;
            else{
                count1--;
                count2--;
            }
        }

        // 2. verify moore's voting algo
        count1 = 0;
        count2 = 0;
        for(int i : arr){
            if(ele1 == i) count1++;
            if(ele2 == i) count2++;
        }
        if(count1 > n/3) list.add(ele1);
        if(count2 > n/3) list.add(ele2);

        // need to sort in GFG, but since there are only two elements
        // compare and store which is smaller and larger
        return list;
    }
}
