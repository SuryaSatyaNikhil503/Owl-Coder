import java.util.*;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {5 , 3 , 4 , 1 , 2};
        int n = arr.length;
        bubble_sort(arr , n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr , int n)
    {
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=0 ; j<n-i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr , j , j+1);
                }
            }
        }
    }
    static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
