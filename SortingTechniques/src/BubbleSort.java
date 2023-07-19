
import java.util.Scanner;
public class BubbleSort
{
    public static void bubbleSort(int n , int[] arr)
    {
        //we are starting out outer loop from n-1 and going till 1;
        for(int i=n-1 ; i>=1 ; i--)
        {
            //inner loop will start from 0 and goes till i-1, because we should not consider the sorted portion
            int swaps = 0;
            for(int j=0 ; j<=i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps = 1;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Taking input from user
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        bubbleSort(n , arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
