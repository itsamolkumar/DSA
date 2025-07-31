public class sortedOrNot {
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,11,7,8,9};
        int i=0;
        System.out.println(isSorted(arr,i));
    }
    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]) return false;
        else{
            return isSorted(arr, i+1);
        }
    }
}
