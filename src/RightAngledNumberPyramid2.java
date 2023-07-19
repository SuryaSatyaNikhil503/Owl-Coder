/* Problem Statement: Given an integer N, print the following pattern :

Here, N = 5.

Examples:

Input Format: N = 3
Result:
1
2 2
3 3 3

Input Format: N = 6
Result:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6 */


import java.util.*;
public class RightAngledNumberPyramid2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
