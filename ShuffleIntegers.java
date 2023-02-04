import java.util.*;
public class ShuffleIntegers
{
    static void shuffle(int[] a , int s , int e)
    {
        if(s > e)
        {
            return;
        }
        if(e-s == 1)
        {
            return;
        }
        int mid = (s+e) / 2;
        int t1 = mid+1;
        int am = (s+mid) / 2;
        for(int i=am+1 ; i<=mid ; i++)
        {
            int temp = a[i];
            a[i] = a[t1];
            a[t1++] = temp;
        }
        shuffle(a, s, mid);
        shuffle(a, mid + 1, e);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        shuffle(a , 0 , n-1);
        for(int i=0 ;i<n ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
