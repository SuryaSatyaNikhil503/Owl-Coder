import java.util.*;
public class SubSets
{
    static List<List<Integer>> finalList;
    public static List<List<Integer>> subsets(int[] nums)
    {
        finalList = new ArrayList<>();
        subsetsHelper(nums, 0, new ArrayList<>());
        return finalList;
    }
    public static void subsetsHelper(int[] nums, int i, List<Integer> list)
    {
        if(i == nums.length)
        {
            finalList.add(new ArrayList<>(list));
            return;
        }

        //non picking
        subsetsHelper(nums, i+1, list);

        //picking element
        list.add(nums[i]);
        subsetsHelper(nums, i+1, list);
        //remove added element from list
        list.remove(list.size()-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        //List<Integer> temp = new ArrayList<>();
        System.out.print(subsets(arr));
    }
}
