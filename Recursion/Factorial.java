public class Factorial {
    public static void main(String[] args) {
        int num=6;
        System.out.println(facto(num));
    }
    public static int facto(int num){
        if(num==0){
            return 1;
        }
        int fact=facto(num-1);
        return num*fact;
    }
}
