
public class IncreasingOrder {
    public static void main(String[] args) {
        int start=1,last=10;
    print(start,last);
    }
    public static void print(int start, int last){
        if(start==last){
            System.out.println(start);
            return;

        }
       
            System.out.println(start);
            print(++start,last);}
    
    
}
