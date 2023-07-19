
import java.util.Scanner;
public class InsertionSort
{
    public static void insertionSort(int n , int[] arr)
    {
        //we will go till last element, so we have to run a loop till n-1;
        for(int i=0 ; i<=n-1 ; i++)
        {
            int j=i;
            //Now we are going to compare the left elements are swap them to correct positions
            while(j>0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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
        insertionSort(n , arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
