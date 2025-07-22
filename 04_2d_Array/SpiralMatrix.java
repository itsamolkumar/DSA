
public class SpiralMatrix {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
    }
    public static void print(int [][]arr){
        
        int startR=0,startC=0,endR=arr.length-1,endC=arr[0].length-1;
        while(startR<=endR  && startC<=endR){
            //Top.........
            for(int i=startC;i<=endC;i++){
                System.out.print(arr[startR][i]+" ");
            } 
            //Right.........
            for(int j=startR+1;j<=endR;j++){
                System.out.print(arr[j][endC]+" ");
            } 
            //Buttom.........
            for(int k=endC-1;k>=startC;k--){
                if(startR==endR){
                    break;
                }
                System.out.print(arr[endR][k]+" ");
            } 
            //Left.........
            for(int l=endR-1;l>=startR+1;l--){
                if(startC==endC) break;
                System.out.print(arr[l][startC]+" ");
            } 
            startR++;startC++;endC--;endR--;      
         }
       
    }}

