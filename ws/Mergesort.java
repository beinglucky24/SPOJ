package ws;

import java.util.Random;

public class Mergesort {

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
		
		mergesort(data,0,19) ;
	
		for(int i=0;i<20;i++)
		{
			System.out.print(data[i]+"\t");
		}
		
		System.out.println();
	}
	
	static void mergesort(int data[],int lo,int hi)
	{
		if(lo<hi)
		{
			int mid = (lo+hi)/2 ;
			mergesort(data,lo,mid) ;
			mergesort(data,mid+1,hi) ;
			merge(data,lo,hi) ;
		}
	}
	
	static void merge(int data[],int lo,int hi)
	{
		int i,j,ct ;
		int mid = (lo+hi)/2 ;
		int temp[] = new int[data.length] ;
		
		i=lo;
		j=mid+1 ;
		ct=lo;
		
		while(i<=mid && j<=hi)
		{
			if(data[i]<=data[j])
			{
				temp[ct] = data[i] ;
				i++ ;
			}
			else
			{
				temp[ct] = data[j] ;
				j++ ;
			}
			ct++ ;
		}
		
		while(i<=mid)
		{
			temp[ct] = data[i] ;
			i++ ;
			ct++ ;
		}
		
		while(j<=hi)
		{
			temp[ct] = data[j] ;
			j++ ;
			ct++ ;
		}
		
		for(i=lo;i<=hi;i++)
		{
			data[i] = temp[i] ;
		}
	
	}
}
