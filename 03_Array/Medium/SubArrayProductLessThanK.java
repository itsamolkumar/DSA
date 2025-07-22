public class SubArrayProductLessThanK {

    public static void main(String[] args) {
        int arr[]={1,1,1};
        int k=100;
        System.out.println("Total Subarray="+subArray(arr,k));
    }
    public static int subArray(int arr[], int k){
        int count=0;
        int n=arr.length;
        int[] prefixMul=new int[n];
        prefixMul[0]=arr[0];
        if(prefixMul[0]<k) count++;
        for(int i=1;i<n;i++){
            prefixMul[i]=arr[i]*prefixMul[i-1];
            if(prefixMul[i]<k) count++;
        }
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n;j++){
                if((prefixMul[j]/prefixMul[i])<k){
                    count++;
                }
            }
            
        }  
        if(arr[n-1]<k){
                count++;
            }      
        return count;
    }
}