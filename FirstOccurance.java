import java.util.*;
public class FirstOccurance
{
    static int firstInd(int[] arr , int n , int k , int l , int r)
    {
        if(l > r) return -1;
        int mid = (l + r) >> 1;
        if(arr[mid] == k) return mid;
        if(arr[mid] > k) return firstInd(arr , n , k , l , mid-1);
        return firstInd(arr , n , k , mid+1 , r);
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
        int k = sc.nextInt();
        System.out.println(firstInd(arr , n , k , 0 , arr.length-1));
    }

}
