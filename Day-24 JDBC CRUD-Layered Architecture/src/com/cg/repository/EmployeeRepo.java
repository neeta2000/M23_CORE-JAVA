package com.cg.repository;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cg.entities.Employee;

public interface EmployeeRepo 
{
	Statement createStatement();
	PreparedStatement createPrepareStatement(String query);
	public ResultSet RetreiveQuery(String query);//retreive
	public int AddQuery(String query,Employee e);//add
	public int updateQuery(String query,Employee e);//update
	public int deleteQuery(String query,Employee e);//delete
	int deleteQuery(String query);
	

}
