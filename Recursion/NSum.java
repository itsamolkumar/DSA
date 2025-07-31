public class NSum {
    public static void main(String[] args) {
        int num=10;
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if(num==1) return 1;
        int val=sum(num-1);
        return val+num;
    }
}
