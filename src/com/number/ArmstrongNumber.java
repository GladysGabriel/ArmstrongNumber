package com.number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args){

		int arm=0,n,rem,c;
		System.out.println("Enter a number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		c=n;
		while(n>0) {
		rem=n%10;
		arm=arm+(rem*rem*rem);
		n=n/10;
		}
		if(c==arm)
			System.out.println(c+" is a armstrong number");
		else
			System.out.println(c+" is not a armstrong number");
		}
}