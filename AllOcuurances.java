import java.util.*;
public class AllOcuurances
{
    static int AllIndexesRecursive(int[] input, int size, int x, int[] output)
    {
        if(size == 0) return 0;
        int smallAns = AllIndexesRecursive(input, size - 1, x, output);
        if(input[size - 1] == x)
        {
            output[smallAns++] = size - 1;
        }
        return smallAns;
    }

    static void printing(int[] input, int n, int x)
    {
        int[] output = new int[n];
        int size = AllIndexesRecursive(input, n, x, output);
        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
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
        printing(arr , n , k);
        /*int[] ans = new int[n];
        int output = allOcc(arr , n , k , ans);
        for(int i=0 ; i<output ; i++)
        {
            System.out.print(ans[i]+" ");
        }*/
    }
}
