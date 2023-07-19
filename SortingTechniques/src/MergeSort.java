import java.util.*;

public class MergeSort
{
    public static void merge(int[] arr , int low , int mid , int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid)
        {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high)
        {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low ; i<=high ; i++)
        {
            arr[i] = temp.get(i-low);
        }
    }
    public static void mergeSort(int[] arr , int low , int high)
    {
        int mid = (low + high) / 2;
        //base case
        if(low >= high)
        {
            return;
        }
        mergeSort(arr , low , mid);
        mergeSort(arr , mid+1 , high);
        merge(arr , low , mid , high);
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
        mergeSort(arr , 0 , n-1);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
