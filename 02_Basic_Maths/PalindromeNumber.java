public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12134));
        
    }
    public static boolean isPalindrome(int x) {
        int rev=0;
        int nm=x;
        int dig;
    while(x>0){
        dig=x%10;
        x/=10;
        rev=(rev*10)+dig;
    }
    if(nm==rev) return true;
 return false;
    }
}
