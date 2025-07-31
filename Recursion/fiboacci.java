public class fiboacci {
    public static void main(String[] args) {
        int num=10000;
        for(int i=0;i<num;i++){
           System.out.print( print(i)+" ");
        }

    }
    public static int print(int num){
        
        if(num<=1) return num;
        return print(num-2)+print(num-1);
        
    }}
