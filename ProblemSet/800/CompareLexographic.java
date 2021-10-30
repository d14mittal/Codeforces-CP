import java.util.Scanner;

public class CompareLexographic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char a[]=s1.toLowerCase().toCharArray();
        char b[]=s2.toLowerCase().toCharArray();
        int flag=0;
        for(int i=0;i<s1.length();i++){
            if(a[i]<b[i]){
                flag=-1;
                break;
            }
            else if(a[i]>b[i]){
                flag=1;
                break;
            }
            else{
                flag=0;   
            }
        }
        System.out.println(flag);
    }
}
