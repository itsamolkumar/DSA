
public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5,20-5};
        largestNum(arr);
    }
    public static void largestNum(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int  i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]) {max=arr[i];}
        }
        System.out.println("minimum="+min+" and maximum="+max);
    }
}
