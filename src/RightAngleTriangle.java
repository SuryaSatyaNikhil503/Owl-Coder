/* Problem Statement: Given an integer N, print the following pattern :
Input Format: N = 3
Result:
*
* *
* * *

Input Format: N = 6
Result:
*
* *
* * *
* * * *
* * * * *
* * * * * * */

import java.util.*;
public class RightAngleTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
