public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n=7;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
