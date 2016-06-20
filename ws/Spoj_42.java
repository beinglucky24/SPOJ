package ws;

import java.util.Scanner;

public class Spoj_42 {
	
	public static void main(String args[])
	{
		int n, num1, num2, num1Rev, num2Rev, result, resultRev ;
		
		Scanner sc = new Scanner(System.in) ;
		
		n = sc.nextInt() ;
		
		for(int i=0;i<n;i++)
		{
			num1 = sc.nextInt() ;
			num2 = sc.nextInt() ;
			num1Rev = num2Rev = resultRev = 0 ;
			
			
			while(num1>0)
			{
				num1Rev = num1Rev*10 + (num1%10) ;
				num1 /= 10 ;
			}
			
					
			while(num2>0)
			{
				num2Rev = num2Rev*10 + (num2%10) ;
				num2 /= 10 ;
			}
			
			result = num1Rev + num2Rev ;

			while(result>0)
			{
				resultRev = resultRev*10 + (result%10) ;
				result /= 10 ;
			}
			
			System.out.println(resultRev);
			
		}
		
		sc.close();
	}
	
}
