package InheritenceDemo;
import java.util.Scanner;

public class SingleInheritenceDemo 
{
	int Rollno,Contactno;
	String Name;
	Scanner sc=new Scanner(System.in);
			
	 public void accept()
	{
		System.out.println("Enter Roll no");
		Rollno=sc.nextInt();
		System.out.println("Enter Name ");
		Name=sc.next();
		System.out.println("Enter Contact no");
		Contactno=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Roll no is :"+Rollno);
		System.out.println("Name is :"+Name);
		System.out.println("Contact no is :"+Contactno);
	}			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritenceDemo oo=new SingleInheritenceDemo();
		oo.accept();
		oo.display();
	}

}
