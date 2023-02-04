import java.util.*;
public class CountingDigits
{
    static int digi(int n)
    {
        if(n==0) return 0;
        return 1+digi(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digi(n));
    }
}
