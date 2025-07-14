public class RotatedInvertedHalfPyramid {
    public static void main(String[] args) {
         int n=7;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                int sum=i+j;
                if(sum>n){System.out.print("*");}
                else{System.out.print(" ");}
                
            }
            System.out.println();
        }
    }
}
