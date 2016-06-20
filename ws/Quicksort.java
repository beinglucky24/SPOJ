package ws;

import java.util.Random;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = new int[100] ;
		
		Random rn = new Random();
		
		for(int i=0;i<20;i++)
		{
			data[i] = rn.nextInt() %100 ;
			data[i] = data[i]>0 ? data[i]:data[i]*-1 ;
		}
		
		for(int i=0;i<20;i++)
		{
			System.out.print(data[i]+"\t");
		}
		
		System.out.println();
		
		quicksort(data,0,19) ;
	
		for(int i=0;i<20;i++)
		{
			System.out.print(data[i]+"\t");
		}
		
		System.out.println();
	}
	
	static void quicksort(int data[],int lo,int hi)
	{
		if(lo<hi)
		{
			int part = partition(data,lo,hi) ;
			quicksort(data,lo,part) ;
			quicksort(data,part+1,hi) ;
		}
	}
	
	static int partition(int data[],int lo,int hi)
	{
		int i,j ;
		int pivot = data[(lo+hi)/2] ;
		
		for(i=lo,j=hi;i<=j;)
		{
			while(data[i]<pivot) i++ ;
			while(data[j]>pivot) j-- ;
			
			if(i<=j)
			{
				int temp = data[i] ;
				data[i] = data[j] ;
				data[j] = temp ;
				i++ ;
				j-- ;
			}
		}
		
		return (i-1) ;
	}
}
