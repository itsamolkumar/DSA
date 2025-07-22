public class Stock {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};   
        System.out.println("Max Profit="+ Profit(price));     
    }
    // public static int Profit(int price[]){
    //     int n=price.length;
    //     int[] rightMax=new int[n];
    //     rightMax[n-1]=price[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         rightMax[i]=Math.max(rightMax[i+1], price[i]);
    //     }
    //     int maxProfit=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //        if(maxProfit<(rightMax[i]-price[i])){
    //         maxProfit=rightMax[i]-price[i];
    //        }
    //             }
    //     return Math.max(0, maxProfit);
    // }
    public static int Profit(int[] price) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            minPrice = Math.min(minPrice, price[i]);
            int profitToday = price[i] - minPrice;
            maxProfit = Math.max(maxProfit, profitToday);
        }

        return maxProfit;
    }
}
