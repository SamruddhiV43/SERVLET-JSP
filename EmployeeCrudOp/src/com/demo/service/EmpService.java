package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.MyUser;

public interface EmpService {

	MyUser ValidateEmp(String uname, String pass);

	List<Employee> getallEmp();

	boolean insertEmp(Employee e);

	Employee getUpdate(int id);

	boolean updateEmp(Employee e);

	boolean deleteEmp(int id);

}
