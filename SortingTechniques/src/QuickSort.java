import java.util.*;

public class QuickSort
{
    static int partition(List<Integer> arr, int low, int high)
    {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j)
        {
            while (arr.get(i) <= pivot && i <= high - 1)
            {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1)
            {
                j--;
            }
            if (i < j)
            {
                Collections.swap(arr , i , j);
            }
        }
        Collections.swap(arr , low , j);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high)
    {
        if (low < high)
        {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr)
    {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            int t = sc.nextInt();
            arr.add(t);
        }
        arr = quickSort(arr);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
}