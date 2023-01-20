/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		HashMap<Integer , Character> map = new HashMap<>();
		
		for(int i=0 ; i<3 ; i++)
		{
		    int key = sc.nextInt();
		    char value= sc.next().charAt(0);
		    
		    map.put(key , value);
		}
		
		//map.remove(1);
		//System.out.println(map.get(2));
		
		for(int i : map.keySet())
		{
		    System.out.print(i+" ");
		} 
		
		System.out.println();
		
		for(char i : map.values())
		{
		    System.out.print(i+" ");
		} 
		
		char k = map.getOrDefault(4 , 'Z');
		System.out.println(k);
		
		/* To Copy a HashMap content to another */
		HashMap<Integer , Character> dup = new HashMap<>();
		dup.putAll(map);
		
		System.out.println(dup);
	}
}
