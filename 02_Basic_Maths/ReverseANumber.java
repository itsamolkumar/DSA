
public class ReverseANumber {
    public static void main(String[] args) {
        int num=Reverse(1534236468);
        System.out.println(num);
    }
    public static int Reverse(int num){
        int reverseNum=0;
        while(num!=0){
            reverseNum=(reverseNum*10)+num%10;
            num=num/10;
        }
        return reverseNum;
    }
}
