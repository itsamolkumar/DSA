public class StringCompressor {
    public static void main(String[] args) {
        String str="laaabbcccdd";
        compress(str);
    }
    public static void compress(String str){
        StringBuilder word=new StringBuilder("");
        int count=0; 
        char letter=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==letter){
                count++;
                if(i==str.length()-1) {
                word.append(letter);
                word.append(count);
            }
            }
            else{
                word.append(letter);
                word.append(count);

                letter=str.charAt(i);
            count=1;}
            
            
        }
        System.out.println(word);
    }
}
