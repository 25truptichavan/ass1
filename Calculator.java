import java.util.Scanner;
class Calculator
{
        public static void main (String [] args)
        {
                Scanner sc= new Scanner(System.in);
                while(true){
                        System.out.println("1.Addition\n");
                        System.out.println("2.Subtraction\n");
                        System.out.println("3.Multiplication\n");
                        System.out.println("4.Division\n");
                        System.out.println("5.Exit\n");
                        System.out.println("Enter your choice:");
                        int choice=sc.nextInt();
                        if(choice==5)break;
                        System.out.println("Enter first number:");
                        int a=sc.nextInt();
                        System.out.println("Enter second number:");
                        int b=sc.nextInt();
                        switch(choice)
                        {
                                case 1-> System.out.println("Addition of "+ a + "and" + b + "is" + (a+b));
                                case 2-> System.out.println("Subtraction  of "+ a + "and" + b + "is" + (a-b));
                                case 3-> System.out.println("Multiplication of "+ a + "and" + b + "is" + (a*b));
                                case 4-> {if(b!=0)
                                        {
                                         System.out.println("Division of "+ a + "and" + b + "is" + (a/b));
                                        }
                                        else
                                        {
                                        System.out.println("Cannot divide by zero\n");
                                        }
                                }
                                 default->    System.out.println("Enter correct option\n");
                        }
                }
	}
}




