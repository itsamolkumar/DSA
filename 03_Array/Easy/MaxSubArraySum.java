public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[]={-1,-2,-6,-1,-3};
        SubArraysSum(arr);
    }
    // public static void SubArraysSum(int arr[]){
    //     int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     int prev;
    //     for(int i=0;i<arr.length;i++){
    //         prev=0;
    //        for(int j=i;j<arr.length;j++){
    //         prev+=arr[j];
    //         System.out.println(prev);
    //         if(prev>max){
    //             max=prev;
    //         }
    //         if(prev<min){min=prev;}
    //        }
    //     }
    //     System.out.println("minimum="+min+", maximum is="+max);
    // }

    //Kadane's Algorithm..................
        public static void SubArraysSum(int arr[]){
            int currSum=0,maxSum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                currSum+=arr[i];
                if(currSum<0){
                    currSum=0;
                }
                maxSum=Math.max(currSum,maxSum);
            }
            System.out.println("Max="+maxSum);
        }

}
