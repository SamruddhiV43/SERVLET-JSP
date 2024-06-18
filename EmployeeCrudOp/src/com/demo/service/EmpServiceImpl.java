package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.MyUser;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{
 private EmpDao edao;
 public EmpServiceImpl()
 {
	 edao=new EmpDaoImpl();
 }
@Override
public MyUser ValidateEmp(String uname, String pass) {
	
	return edao.validateEmp(uname,pass);
}
@Override
public List<Employee> getallEmp() {
	// TODO Auto-generated method stub
	return edao.displayallEmp();
}
@Override
public boolean insertEmp(Employee e) {
	// TODO Auto-generated method stub
	return edao.AddNewEmp(e);
}
@Override
public Employee getUpdate(int id) {
	// TODO Auto-generated method stub
	return edao.EditByid(id);
}
@Override
public boolean updateEmp(Employee e) {
	// TODO Auto-generated method stub
	return edao.updateEmp(e);
}
@Override
public boolean deleteEmp(int id) {
	// TODO Auto-generated method stub
	return edao.removeEmp(id);
}
	
}
