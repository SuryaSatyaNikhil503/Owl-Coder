import java.util.*;
public class ReversingNumber
{
    static void rev(int n)
    {
        if(n<10)
        {
            System.out.print(n);
            return;
        }
        else
        {
            System.out.print(n % 10);
            rev(n / 10);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rev(n);
    }
}
