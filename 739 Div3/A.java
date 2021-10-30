import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int k=sc.nextInt();
            int count=0;
            for(int i=1;;i++){
                if(i%3!=0 && i%10!=3){
                    count++;
                    if(count==k){
                        System.out.println(i);
                        break;
                    }
                }
            }          
    
        }
    }    
}
