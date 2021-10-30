import java.util.Scanner;

public class Capitalization{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.charAt(0)>=97){
            int diff=s.charAt(0)-32;
            System.out.println((char) diff+ s.substring(1, s.length()));
        }
        else{
            System.out.println(s);
        }
    }
}