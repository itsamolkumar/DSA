public class HollowRectangle {
        public static void main(String[] args) {
            int count=15;

        for(int r=0;r<count;r++){
            for(int c=0;c<count;c++){
               if(r==0 || c==0 || r==count-1 ||c==count-1){
                System.out.print("*");

                               }
               else{
                System.out.print(" ");
               }
               
            }
            System.out.println();

        }
    }
}
