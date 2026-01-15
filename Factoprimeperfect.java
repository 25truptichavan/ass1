import java.util.Scanner;
class Factoprimeperfect
{
	static int factorial(int num)
	{
		int fact=1;
		for(int i=2;i<num;i++) fact*=i;
		return fact;
	}
	static boolean isprime(int num)
	{
		if(num<=1) return false;
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num % i==0) return false;
		return true;
	}
	static boolean isperfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
			if(num % i==0) sum+=i;
	       return sum==num;
	}
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);

while(true){
	System.out.println("1.Find Factorial\n");
	 System.out.println("2.Check prime\n");
	 System.out.println("3.Check Perfect Number\n");
	 System.out.println("4.Exit\n");
	 System.out.println("Enter your choice:");
	 int choice=sc.nextInt();
	 if(choice==4) break;

	  System.out.println("Enter Number:");
	  int num=sc.nextInt();

	  switch(choice)
	  {
		  case 1->  System.out.println("Factorial of " +num+" is " +(factorial(num)));
		  case 2->  System.out.println(isprime(num) ? "Prime" : "Not prime");
		  case 3->  System.out.println(isperfect(num) ? "Perfect" : "Not perfect");

	default -> System.out.println("Enter correct option\n");
	  }
}
}
}

			   

