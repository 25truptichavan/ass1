import java.util.Scanner;

class Palindrome
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("PALINDROME CHECKER ");
     System.out.println("1. Check String");
     System.out.println("2. Check Number");
     System.out.print("Enter your choice: ");
     int ch=sc.nextInt();

    switch (ch)
    {
      case 1-> {
        System.out.println("Enter a string :");
        String str=sc.nextLine();
        sc.nextLine();
        if(isPalindrome(str))
        {
        System.out.println(str+"is palindrome");          
        }
	else 
        {
        System.out.println(str+"is not palindrome");
        }
    }
     case 2->{
        System.out.println("Enter a Number :");
        int num=sc.nextInt();

	 if(isPalindrome(num))
        {
        System.out.println(num+"is palindrome");          
        }
	else 
        {
        System.out.println(num+"is not palindrome");
        }
    }
    default ->{ System.out.println("Invalid choice");
              break;
        }
  } 
 }
public static boolean isPalindrome(String str)
 {
   int l=0;
   int r=str.length()-1;

    while(l<r)
    {
      if (str.charAt(l) != str.charAt(r)){ return false;}
     l++;
     r--;
    }
   return true;
 }
 
static boolean isPalindrome(int num)
  {
    int temp = num;
    int rev = 0;

    while(temp > 0)
    {
      int r = temp % 10;
      rev = rev * 10 + r;
      temp = temp / 10;
    }

    return num == rev;
  }


}