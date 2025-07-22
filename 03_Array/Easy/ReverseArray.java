public class ReverseArray {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Reverse(arr);
    }
    public static void Reverse(int arr[]){
        int temp,end=arr.length;
        for(int i=0;i<end/2;i++){
            temp=arr[i];
            arr[i]=arr[end-1-i];
            arr[end-1-i]=temp;
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}