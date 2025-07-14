public class ButterflyPattern {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n;j++){
                if(j>i &&j<n+1-i){
                    System.out.print(" ");
                }
                else{System.out.print("*");}
            }
            System.out.println();
        }
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j>i &&j<n+1-i){
                    System.out.print(" ");
                }
                else{System.out.print("*");}
            }
            System.out.println();
        }
    }
    
}
