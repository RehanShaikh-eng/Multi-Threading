package multiThreading;
import java.util.*;
public class calciMultimethod extends Thread{
	
	static void Run()
	{
		try
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter First Number : ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Second Number : ");
			int num2 = sc.nextInt();
			
			int mulRes = num1 * num2;
			System.out.println("The Result is : " + mulRes);
		}
		
		catch (Exception r)
		{
			r.printStackTrace();
		}
	}
	
	static void add ()
	{
		try
		{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int  num1 = sc.nextInt();
		System.out.println("Enter Number : ");
		int  num2 = sc.nextInt();
		
		int addRes = num1 + num2;
		System.out.println("The Result is : " + addRes);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void sub ()
	{
		try
		{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int  num1 = sc.nextInt();
		System.out.println("Enter Number : ");
		int  num2 = sc.nextInt();
		
		int addSub = num1 - num2;
		System.out.println("The Result is : " + addSub);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void div ()
	{
		try
		{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int  num1 = sc.nextInt();
		System.out.println("Enter Number : ");
		int  num2 = sc.nextInt();
		
		int addDiv = num1 % num2;
		System.out.println("The Result is : " + addDiv);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}