public class BuyAndSell_OneTransactionAllowed {
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 8, 6, 9, 7, 1};
        System.out.println(buyandsell1(arr));
    }
    static int buyandsell1(int[] arr){
        int profit = 0;
        int buy = arr[0];
        for(int i : arr){
            int sell = i - buy;
            profit = Math.max(profit, sell);
            buy = Math.min(buy, i);
        }
        return profit;
    }
}
