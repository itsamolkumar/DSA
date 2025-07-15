public class GCD {
    public static void main(String[] args) {
        int num1=20,num2=15;
    int gcd=isGcd(num1,num2);
    System.out.println(gcd);
    }
    public static int isGcd(int num1,int num2){
        int gcd=0;
        for(int i=Math.min(num1,num2);i>=1;i--){
            if(num1%i==0 && num2%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
}
