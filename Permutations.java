import java.util.*;
public class Permutations
{
    public static void permutation(List<Integer> nums, int i, int numsSize, List<List<Integer>> answer)
    {
        if(i == numsSize)
        {
            answer.add(new ArrayList<>(nums));
        }
        for(int j = i; j < numsSize; j++)
        {
            Collections.swap(nums, i, j);
            permutation(nums, i+1, numsSize, answer);
            Collections.swap(nums, i, j);
        }
    }

    public static List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> answer = new LinkedList();
        int numsSize = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            list.add(num);
        permutation(list, 0, numsSize, answer);
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> answer = permute(nums);
        for(List<Integer> i : answer)
        {
            System.out.println(i);
        }
    }
}
