import java.util.*;
public class CombinationalSum
{
        static void solve(int[] arr, int i, List<Integer> lst, int target, List<List<Integer>> ans)
        {

            if(i==arr.length)
            {
                if(target==0) ans.add(new ArrayList<>(lst));
                return;
            }
            //pick elements
            if(arr[i]<=target)
            {
                lst.add(arr[i]);
                solve(arr, i, lst, target-arr[i],ans);
                lst.remove(lst.size()-1);
            }
            // not pick elements
            solve(arr, i+1, lst, target,ans);
        }

        static public List<List<Integer>> combinationSum(int[] candidates, int target)
        {
            List<Integer> arr=new ArrayList<>();
            List<List<Integer>> ans=new ArrayList<>();
            solve(candidates, 0, arr,  target, ans);
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
        System.out.println(combinationSum(candidates , target));
    }
}
