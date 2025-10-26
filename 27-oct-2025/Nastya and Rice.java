import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans = "";
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(solve(n, a, b, c, d));
        }
    }
    public static String solve(int n, int a, int b, int c, int d){
        int val1 = n * (a - b);
        int val2 = n * (a + b);
        int val3 = c - d;
        int val4 = c + d;
        if(val3 <= val2 && val1 <= val4){
            return "Yes";
        }
        return "No";
    }
}