
public class LinearSearch {
     public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int key=2;
        search(arr,key);
    }
    public static void search(int arr[],int key){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println(key+" found at "+i+"th index");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(key+" Not found");
        }

    }
}
