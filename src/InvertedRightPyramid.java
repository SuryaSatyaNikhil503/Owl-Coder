/* Problem Statement: Given an integer N, print the following pattern :

Examples:

Input Format: N = 3
Result:
* * *
* *
*

Input Format: N = 6
Result:
* * * * * *
* * * * *
* * * *
* * *
* *
*/

import java.util.*;
public class InvertedRightPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=(n-i+1) ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
