package sample.programs;

import java.util.Scanner;

public class Sumbyinstance {
	public int addition(int n1,int n2) {
		int sum;
		sum=n1+n2;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result,a,b;
		//a=4;
		//b=5;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		Sumbyinstance obj1=new Sumbyinstance();
		 result=obj1.addition(a,b);
		System.out.println("sum is:"+result);
		 

	}

}
