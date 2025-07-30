public class EvenorOdd {
    public static void main(String args[]){
        int num=5;
        checkEven(num);
    }
    public static void checkEven(int num){
        if((num & 1)==0){
            System.out.println("It's even");
        }
        else{
            System.out.println("It's odd");
        }
    }
    
}
