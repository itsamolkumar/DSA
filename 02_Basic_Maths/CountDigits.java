public class CountDigits {

    public static void main(String[] args) {
        int digit=Counter(1234567000);
        System.out.println(digit);
    }
    
    public static int Counter(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}