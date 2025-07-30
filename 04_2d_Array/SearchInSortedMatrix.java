public class SearchInSortedMatrix {
    public static void main(String args[]){
        int[][] arr={
                     {10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}
                    };
        int key=39;
        search(arr,key);
    }
    public static boolean search(int[][] arr,int key){
        
int row=0,col=arr[0].length-1;
    while(row<arr.length && col>=0){
        if(arr[row][col]==key){
            System.out.println("found "+key+" at="+row+","+col);
            return true;
            
        }
        if(arr[row][col]>key){
            col--;
        }
        else row++;
    }
    System.out.println("not found");
    return false;

}
}
