import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;

        while (t!= 0) {
            String s = sc.next();
            if(s.charAt(1)=='+'){
                x++;
            }
            else{
                x--;
            }
            t--;
        }
        System.out.println(x);
    }
}
