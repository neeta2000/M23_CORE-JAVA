package com.cg.client;

import java.util.Scanner;
import java.util.List;
import com.cg.entities.Employee;
import com.cg.services.EmployeeService;
import com.cg.services.EmployeeServiceImpl;

public class Client 
{

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		do
		{
			System.out.println("Enter the choice"
					+"\n1.Retrieve a particular employee"
					+"\n2.Retrive all employee"
					+"\n3.Delete a employee"
					+"\n4.Insert an Employee"
					+"\n5.Update an Employee"
					+"\n-1:Exit");
		
			switch(choice)
			{
			case 1:
			{
					System.out.println("Enter the ID to retrieve employee");
					Employee e = null;
					try
					{
						e=service.GetEmployee(s.nextInt());
					}
					catch(Exception e1)
					{
						e1=null;
					}
					if(e!=null)
						System.out.println(e);
					else
						System.out.println("Employee details not found");
			}
			break;
			case 2:
			{
				List<Employee>emp=service.GetEmployee();
				for(Employee i:emp)
				{
					System.out.println(i);
				}
			}
			break;
			case 3:
			{
				System.out.println("Enter the ID to delete employee");
				boolean success=service.deleteEmployee(s.nextInt());
				if(success)
				{
					System.out.println("Successfully Deleted");
				}
				else
				{
					System.out.println("Details not found");
				}
			}
			break;
			case 4:
			{
				System.out.println("Emter the details of employee");
				Employee e=new Employee(s.nextInt(),s.nextLine());
				if(service.AddEmployee(e))
				{
					System.out.println("Successfully added");
				}
				else
					System.out.println("Something went wrong in creation");
				
			}
			break;
			case 5:
			{
				System.out.println("Enter the ID of employee that u want to update");
				Employee e=new Employee();
				e.setID(s.nextInt());
				System.out.println("Enter the update details");
				s.nextLine();
				e.setEname(s.nextLine());
				Employee e1=service.updateEmployee(e);
				if(e1!=null)
					System.out.println(e);
				else
					System.out.println("Employee details not found");
		    }
			break;
			case -1:
			{
				System.out.println("Thank You and Exit");
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}
			break;
			}
		}while(choice>0);
	}
}

				
		

	


