import java.util.Scanner;

public class SoldierBanana{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int cost=0;
        for(int i=1;i<=w;i++){
            cost+=i*k;
        }
        if(n>cost){
            System.out.println(0);
        }
        else{
            System.out.println(cost-n);
        }
    }
}