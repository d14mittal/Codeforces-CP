import java.util.*;
public class Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int n = sc.nextInt();
		while(n--!=0){
			int a=sc.nextInt();
			int b=sc.nextInt();			
			int c=sc.nextInt();
			int sum=a+b+c;
			if(sum>=2){
				count++;
			}
		}
		System.out.println(count);
	}
}