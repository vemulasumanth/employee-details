//first class Employee.java//
package Employee;
 public class Employee {
static String arr[][]= new String[3][4]; 
	public static void main(String[] args) {
		Methods obj1=new Methods();
		obj1.Employeeinputinf();//calling method which contains in second class//
        obj1.Employeeoutputinf();//calling method which contains in second class//
	}

}
package Employee;
import java.util.Scanner;
 public class Methods	
{
	static void Employeeinputinf()
	{
		Employee obj=new Employee();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("enter the details of"+i+"as 1.name 2.year of joining 3.salary 4.address");
		for(int j=0;j<4;j++)
		{
			obj.arr[i][j]=s.next();
		}
		}
	}
	void Employeeoutputinf()
	{
		Employee obj1=new Employee();
		for(int i=0;i<3;i++)
		{
			System.out.println("details of Employee"+i+":");
			
		for(int j=0;j<4;j++)
		{
			if(j==0)
			{
				System.out.print("Name:");	
			}
			else if(j==1)
			{
				System.out.print("Year of joining:");
			}
			else if(j==2)
			{
				System.out.print("salary:");
			}
			else
			{
				System.out.print("Address:");
			}
			System.out.println(obj1.arr[i][j]);
		}
	}
	
	}
}
