package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.MyUser;

public interface EmpDao {

	MyUser validateEmp(String uname, String pass);

	List<Employee> displayallEmp();

	boolean AddNewEmp(Employee e);

	Employee EditByid(int id);

	boolean updateEmp(Employee e);

	boolean removeEmp(int id);

}
