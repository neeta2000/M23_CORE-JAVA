package com.cg.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.entities.Employee;
import com.cg.repository.EmployeeRepo;
import com.cg.repository.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService
{

	@Override
	public boolean AddEmployee(Employee e) {
		String query="INSERT INTO EMPLOYEE VALUES(?,?)";
		EmployeeRepo repo=new EmployeeRepoImpl();
		int count=repo.AddQuery(query, e);
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 

	@Override
	public Employee updateEmployee(Employee e) 
	{
		String query="UPDATE EMPLOYEE SET EName=? WHERE(ID=?)";
		EmployeeRepo repo=new EmployeeRepoImpl();
		int count=repo.updateQuery(query, e);
		if(count==1)
		{
			Employee e1=GetEmployee(e.getID());
			return e1;
		
		}
		else
		{
			return null;
		}
	}

	@Override
	public Employee GetEmployee(int ID) 
	{
		Employee e=new Employee();
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="SELECT * FROM EMPLOYEE WHERE ID=?";
		ResultSet r=repo.RetreiveQuery(query);
		try
		{
		r.next();
		e.setID(r.getInt(1));
		e.setEname(r.getString(2));
		
		}
		catch(SQLException e1)
		{
			e1.printStackTrace();
		}
		return e;
		
	}
		

	@Override
	public List<Employee> GetEmployee() 
	{
		List<Employee> emp=new ArrayList<Employee>();
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="SELECT * FROM EMPLOYEE";
		ResultSet r=repo.RetreiveQuery(query);
		try
		{
			while(r.next())
			{
				Employee e=new Employee();
				e.setID(r.getInt(1));
				e.setEname(r.getString(2));
				emp.add(e);
			} 
		}
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return emp;
	}

	@Override
	public boolean deleteEmployee(int nextInt) {
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="DELETE FROM EMPLYOEE WHERE ID=?";
		int count=repo.deleteQuery(query,null);
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
