public class SortestPath {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println("shortest distance ="+path(str));

    }
    public static float path(String str){
        int a=0,x=0,y=0;
        while (a<str.length()) {
            if(str.charAt(a)=='N'){
                y++;
            }
            if(str.charAt(a)=='S'){
                y--;
            }
            if(str.charAt(a)=='W'){
                x--;
            }
            if(str.charAt(a)=='E'){
                x++;
            }
            a++;

        }
        int num=(x*x)+(y*y);
        return (float)Math.sqrt(num);
        
    }
}
