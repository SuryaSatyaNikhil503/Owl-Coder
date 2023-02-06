import java.util.*;
public class SortedOrNot
{
    static int isSorted(int[] arr , int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        if(arr[n-1] < arr[n-2])
        {
            return -1;
        }
        return isSorted(arr , n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr , n));
    }
}
