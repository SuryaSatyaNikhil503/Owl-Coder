import java.util.*;
public class CombinationalSum2
{
    static void findCombos(int[] arr , int target , int ind , List<List<Integer>> ans , List<Integer> ds)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind ; i<arr.length ; i++)
        {
            if(i > ind && arr[i] == arr[i-1])
            {
                continue;
            }
            if(arr[i] > target)
            {
                break;
            }
            ds.add(arr[i]);
            findCombos(arr , target-arr[i] , i+1, ans , ds);
            ds.remove(ds.size()-1);
        }
    }
    static List<List<Integer>> answer(int[] candidates , int target)
    {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombos(candidates , target , 0 , ans , new ArrayList<>());
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(answer(candidates , target));
    }
}
