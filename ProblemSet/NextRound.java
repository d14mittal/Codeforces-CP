import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        int ans = 0;
        while (a[i] >= a[k - 1] && a[i] != 0) {
            ans++;
            i++;
        }
        System.out.println(ans);
    }
}
