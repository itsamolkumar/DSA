public class FloydsTriangle {
    public static void main(String[] args) {
        int count=0;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    
}
