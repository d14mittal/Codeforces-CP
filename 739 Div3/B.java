import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=Math.abs(b-a);
            int n=2*d;
            int count=0;
            for(int i=1;i<=n;i++){
                if(i==a){
                    count++;
                }
                if(i==b){
                    count++;
                }
                if(i==c){
                    count++;
                }
            }
            if(c<=n/2 && count==3){
                System.out.println(c+d);    
            }
            if(c>n/2 && count==3){
                System.out.println(c-d);
            }
            if(count!=3){
                System.out.println(-1);
            }


        }
    }
    
}
