package ws;

import java.util.Scanner;

public class Cci_9_8 {

	/*
	static int ways[] = new int[1000] ;
	
	public static int countWaysTopDown(int n)
	{
		if(n<0) return 0;
		else if(n==0) return 1;
		else if(ways[n]>-1) return ways[n] ;
		else
		{
			ways[n] = countWaysTopDown(n-1) + countWaysTopDown(n-2) + countWaysTopDown(n-3) ;
			return ways[n] ;
		}
	}
	
	public static int countWaysBottomUp(int n)
	{
		ways[0] = 0;
		ways[1] = 1;
		ways[2] = 2;
		ways[3] = 4;
		for(int i=4;i<=n;i++)
		{
			ways[i] = ways[i-1] + ways[i-2] + ways[i-3] ;
		}
		return ways[n] ;
	}
	*/
	
	
	public static int makeChange(int n, int denom) 
	{
		int next_denom = 0;
		
		if(n==0) return 1;
		
		switch (denom) 
		{
			case 25:
					next_denom = 10;
					break;
			case 10:
					next_denom = 5;
					break;
			case 5:
					next_denom = 1;
					break;
			case 1:
					return 1;
		}

		int ways = 0;
		
		for (int i = 0; i * denom <= n; i++) 
		{
			ways += makeChange(n - i * denom, next_denom);
		}
		return ways;
	}
	
	
	public static int makeChange2(int n) 
	{
		if(n<0) return 0;
		if(n==0) return 1;
		else
			return makeChange2(n-1) + makeChange2(n-5) + makeChange2(n-10) + makeChange2(n-25) ;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		/*
		for(int i=0;i<ways.length;i++)
		{
			ways[i] = -1;
		}
		*/
		
		System.out.println("Enter the amount...") ;
		int n = s.nextInt() ;
		
		System.out.println("Numer of ways TD : "+makeChange(n,25));
		
		System.out.println("Numer of ways my appraoch TD : "+makeChange2(n));
		
		//System.out.println("Numer of ways TD : "+countWaysTopDown(n));
		
		//System.out.println("Numer of ways BU : "+countWaysBottomUp(n));
		s.close(); 
	}
}
