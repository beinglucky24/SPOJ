package ws;

import java.util.Scanner;

public class Spoj_24 
{
	public static void main(String args[])
	{
		int n, num, numZeros=0, temp,carry ;
		
		Scanner sc = new Scanner(System.in) ;
		
		String []allFacs = new String[101] ;
		
		allFacs[0] = "1";
		
		for(int i=1;i<=100;i++)
		{
			StringBuilder sb = new StringBuilder() ;
			carry=0;
			for(int j=allFacs[i-1].length()-1;j>0;j++)
			{
				temp = ((allFacs[i-1].charAt(j)-48)*i)+carry ;
				sb.append(temp%10) ;
				carry = temp/10 ;
			}
			
			temp = ((allFacs[i-1].charAt(0)-48)*i)+carry ;
			
			allFacs[i] = temp + sb.reverse().toString();
			System.out.println(allFacs[i]);
		}
		
		n = sc.nextInt() ;
		
		for(int i=0;i<n;i++)
		{
			num = sc.nextInt() ;
			
			System.out.println(allFacs[num]);
		}
		
		sc.close();
	}
}
