
import java.sql.SQLOutput;
import java.util.Scanner;
public class SelectionSort
{
    public static void selectionSort(int n , int[] arr)
    {
        //According to our algo we need to run one loop from 0 to n-2 in order to swap
        for(int i=0 ; i<=n-2 ; i++)
        {
            //let us consider the minimum element is at the 'i'th index.
            int mini = i;
            //now let us run the inner loop from 'i'th index to n-1 in order to find minimum
            for(int j=i ; j<=n-1 ; j++)
            {
                //we will check the every element index and uodate the minimum if the taken minimum is less than the 'j'th index.
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
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
        selectionSort(n , arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
