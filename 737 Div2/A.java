import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long sum=0;
            int max=a[0];
            for(int i=0;i<a.length;i++){
                sum+=a[i];
                max=Math.max(a[i],max);
            }
            double avg=1.0*(sum-max)/(n-1)+max;
            System.out.println(String.format("%.9f",avg));
        }
    }
}