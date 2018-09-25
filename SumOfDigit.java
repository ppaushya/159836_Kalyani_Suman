package org.cap.demo;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		int n=num;
		int r;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits of "+num+" is "+sum);
		sc.close();
	}

}
