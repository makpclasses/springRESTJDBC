package com.amky.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.amky.model.*;
 
@Repository
public class EmployeeDAO
{
    private Employees list = new Employees();
 // Spring Boot will create and configure DataSource and JdbcTemplate
 	// To use it, just @Autowired
     @Autowired
     private JdbcTemplate jdbcTemplate;

//    static
//    {
//        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "lgupta@gmail.com"));
//        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
//        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
//    }
     
//    public Employees getAllEmployees()
//    {
//        return list;
//    }
     
   	
    public Employees getAllEmployees(){
       	List employeeListFromQuery;
        
        	employeeListFromQuery= jdbcTemplate.query(
                    "select * from employee.employee",
                    (rs, rowNum) ->
                            new Employee(
                                    rs.getInt("id"),
                                    rs.getString("firstName"),
                                    rs.getString("lastName"),
                                    rs.getString("email")
                            )
            );
        	list.setEmployeeList(null);
        	for(int i=0; i<employeeListFromQuery.size();i++){
        		list.getEmployeeList().add((Employee)employeeListFromQuery.get(i));
        		System.out.println(employeeListFromQuery.get(i).toString());
        	

	    	}
	    	return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}