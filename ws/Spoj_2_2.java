package ws;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Spoj_2_2 {
	
	public static void main(String args[])
	{
		int n, num1, num2 ;
		
		BitSet allNums = new BitSet((int) 1000000000L) ;
		BitSet allNumsProc = new BitSet((int) 1000000000L) ;
		
		allNumsProc.set(0);
		allNumsProc.set(1);
		
		Scanner sc = new Scanner(System.in) ;
		
		n = sc.nextInt() ;
		
		for(int i=0;i<n;i++)
		{
			num1 = sc.nextInt() ;
			num2 = sc.nextInt() ;
			
			num1 = (num1==1)?2:num1 ;
			
			for(int j=num1;j<=num2;j++)
			{
				boolean isPrime = true ;
				
				if(allNumsProc.get(j) && !allNums.get(j))
				{
					isPrime = false;
				}
				else if(!allNumsProc.get(j))
				{
					for(int k=2;k<= Math.sqrt(j);k++)
					{
						if(j%k==0)
						{
							isPrime = false;
							break;
						}
					}
					allNumsProc.set(j) ;
					if(isPrime) allNums.set(j);
				}
				if(isPrime) System.out.println(j);
			}
			System.out.println();
		}
		
		sc.close();
		
	}
	
}
