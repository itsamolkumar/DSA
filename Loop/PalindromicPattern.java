public class PalindromicPattern {
public static void main(String[] args) {
    
        int n=5,count;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }count=i;
            for(int k=1;k<=i;k++){
                
                System.out.print("*");
                count--;
            }
            count++;
            for(int l=1;l<=i-1;l++){
                count++;
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

