import java.util.Scanner;

class StudentDemo
{
	String name;
	int rollno;
	String course;
	int [] mark=new int[3];
	int totalmark;
	float percentage;
	public static void main(String[] args)
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
	void accept()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter name of student:");
		name=sc.nextLine();

		System.out.println("Enter Roll number:");
		rollno=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter course name:");
		course=sc.nextLine();
		sc.nextLine();

		System.out.println("Enter marks in three subject:");
		for(int i=0;i<3;i++)
		{
			System.out.println("Subject "+(i+1)+":");
			mark[i]=sc.nextInt();
		}
		sc.nextLine();
	}
public void result(){
	{
		totalmark=0;
		for(int i=0;i<3;i++)
		{
			totalmark +=mark[i];
		}
		percentage=totalmark/3.0F;
	}
}
	public void display(){
		System.out.println("Name of student:"+name);
		System.out.println("Roll number:" +rollno);
		System.out.println("Course:"+course);
		System.out.println("Marks in three Subject :");
			for(int i=0;i<3;i++)
			{
				System.out.println("Subject "+(i+1)+":"+mark[i] );
			}
			System.out.println("Total marks:"+totalmark);
			System.out.println("Percentage:"+percentage);

	}
}
