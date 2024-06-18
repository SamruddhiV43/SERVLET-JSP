package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.MyUser;

public class EmpDaoImpl implements EmpDao {
	
	static Connection conn;
	static PreparedStatement  pvalidate,pselect,pinsert,pgetbyid,pupdate,pdelete;
	static {
		conn=DBUtil.getMyConnection();
		try {
			pvalidate=conn.prepareStatement("select username,password,role from logindetails where username=? and password=?");
			pselect =conn.prepareStatement("select * from employee");
			pinsert=conn.prepareStatement("Insert into employee values(?,?,?,?,?,?)");
			pgetbyid=conn.prepareStatement("select * from employee where id=?");
			pupdate=conn.prepareStatement("update employee set name=?,gender=?,salary=?,email=?,position=? where id=?");
			pdelete=conn.prepareStatement("delete from employee where id=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MyUser validateEmp(String uname, String pass) {
		
		try {
			pvalidate.setString(1, uname);
		    pvalidate.setString(2, pass);
			ResultSet rs=pvalidate.executeQuery();
			if(rs.next())
			{
				MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
				return user;	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> displayallEmp() {
		try {
			ResultSet rs=pselect.executeQuery();
			List<Employee> elist=new ArrayList<Employee>();
			while(rs.next())
			{
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
				elist.add(e);
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean AddNewEmp(Employee e) {
		try {
			pinsert.setInt(1, e.getId());
			pinsert.setString(2,e.getName());
			pinsert.setString(3,e.getGender());
			pinsert.setDouble(4,e.getSalary());
			pinsert.setString(5,e.getEmail());
			pinsert.setString(6,e.getPosition());
			
			
	 int n=pinsert.executeUpdate();
			if(n>0)
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee EditByid(int id) {
		try {
			pgetbyid.setInt(1, id);
			ResultSet rs = pgetbyid.executeQuery();
			if(rs.next()) {
				Employee e =new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
				return e;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateEmp(Employee e) {
		
		try {
			pupdate.setInt(6, e.getId());
			pupdate.setString(1, e.getName());
			pupdate.setString(2, e.getGender());
			pupdate.setDouble(3, e.getSalary());
			pupdate.setString(4, e.getEmail());
			pupdate.setString(5, e.getPosition());
			
			int n=pupdate.executeUpdate();
			if(n>0)
				return true;
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEmp(int id) {
		try {
			pdelete.setInt(1, id);
			int n=pdelete.executeUpdate();
			if(n>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
