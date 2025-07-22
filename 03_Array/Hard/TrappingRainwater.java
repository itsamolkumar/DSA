public class TrappingRainwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int width=1;
        
        System.out.println("Total water trapped="+Trapping(arr,width));
    }
    public static int Trapping(int arr[],int width){

        int n=arr.length;
        if (n <= 2) return 0;

       int[] leftMax=new int[n];
       int[] rightMax=new int[n];
       leftMax[0]=arr[0];
       for(int i=1;i<n;i++){
        leftMax[i]=Math.max(leftMax[i-1], arr[i]);
       }
       rightMax[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--){
        rightMax[i]=Math.max(rightMax[i+1], arr[i]);
       }
       int total=0,waterLevel;
       for(int i=0;i<n;i++){
        waterLevel=Math.min(leftMax[i], rightMax[i])-arr[i];
       
       if(waterLevel<0){
        waterLevel=0;
       }
       total+=waterLevel;
    }
    return total;

    }
}
