import java.util.*;
public class BinarySearch
{
    static int bs(int[] arr , int target , int s , int e)
    {
        int mid = s + (e-s) / 2;
        if(s > e)
        {
            return -1;
        }
        if(arr[mid] == target)
        {
            return mid;
        }
        if(arr[mid] > target)
        {
            return bs(arr , target , s , mid-1);
        }
        return bs(arr , target , mid+1 , e);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        int s = 0;
        int e = arr.length-1;
        System.out.println(bs(arr , target , s , e));
    }
}
