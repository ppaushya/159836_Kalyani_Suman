package org.cap.demo;

import java.util.Scanner;

public class PrimeNum {

	public static boolean isPrime(int n)
	{
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Prime nums b/w 1 to 1000 are:");
		for(int i=1;i<=1000;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
