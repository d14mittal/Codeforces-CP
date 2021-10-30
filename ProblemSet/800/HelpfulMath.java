import java.util.*;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                q.add(1);
            }
            if (s.charAt(i) == '2') {
                q.add(2);
            }
            if (s.charAt(i) == '3') {
                q.add(3);
            }
        }
       
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(q.poll());
            }
            else{
                System.out.print("+");
            }
        }
    }

}
