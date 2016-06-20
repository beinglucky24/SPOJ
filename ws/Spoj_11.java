package ws;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Spoj_11 {
	
	public static void main(String args[])
	{
		int n, num, numZeros=0, temp,lastNum=0,ct, pos=0 ;
		
		Scanner sc = new Scanner(System.in) ;
		
		int []allNums = new int[200000001] ;
		
		allNums[0] = 0;
		
		for(int j=5;j<=1000000000;j+=5)
		{
			temp=j;
			ct=0;
			while(temp%5==0)
			{
				ct++ ;
				temp /= 5;
			}
			numZeros += ct ;
			pos++ ;
			allNums[pos] = numZeros ;
		}
		
		n = sc.nextInt() ;
		
		for(int i=0;i<n;i++)
		{
			num = sc.nextInt() ;
			
			System.out.println(allNums[num/5]);
		}
		
		sc.close();
	}
	
}
