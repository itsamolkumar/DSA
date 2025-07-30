public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20},{21,22,23,24,25}};
        int result=DiagonalSums(arr);
        if(result==0){
            System.out.println("not a valid square matrix");
        }
        else{
        System.out.print("Sum="+result);
        }
    }
    public static int DiagonalSums(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        if(n!=m){
            return 0;
                }
        
            int sum=0;
            //left digonal sum.........
            for(int i=0;i<n;i++){
                System.out.print(arr[i][i]+" ");
                sum+=arr[i][i];
        }
        System.out.println();
        //Right Diagonal sum...............
        int col=0,row=(n-1);
        for(int i=0;i<n;i++){
            if(row!=col){
            System.out.print(arr[row][col]+" ");   
            sum+=arr[row][col];
        }
            row--;
            col++;  
           
        }
        System.out.println();
        return sum;
    }
}
