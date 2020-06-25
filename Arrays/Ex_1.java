package com.wipro.Arrays;

public class EX 1 {

public static void main(String[] args)
{
	int []a=new int[]{1,2,3,4,5};
	int sum=0,avg;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
		
	}
	avg=sum/a.length;
	System.out.println(sum+" "+avg);
}

}
