public class Palindrome {
    public static void main(String args[]){
    String str="racepar";
    
    if(isPalindrome(str)){
        System.out.println("It's a palindrome");
    }
    else System.out.println("it's not a palindrome");
    }
    public static boolean isPalindrome(String str){
        int a=0;
        int b=str.length()-1;
        while(a<=b){
            if(str.charAt(a)!=str.charAt(b)){
                return false;
            }
            else{a++;b--;}
        }
        return true;
    }





    
}
