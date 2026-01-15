import java.util.Scanner;

class Studentme
{
 String name,course;
    int rno , tmarks;
    float percentage;
    int [] marks=new int[3];

   void accept()
   {
    Scanner sc=new Scanner(System.in);
   
       System.out.println("Enter name of student:");
        name=sc.nextLine();

	System.out.println("Enter Roll number:");
	rno=sc.nextInt();
	sc.nextLine();

	System.out.println("Enter course name:");
	course=sc.nextLine();
	
	System.out.println("Enter Marks in Three Subject:");
	for(int i=0 ; i<3 ; i++)
 	{
         System.out.println("subject"+ (i+1) +":");
	  marks[i]=sc.nextInt();
	}
    }
  
  void result()
  {
    tmarks=0;
    for(int i=0 ; i<3 ; i++)
 	{
	   tmarks =tmarks + marks[i];
	}
    percentage = tmarks/3;
   
  }
  
  void display()
  {
   System.out.println("Student name:"+name);
    System.out.println("Roll NO:"+rno);
    System.out.println("Course:"+course);
    System.out.println("Marks in Three Subject:");
	for(int i=0 ; i<3 ; i++)
 	{
	   System.out.println("subject"+ (i+1) +":"+ marks[i]);
	}
   System.out.println("Total marks:"+tmarks);
    System.out.println("Percentage:"+percentage); 
  }
  public static void main(String [] args)
 {
		StudentDemo s1=new StudentDemo();
		s1.accept();
		s1.result();
		s1.display();

		StudentDemo s2=new StudentDemo();
                s1.accept();
                s1.result();
                s1.display();
  
 }
}