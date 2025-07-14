public class SolidRhombus {
    public static void main(String[] args) {
        int n=9;
        int m=17,sum;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                sum=i+j;
                if(sum>n && sum<=m+1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
