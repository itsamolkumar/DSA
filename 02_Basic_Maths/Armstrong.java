public class Armstrong  {
    public static void main(String[] args) {
        int num=374;
       int digits=countdigit(num); 
       System.out.println(isArmstrong(num,digits));
    }
    public static int countdigit(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int x, int digits){
        int sum=0,num=x;
        while(num>0){
            sum+=Math.pow((num%10), digits);
            num/=10;
        }
        if(x==sum){return true;}
        else return false;
    }
}
